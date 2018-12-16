import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.*;
import java.sql.*;
import javax.swing.*;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.*;
import javax.swing.JFrame;
import javax.swing.JInternalFrame.JDesktopIcon;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.UIManager;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class dbConnect {
	Connection conn=null;
	public static Connection dbConnector()
	{
		 try {
			 Class.forName("com.mysql.jdbc.Driver").newInstance();
			 
			//Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/travellers","root","");
		//	JOptionPane.showMessageDialog(null,"Connection Successful.");
			return conn;
			 
		} catch (Exception e) 
		 {
		JOptionPane.showMessageDialog(null, e);
		return null;
		}
	}

}
