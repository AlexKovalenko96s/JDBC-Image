package ua.kas.JDBC_Image;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.mysql.jdbc.PreparedStatement;

import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

	@FXML
	TextField textID;
	@FXML
	TextField textNAME;
	@FXML
	TextArea area;
	@FXML
	ImageView imv;
	String s;

	public void browse(ActionEvent e) {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
		fileChooser.addChoosableFileFilter(filter);
		int result = fileChooser.showSaveDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fileChooser.getSelectedFile();
			String path = selectedFile.getAbsolutePath();
			System.out.println(path);
			String ss = path.substring(path.indexOf("&"));
			s = path;
			imv.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("/res/" + ss)));

		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("No Data");
		}
	}

	public void add(ActionEvent e) throws SQLException, FileNotFoundException {
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/freemove", "root", "root");
		java.sql.PreparedStatement myStmt = myConn
				.prepareStatement("insert into cats(id,name,area,pic) values (?,?,?,?)");
		InputStream is = new FileInputStream(new File(s));
		myStmt.setString(1, textID.getText());
		myStmt.setString(2, textNAME.getText());
		myStmt.setString(3, area.getText());
		myStmt.setBlob(4, is);
		myStmt.executeUpdate();
		System.out.println("Complet!");
	}

	public void see(ActionEvent e) throws SQLException, IOException {

		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/freemove", "root", "root");
		String n = textNAME.getText();
		java.sql.PreparedStatement ps = myConn.prepareStatement("select * from cats where name=?");
		ps.setString(1, n);
		ResultSet myRs = ps.executeQuery();

		Blob img;
		byte[] imgData = null;
		
		while (myRs.next()) {
			textID.setText(myRs.getString("id"));
			textNAME.setText(myRs.getString("name"));
			area.setText(myRs.getString("area"));
			img = myRs.getBlob("pic");
			imgData = img.getBytes(1, (int) img.length());
			
			
			String dirName="C:\\Users\\KLUBnyaKprO\\Desktop";
			BufferedImage imag=ImageIO.read(new ByteArrayInputStream(imgData));
			imv.setImage(SwingFXUtils.toFXImage(imag, null));
			
			/*
			 * извлекалка на рабочий стол
			 */	
			//ImageIO.write(imag, "jpg", new File(dirName,"&"+myRs.getString("name")+".jpg"));	
			/* 
			 */
			
			
		}
		System.out.println("complet");
	}
}
