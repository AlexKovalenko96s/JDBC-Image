package ua.kas.JDBC_Image;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Controler_pic implements Initializable{

	@FXML
	ImageView imv1;
	@FXML
	ImageView imv2;
	@FXML
	ImageView imv3;
	@FXML
	ImageView imv4;
	@FXML
	ImageView imv5;
	@FXML
	ImageView imv6;
	@FXML
	ImageView imv7;
	@FXML
	ImageView imv8;
	@FXML
	ImageView imv9;
	String s1;
	String s2;
	String s3;
	String s4;
	String s5;
	String s6;
	String s7;
	String s8;
	String s9;
	@FXML TextField textID;
	
	public void select_1(ActionEvent e) {
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
			s1 = path;
			imv1.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("/img/" + ss)));

		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("No Data");
		}
	}
	public void select_2(ActionEvent e) {
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
			s2 = path;
			imv2.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("/img/" + ss)));

		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("No Data");
		}
	}
	public void select_3(ActionEvent e) {
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
			s3 = path;
			imv3.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("/img/" + ss)));

		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("No Data");
		}
	}
	public void select_4(ActionEvent e) {
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
			s4 = path;
			imv4.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("/img/" + ss)));

		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("No Data");
		}
	}
	public void select_5(ActionEvent e) {
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
			s5 = path;
			imv5.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("/img/" + ss)));

		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("No Data");
		}
	}
	public void select_6(ActionEvent e) {
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
			s6 = path;
			imv6.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("/img/" + ss)));

		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("No Data");
		}
	}
	public void select_7(ActionEvent e) {
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
			s7 = path;
			imv7.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("/img/" + ss)));

		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("No Data");
		}
	}
	public void select_8(ActionEvent e) {
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
			s8 = path;
			imv8.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("/img/" + ss)));

		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("No Data");
		}
	}
	public void select_9(ActionEvent e) {
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
			s9 = path;
			imv9.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("/img/" + ss)));

		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("No Data");
		}
	}
	
	public void add(ActionEvent e) throws SQLException, FileNotFoundException {
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/freemove", "root", "root");
		//java.sql.PreparedStatement myStmt = myConn
				//.prepareStatement("update must_see set i1=?,i2=?,i3=?,i4=?,i5=?,i6=?,i7=?,i8=?,i9=? where id=?");
		String id = textID.getText();
		
		try{
			InputStream is1 = new FileInputStream(new File(s1));
			java.sql.PreparedStatement myStmt = myConn
					.prepareStatement("update must_see set i1=? where id=?");
			myStmt.setBlob(1, is1);
			myStmt.setString(2, id);
			myStmt.executeUpdate();
		}catch(Exception ex){}
		
		try{
			InputStream is2 = new FileInputStream(new File(s2));
			java.sql.PreparedStatement myStmt = myConn
					.prepareStatement("update must_see set i2=? where id=?");
			myStmt.setBlob(1, is2);
			myStmt.setString(2, id);
			myStmt.executeUpdate();
		}catch(Exception ex){}
		
		try{
			InputStream is3 = new FileInputStream(new File(s3));
			java.sql.PreparedStatement myStmt = myConn
					.prepareStatement("update must_see set i3=? where id=?");
			myStmt.setBlob(1, is3);
			myStmt.setString(2, id);
			myStmt.executeUpdate();
		}catch(Exception ex){}
		
		try{
			InputStream is4 = new FileInputStream(new File(s4));
			java.sql.PreparedStatement myStmt = myConn
					.prepareStatement("update must_see set i4=? where id=?");
			myStmt.setBlob(1, is4);
			myStmt.setString(2, id);
			myStmt.executeUpdate();
		}catch(Exception ex){}
		
		try{
			InputStream is5 = new FileInputStream(new File(s5));
			java.sql.PreparedStatement myStmt = myConn
					.prepareStatement("update must_see set i5=? where id=?");
			myStmt.setBlob(1, is5);
			myStmt.setString(2, id);
			myStmt.executeUpdate();
		}catch(Exception ex){}
		
		try{
			InputStream is6 = new FileInputStream(new File(s6));
			java.sql.PreparedStatement myStmt = myConn
					.prepareStatement("update must_see set i6=? where id=?");
			myStmt.setBlob(1, is6);
			myStmt.setString(2, id);
			myStmt.executeUpdate();
		}catch(Exception ex){}
		
		try{
			InputStream is7 = new FileInputStream(new File(s7));
			java.sql.PreparedStatement myStmt = myConn
					.prepareStatement("update must_see set i7=? where id=?");
			myStmt.setBlob(1, is7);
			myStmt.setString(2, id);
			myStmt.executeUpdate();
		}catch(Exception ex){}
		
		try{
			InputStream is8 = new FileInputStream(new File(s8));
			java.sql.PreparedStatement myStmt = myConn
					.prepareStatement("update must_see set i8=? where id=?");
			myStmt.setBlob(1, is8);
			myStmt.setString(2, id);
			myStmt.executeUpdate();
		}catch(Exception ex){}
		
		try{
			InputStream is9 = new FileInputStream(new File(s9));
			java.sql.PreparedStatement myStmt = myConn
					.prepareStatement("update must_see set i9=? where id=?");
			myStmt.setBlob(1, is9);
			myStmt.setString(2, id);
			myStmt.executeUpdate();
		}catch(Exception ex){}
			
			System.out.println("Complet!");		
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
