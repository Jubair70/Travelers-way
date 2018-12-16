import java.awt.*;
import java.sql.*;

import javax.swing.*;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

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

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Locale;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.plaf.SliderUI;



public class FirstIn extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdminName;
	private JPasswordField pwdPassword;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtContactNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		try {
			Thread s=new Thread(new as());
			s.start();
			s.sleep(2000);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					FirstIn frame = new FirstIn();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}

	
	String important;
	/**
	 * Create the frame.
	 */
	//TODO Shanta
	JPanel  panelHealthrisk=new JPanel();
	JPanel  panelhospitalinfo=new JPanel();
	JPanel  paneltravelagency=new JPanel();
	JPanel  panelpolicestation=new JPanel();
	JPanel  panelsafetyinfo=new JPanel();
	JPanel  panelweatherinfo=new JPanel();
	private JTable table_travelagency;
	private JTable table_localpolice;
	private JTable table_hospitalinfo;
	JComboBox comboBox_11=new JComboBox();
	JButton btnNearestHospital = new JButton("Nearest Hospital");
	JLabel lblNewLabel_6 = new JLabel("Choose your destination");
	//TODO Shanta
	
	// TODO: Bus Booking 
	
	
	
	
	
	JSlider slider = new JSlider(0,23);
	CardLayout cardLayout = new CardLayout(0, 0);
	JPanel panelJoin = new JPanel();
	JPanel panelrequestinterview=new JPanel();
	JPanel Mainpanel = new JPanel();
	JPanel panelBusBooking = new JPanel();
	JPanel panelRequest = new JPanel();
	JPanel panelcheckbusbooking = new JPanel();
	JPanel panelChecking = new JPanel();
	JPanel panelBusRequest = new JPanel();
	JPanel panelUpdateBusInfo = new JPanel();
	JPanel paneladdbusinfo = new JPanel();
	// JButton btnNewButton_15;
	JButton btnNewButton_9 = new JButton("Health Risks");
	JButton btnRefresh = new JButton("Refresh");
	JButton btnRequestInterview = new JButton("Request For Interview");
	JButton btnRequestFlight = new JButton("Requests For Flight");
	JButton btnRequestBus = new JButton("Reuests For Bus");
	JButton btnLogout = new JButton("");
	JButton btnAddGuide = new JButton("Add Guide Member");
	JButton btnUpdateFlight = new JButton("Update Flight Info");
	JButton btnUpdateRoom = new JButton("Update Room Info");
	JButton btnUpdatePac = new JButton("Update Tour Packages");
	JButton btnUpdateBus = new JButton("Update Bus Info ");
	JButton btnPendingRequest = new JButton("");
	JButton btnRequestRoom = new JButton("Request For Room");
	JButton btnRejected = new JButton("Rejected");
	JButton btnAddBusInfo = new JButton("Add Bus Info");
	JButton btnaddflightinfo = new JButton("Add Flight Info");
	JComboBox comboBox_Experience = new JComboBox();
	JSlider slider_1 = new JSlider(0,23);
	JComboBox LeavingFrom = new JComboBox();
	JComboBox GoingTo = new JComboBox();
	JComboBox comboBoxID = new JComboBox();
	JComboBox comboBox_Seats = new JComboBox();
	JComboBox comboBox_IDr = new JComboBox();
	JComboBox comboBox_Contact = new JComboBox();
	JComboBox comboBox_IDUpdatebus = new JComboBox();
	JComboBox comboBox_Timeupdatebus = new JComboBox();
	JComboBox comboBoxdest = new JComboBox();
	JButton btnUpdatei = new JButton("Update");
	JButton btnRefreshUpdate = new JButton("Refresh");
	JPanel paneladdguide=new JPanel();
	Connection connection = null;
	Connection connection1 = null;
	JTable tableBusBookingRequest;
	JTextField txtContactNumber_1;
	private JTable table;
	private JTable table_checkbusbooking;
	private JTextField textFielddefault;
	private JTable table_UpdateBus;
	private JTextField txtAvailableSeats;
	private JTextField txtFare;
	private JTable table_1;
	private JTextField textFieldIDaddinfobus;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private ObservingTextField txtYyyymmdd;
	private JTextField txtHrrminsec;
	private JTextField textField_6;
	private JTextField textField_7;
	JButton btnAddInfo = new JButton("Add Info");
	JButton btnNewButton_3 = new JButton("Refresh");
	JComboBox comboBox005 = new JComboBox();
	JButton btnaddroominfo = new JButton("Add Room Info");
	JPanel panelguide=new JPanel();
	JButton btnfindguide = new JButton("Find Your Guide");
	JComboBox comboBox_region = new JComboBox();
	
	JButton btnsendrequest = new JButton("Send Your Request");
	public void IDfill()
	{//"+ txtContactNumber.getText() + "
		try {
			String a="select `ID` from requestforinterview where Contact_Number='"+txtContactNumber.getText()+"'";
			PreparedStatement pst1 = connection.prepareStatement(a);
			ResultSet res1=pst1.executeQuery();
			//String s=res1.getString("Name");
			if(res1.next())
			JOptionPane.showMessageDialog(null,"Your Id Is "+res1.getInt("ID"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public Locale getLocale(String loc)
	{
		if(loc!=null && loc.length()>0)
		{
			return new Locale(loc);
		}
		else {
			return Locale.US;
		}
	}
	public void playSound(String soundName)
	 {
	   try 
	   {
	    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
	    Clip clip = AudioSystem.getClip();
	    clip.open(audioInputStream);
	    clip.start( );
	   }
	   catch(Exception ex)
	   {
	     System.out.println("Error with playing sound.");
	     ex.printStackTrace( );
	   }
	 }
	public void fillcombobox(String a) {
		try {
			if(a.equals("busbooking"))
			{String query = "SELECT `ID`, `Agency/Company Name`,`Time`, `Available Seats`, `Fare Per Seat(BDT)` FROM `"+a+"` WHERE `Leaving From` = '"
					+ LeavingFrom.getSelectedItem()
					+ "' AND `Going To` = '"
					+ GoingTo.getSelectedItem()
					+ "' AND `Date` = '"
					+ textFieldcal.getText() + "'";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet res = pst.executeQuery();
			comboBoxID
					.setModel(new DefaultComboBoxModel(new String[] { "ID" }));
			while (res.next()) {
				comboBoxID.addItem(res.getString("ID"));
			}
			}
			else if(a.equals("airwaybooking")){
				String query = "SELECT `ID`, `Agency/Company Name`,`Time`, `Available Seats`, `Fare Per Seat(BDT)` FROM `"+a+"` WHERE `Leaving From` = '"
						+ comboBoxleavingfrom.getSelectedItem()
						+ "' AND `Going To` = '"
						+ comboBoxgoingto.getSelectedItem()
						+ "' AND `Date` = '"
						+ txtYyyymmdd_2.getText()+ "'";
				PreparedStatement pst = connection.prepareStatement(query);
				ResultSet res = pst.executeQuery();
				comboBoxID
						.setModel(new DefaultComboBoxModel(new String[] { "ID" }));
				while (res.next()) {
					comboBoxID.addItem(res.getString("ID"));
				}
			}
			else if(a.equals("hotelbooking")){
				String query =  "SELECT `ID`, `Hotel Name`, `Available Rooms`,`Room Type`, `Rates Per Day(USD)` FROM `hotelbooking` WHERE `Destination` = '"
						+ comboBoxdest.getSelectedItem()
						+ "' AND `Date` = '"
						+ txtYyyymmdd_1.getText() + "'";
				PreparedStatement pst = connection.prepareStatement(query);
				ResultSet res = pst.executeQuery();
				comboBoxID
						.setModel(new DefaultComboBoxModel(new String[] { "ID" }));
				while (res.next()) {
					comboBoxID.addItem(res.getString("ID"));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fillcomboboxidudatebus(String a) {
		try {
			String query = "SELECT `ID` FROM `"+a+"`";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet res = pst.executeQuery();
			// if(!res.next())
			// {
			// JOptionPane.showMessageDialog(null, "false");
			// }
			comboBox_IDUpdatebus.setModel(new DefaultComboBoxModel(
					new String[] { "ID" }));
			while (res.next()) {
				comboBox_IDUpdatebus.addItem(res.getString("ID"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fillcomboboxbusrequest1(String a) {
		try {
			
			String query = "SELECT `ID` FROM `"+a+"`";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet res = pst.executeQuery();
			// if(!res.next())
			// {
			// JOptionPane.showMessageDialog(null, "false");
			// }
			comboBox_IDr
					.setModel(new DefaultComboBoxModel(new String[] { "" }));
			while (res.next()) {
				comboBox_IDr.addItem(res.getString("ID"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fillcomboboxbusrequest2(String a) {
		try {
			String query1 = "SELECT `Contact Number` FROM `"+a+"`";
			PreparedStatement pst1 = connection.prepareStatement(query1);
			ResultSet res1 = pst1.executeQuery();
			comboBox_Contact.setModel(new DefaultComboBoxModel(
					new String[] { "" }));
			while (res1.next()) {
				comboBox_Contact.addItem(res1.getString("Contact Number"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	//TODO Bus Booking 
	
	
	//TODO Airways
	
	JPanel panelAirway = new JPanel();
	JPanel panelfindairway=new JPanel();
	JPanel paneladdhotelinfo=new JPanel();
	
	JComboBox comboBoxleavingfrom = new JComboBox();
	JComboBox comboBoxgoingto = new JComboBox();
	private JTable table_2;
	private JTextField textField001;
	private JTextField textField002;
	private JTextField textField003;
	private ObservingTextField textField004;
	private JTextField textField006;
	private JTextField textField007;
	private JTable table_3;
	private JTable table_4;
	private JTextField textField10;
	private JTextField textField11;
	private JTextField textField12;
	private JTextField textField13;
	private JTable table_5;
	private JTextField txtId;
	private JTextField txtTime;
	private ObservingTextField txtDate;
	private ObservingTextField textFieldcal;
	private ObservingTextField txtYyyymmdd_1;
	private ObservingTextField txtYyyymmdd_2;
	private JTextField txtPlace;
	
	
	
	public FirstIn() {
		// initialize();
		
		connection = dbConnect.dbConnector();
		// connection1=dbConnect.dbConnector();
	
		
		
		//TODO Bus Booking 
		btnPendingRequest.setToolTipText("Pending Request");
		btnPendingRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnRequestBus.setVisible(true);
				btnRequestFlight.setVisible(true);
				btnRequestRoom.setVisible(true);
				btnRequestInterview.setVisible(true);
				cardLayout.show(Mainpanel, "panelRequest");
			}
		});
		
		
		btnaddflightinfo.setVisible(false);
		btnaddroominfo.setVisible(false);
		btnLogout.setToolTipText("Log Out");

		btnLogout.setVisible(false);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnUpdateBus.setVisible(false);
				btnPendingRequest.setVisible(false);
				btnUpdateFlight.setVisible(false);
				btnUpdateRoom.setVisible(false);
				btnUpdatePac.setVisible(false);
				btnAddGuide.setVisible(false);
				btnLogout.setVisible(false);
	//		panelRequest.setVisible(false);
				btnRequestBus.setVisible(false);
				btnRequestFlight.setVisible(false);
				btnRequestRoom.setVisible(false);
				btnRequestInterview.setVisible(false);
				panelBusRequest.setVisible(false);
				btnAddBusInfo.setVisible(false);
				btnaddflightinfo.setVisible(false);
				btnaddroominfo.setVisible(false);
				//panelRequest.hide();
				panelUpdateBusInfo.hide();
				paneladdbusinfo.hide();
				paneladdguide.hide();
				panelrequestinterview.hide();
			}
		});
		btnLogout.setIcon(new ImageIcon(FirstIn.class
				.getResource("/image/log2.png")));
		btnLogout.setBounds(155, 369, 89, 67);
		getContentPane().add(btnLogout);
		btnPendingRequest.setIcon(new ImageIcon(FirstIn.class
				.getResource("/image/iTranslate-icon.png")));
		btnPendingRequest.setBounds(76, 369, 81, 67);
		getContentPane().add(btnPendingRequest);
		btnPendingRequest.setVisible(false);

		// Mainpanel.setBounds(285, 70, 416, 337);
		Mainpanel.setBounds(300, 70, 600, 400);
		getContentPane().add(Mainpanel);
		Mainpanel.setLayout(cardLayout);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		Mainpanel.setOpaque(false);
		panelRequest.setOpaque(false);
		Mainpanel.add(panelRequest, "panelRequest");
		panelRequest.setLayout(null);

		Mainpanel.add(paneladdguide,"paneladdguide");
		paneladdguide.setLayout(null);
		
		
		
		
		//TODO shanta
		Mainpanel.add(panelHealthrisk,"panelHealthrisk");
		panelHealthrisk.setLayout(null);
		panelHealthrisk.setBackground(Color.YELLOW);
		
		Mainpanel.add(paneltravelagency,"paneltravelagency");
		paneltravelagency.setLayout(null);
		panelsafetyinfo.setBackground(Color.WHITE);
		
		
		Mainpanel.add(panelsafetyinfo,"panelsafetyinfo");
		panelsafetyinfo.setLayout(null);
		
		Mainpanel.add(panelpolicestation,"panelpolicestation");
		panelpolicestation.setLayout(null);
		Mainpanel.add(panelhospitalinfo,"panelhospitalinfo");
		panelhospitalinfo.setLayout(null);
		
		Mainpanel.add(panelweatherinfo,"panelweatherinfo");
		panelweatherinfo.setLayout(null);
		JTextArea txtrKeepYour = new JTextArea();
		txtrKeepYour.setForeground(Color.BLACK);
		txtrKeepYour.setFont(new Font("Monospaced", Font.BOLD, 15));
		txtrKeepYour.setBackground(Color.WHITE);
		txtrKeepYour.setText("\u2022 Keep necessary medicine with yourself.\r\n\u2022Always carry  pure water with  yourself  when travelling.\r\n\u2022Keep a firstaid box  for instance  treatment.\r\n\u2022Be aware of street food");
		txtrKeepYour.setBounds(27, 80, 545, 139);
		panelHealthrisk.add(txtrKeepYour);

		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"Chittagong", "Dhaka", "khulna", "Barisal"}));
		comboBox_11.setBounds(232, 257, 125, 32);
		panelHealthrisk.add(comboBox_11);
		
		
		btnNearestHospital.setForeground(Color.BLUE);
		btnNearestHospital.setBackground(Color.GREEN);
		btnNearestHospital.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
		JScrollPane scrollPane_hospitalinfo = new JScrollPane();
		scrollPane_hospitalinfo.setBounds(10, 11, 580, 265);
		panelhospitalinfo.add(scrollPane_hospitalinfo);

		table_hospitalinfo = new JTable();
		table_hospitalinfo.setEnabled(false);
		scrollPane_hospitalinfo.setViewportView(table_hospitalinfo);
		
	
	
		btnNearestHospital.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//cardLayout.show(Mainpanel,"panleHospitalinfo");
				
				try {
					cardLayout.show(Mainpanel,"panelhospitalinfo");
					

					String query = "SELECT Name,Contact_NO,Address FROM `hospitalinfo` where PLACE='"+comboBox_11.getSelectedItem()+"'";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					// tableBusBookingRequest.getTableHeader();
					table_hospitalinfo.setModel(DbUtils.resultSetToTableModel(res));

				} catch (Exception e) {
					e.printStackTrace();
				}	
				
			}
		});
		btnNearestHospital.setBounds(207, 312, 167, 38);
		panelHealthrisk.add(btnNearestHospital);
		
		lblNewLabel_6.setForeground(Color.BLUE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(47, 257, 139, 32);
		panelHealthrisk.add(lblNewLabel_6);
		JLabel lblChooseYourDestination = new JLabel("Choose your Destination");
		lblChooseYourDestination.setForeground(Color.BLUE);
		lblChooseYourDestination.setBounds(81, 103, 127, 26);
		panelweatherinfo.add(lblChooseYourDestination);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"Dhaka", "Chittagong", "Khulna", "Barisal"}));
		comboBox_13.setBounds(248, 106, 114, 20);
		panelweatherinfo.add(comboBox_13);
		
		JLabel lblWeatherUpdate = new JLabel("Weather Update");
		lblWeatherUpdate.setForeground(Color.BLUE);
		lblWeatherUpdate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWeatherUpdate.setIcon(new ImageIcon(FirstIn.class.getResource("/image/weather2.png")));
		lblWeatherUpdate.setBounds(208, 254, 154, 47);
		panelweatherinfo.add(lblWeatherUpdate);
		
		
		JButton btnNewButton_10 = new JButton("Weather Information");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				cardLayout.show(Mainpanel,"panelweatherinfo" );
				
				
				
			}
		});
		
		
		
		//TODO shanta
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 11, 580, 237);
		paneladdguide.add(scrollPane_5);
		
		table_4 = new JTable();
		scrollPane_5.setViewportView(table_4);
		
		JLabel lblNewLabel_5 = new JLabel("Name");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(10, 269, 91, 21);
		paneladdguide.add(lblNewLabel_5);
		
		textField10 = new JTextField();
		textField10.setBounds(111, 269, 171, 20);
		paneladdguide.add(textField10);
		textField10.setColumns(10);
		
		JLabel lblAgencyName = new JLabel("Agency Name");
		lblAgencyName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAgencyName.setForeground(Color.WHITE);
		lblAgencyName.setBounds(10, 320, 91, 21);
		paneladdguide.add(lblAgencyName);
		
		textField11 = new JTextField();
		textField11.setBounds(111, 320, 171, 20);
		paneladdguide.add(textField11);
		textField11.setColumns(10);
		
		JLabel lblContactNumber = new JLabel("Contact Number");
		lblContactNumber.setForeground(Color.WHITE);
		lblContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblContactNumber.setBounds(308, 272, 109, 18);
		paneladdguide.add(lblContactNumber);
		
		textField12 = new JTextField();
		textField12.setBounds(427, 269, 141, 20);
		paneladdguide.add(textField12);
		textField12.setColumns(10);
		
		JLabel lblDesExpert = new JLabel("Destination Expert");
		lblDesExpert.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDesExpert.setForeground(Color.WHITE);
		lblDesExpert.setBounds(308, 323, 109, 18);
		paneladdguide.add(lblDesExpert);
		
		textField13 = new JTextField();
		textField13.setBounds(427, 321, 141, 20);
		paneladdguide.add(textField13);
		textField13.setColumns(10);
		
		JButton btnAddInfo_2 = new JButton("Add Info");
		btnAddInfo_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					String query = "INSERT INTO `travellers`.`findguide` (`Name`, `Agency Name`,`Contact Number`,`Destination`) VALUES ('"
							+ textField10.getText()
							+ "', '"
							+ textField11.getText()
							+ "', '"
							+ textField12.getText()
							+ "', '"
							+ textField13.getText()
							+ 
							"');";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Info Added");
					textField10.setText("");
					textField11.setText("");
					textField12.setText("");
					textField13.setText("");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
		});
		btnAddInfo_2.setBounds(250, 366, 89, 23);
		paneladdguide.add(btnAddInfo_2);
		paneladdbusinfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				slider.setVisible(false);
			}
		});
		
		
		paneladdbusinfo.setOpaque(false);
		Mainpanel.add(paneladdbusinfo, "paneladdbusinfo");
		paneladdbusinfo.setLayout(null);
		panelrequestinterview.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				slider_1.setVisible(false);
			}
		});

		Mainpanel.add(panelrequestinterview,"panelrequestinterview");
		panelrequestinterview.setLayout(null);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 11, 580, 242);
		panelrequestinterview.add(scrollPane_6);
		
		table_5 = new JTable();
		scrollPane_6.setViewportView(table_5);
		
		txtId = new JTextField();
		txtId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtId.setText("");
			}
		});
		txtId.setText("ID");
		txtId.setBounds(28, 305, 86, 20);
		panelrequestinterview.add(txtId);
		txtId.setColumns(10);
		
		txtTime = new JTextField();
		
		txtTime.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				slider_1.setVisible(true);
				
			}
		});
		txtTime.setText("TIME");
		txtTime.setBounds(171, 305, 86, 20);
		panelrequestinterview.add(txtTime);
		txtTime.setColumns(10);
		
		txtDate = new ObservingTextField();
		txtDate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtDate.setText("");

				String lang=null;
				try {
					final Locale locale=getLocale(lang);
					DatePicker dp=new DatePicker(txtDate,locale);
					Date selectedDate=dp.parseDate(txtDate.getText());
					dp.setSelectedDate(selectedDate);
					dp.start(txtDate);
					//System.out.println(textField.getText());
					
				} catch (Exception ea) {
					// TODO Auto-generated catch block
					ea.printStackTrace();
				}

			}
		});
		txtDate.setText("DATE");
		txtDate.setBounds(303, 305, 86, 20);
		panelrequestinterview.add(txtDate);
		txtDate.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("OK");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
				String query="UPDATE `requestforinterview` SET `Date`='"+txtDate.getText()+"',`Time`='"+txtTime.getText()+"',`Place`='"+txtPlace.getText()+"' WHERE `ID`='"+txtId.getText()+"'";
				PreparedStatement pst=connection.prepareStatement(query);
				pst.execute();
				pst.close();
				Thread.sleep(100);
				JOptionPane.showMessageDialog(null,"Call For Interview Completed");
				txtDate.setText("DATE");
				txtTime.setText("TIME");
				txtId.setText("ID");
				txtPlace.setText("Place");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		btnNewButton_4.setBounds(428, 339, 89, 23);
		panelrequestinterview.add(btnNewButton_4);
		Mainpanel.add(panelguide,"panelguide");
		panelguide.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 11, 580, 277);
		panelguide.add(scrollPane_4);
		
		table_3 = new JTable();
		scrollPane_4.setViewportView(table_3);
		table_3.setEnabled(false);
		
		Mainpanel.add(paneladdhotelinfo,"paneladdhotelinfo");
		paneladdhotelinfo.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 11, 580, 212);
		paneladdhotelinfo.add(scrollPane_3);
		
		table_2 = new JTable();
		scrollPane_3.setViewportView(table_2);
		table_2.setEnabled(false);
		
		JLabel lblId_1 = new JLabel("ID");
		lblId_1.setForeground(Color.WHITE);
		lblId_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblId_1.setBounds(10, 242, 64, 22);
		paneladdhotelinfo.add(lblId_1);
		
		textField001 = new JTextField();
		textField001.setBounds(84, 244, 76, 20);
		paneladdhotelinfo.add(textField001);
		textField001.setColumns(10);
		
		JLabel lblHotelName = new JLabel("Hotel Name");
		lblHotelName.setForeground(Color.WHITE);
		lblHotelName.setBounds(10, 275, 69, 22);
		paneladdhotelinfo.add(lblHotelName);
		
		textField002 = new JTextField();
		textField002.setBounds(84, 275, 108, 22);
		paneladdhotelinfo.add(textField002);
		textField002.setColumns(10);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setForeground(Color.WHITE);
		lblDestination.setBounds(10, 313, 69, 22);
		paneladdhotelinfo.add(lblDestination);
		
		textField003 = new JTextField();
		textField003.setBounds(84, 314, 108, 20);
		paneladdhotelinfo.add(textField003);
		textField003.setColumns(10);
		
		JLabel lblDate_2 = new JLabel("Date");
		lblDate_2.setForeground(Color.WHITE);
		lblDate_2.setBounds(10, 346, 64, 22);
		paneladdhotelinfo.add(lblDate_2);
		
		textField004 = new ObservingTextField();
		textField004.setText("yyyy-mm-dd");
		textField004.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField004.setText("");

				String lang=null;
				try {
					final Locale locale=getLocale(lang);
					DatePicker dp=new DatePicker(textField004,locale);
					Date selectedDate=dp.parseDate(textField004.getText());
					dp.setSelectedDate(selectedDate);
					dp.start(textField004);
					//System.out.println(textField.getText());
					
				} catch (Exception ea) {
					// TODO Auto-generated catch block
					ea.printStackTrace();
				}

			}
		});
		textField004.setBounds(84, 347, 108, 20);
		paneladdhotelinfo.add(textField004);
		textField004.setColumns(10);
		
		JLabel lblRoomType = new JLabel("Room Type");
		lblRoomType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRoomType.setForeground(Color.WHITE);
		lblRoomType.setBounds(284, 246, 76, 17);
		paneladdhotelinfo.add(lblRoomType);
		
		
		comboBox005.setModel(new DefaultComboBoxModel(new String[] {"Deluxe", "Executive Twin", "Suite", "Super Deluxe"}));
		comboBox005.setBounds(409, 244, 151, 20);
		paneladdhotelinfo.add(comboBox005);
		
		JLabel lblAvailableRooms = new JLabel("Available Rooms");
		lblAvailableRooms.setForeground(Color.WHITE);
		lblAvailableRooms.setBounds(284, 275, 97, 22);
		paneladdhotelinfo.add(lblAvailableRooms);
		
		textField006 = new JTextField();
		textField006.setBounds(409, 276, 86, 20);
		paneladdhotelinfo.add(textField006);
		textField006.setColumns(10);
		
		JLabel lblRatesPerDay = new JLabel("Rates Per Day");
		lblRatesPerDay.setForeground(Color.WHITE);
		lblRatesPerDay.setBounds(284, 315, 87, 18);
		paneladdhotelinfo.add(lblRatesPerDay);
		
		textField007 = new JTextField();
		textField007.setBounds(409, 314, 86, 20);
		paneladdhotelinfo.add(textField007);
		textField007.setColumns(10);
		
		JButton btnAddInfo_1 = new JButton("Add Info");
		btnAddInfo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					//System.out.println(important);
					String query = "INSERT INTO `travellers`.`"+important+"` (`ID`, `Hotel Name`, `Destination`, `Date`,`Room Type`, `Available Rooms`, `Rates Per Day(USD)`) VALUES ('"
							+ textField001.getText()
							+ "', '"
							+ textField002.getText()
							+ "', '"
							+ textField003.getText()
							+ "', '"
							+ textField004.getText()
							+ "', '"
							+ comboBox005.getSelectedItem()
							+ "', '"
							+textField006.getText()
							+ "', '"
							+ textField007.getText()
							+"');";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Info Added");
					textField001.setText("");
					textField002.setText("");
					textField003.setText("");
					textField004.setText("yyyy-mm-dd");
					textField007.setText("");
					textField006.setText("");
					comboBox005.setModel(new DefaultComboBoxModel(new String[] {"Deluxe", "Executive Twin", "Suite", "Super Deluxe"}));

				} catch (Exception ea) {
					// TODO: handle exception
				}
			}
		});
		btnAddInfo_1.setBounds(296, 346, 89, 23);
		paneladdhotelinfo.add(btnAddInfo_1);
		
		JButton btnRefresh_1 = new JButton("Refresh");
		btnRefresh_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					String query = "SELECT * FROM `"+important+"`";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					// tableBusBookingRequest.getTableHeader();
					table_2.setModel(DbUtils.resultSetToTableModel(res));
					pst.close();
					res.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnRefresh_1.setBounds(421, 346, 89, 23);
		paneladdhotelinfo.add(btnRefresh_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 580, 172);
		paneladdbusinfo.add(scrollPane_1);

		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setEnabled(false);

		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblId.setForeground(Color.WHITE);
		lblId.setBounds(10, 210, 46, 20);
		paneladdbusinfo.add(lblId);

		textFieldIDaddinfobus = new JTextField();
		textFieldIDaddinfobus.setBounds(192, 208, 86, 20);
		paneladdbusinfo.add(textFieldIDaddinfobus);
		textFieldIDaddinfobus.setColumns(10);

		JLabel lblAgencycompanyName = new JLabel("Agency/Company Name");
		lblAgencycompanyName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAgencycompanyName.setForeground(Color.WHITE);
		lblAgencycompanyName.setBounds(10, 235, 153, 26);
		paneladdbusinfo.add(lblAgencycompanyName);

		textField_1 = new JTextField();
		textField_1.setBounds(192, 239, 118, 20);
		paneladdbusinfo.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Leaving From");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 272, 153, 14);
		paneladdbusinfo.add(lblNewLabel_3);

		textField_2 = new JTextField();
		textField_2.setBounds(192, 270, 118, 20);
		paneladdbusinfo.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblGoingTo_2 = new JLabel("Going To");
		lblGoingTo_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGoingTo_2.setForeground(Color.WHITE);
		lblGoingTo_2.setBounds(10, 297, 153, 20);
		paneladdbusinfo.add(lblGoingTo_2);

		textField_3 = new JTextField();
		textField_3.setBounds(192, 301, 118, 20);
		paneladdbusinfo.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblDate_1 = new JLabel("Date");
		lblDate_1.setForeground(Color.WHITE);
		lblDate_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDate_1.setBounds(10, 328, 153, 20);
		paneladdbusinfo.add(lblDate_1);

		txtYyyymmdd = new ObservingTextField();
		txtYyyymmdd.setText("yyyy-mm-dd");
		txtYyyymmdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtYyyymmdd.setText(null);

				String lang=null;
				try {
					final Locale locale=getLocale(lang);
					DatePicker dp=new DatePicker(txtYyyymmdd,locale);
					Date selectedDate=dp.parseDate(txtYyyymmdd.getText());
					dp.setSelectedDate(selectedDate);
					dp.start(txtYyyymmdd);
					//System.out.println(textField.getText());
					
				} catch (Exception ea) {
					// TODO Auto-generated catch block
					ea.printStackTrace();
				}

			}
		});
		txtYyyymmdd.setBounds(192, 332, 118, 20);
		paneladdbusinfo.add(txtYyyymmdd);
		txtYyyymmdd.setColumns(10);

		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTime.setForeground(Color.WHITE);
		lblTime.setBounds(10, 359, 153, 20);
		paneladdbusinfo.add(lblTime);

		txtHrrminsec = new JTextField();
		txtHrrminsec.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				slider.setVisible(true);
				
			}
		});
		txtHrrminsec.setText("00:00:00");
		txtHrrminsec.setBounds(192, 360, 118, 20);
		paneladdbusinfo.add(txtHrrminsec);
		txtHrrminsec.setColumns(10);

		JLabel lblAvailableSeats = new JLabel("Available Seats");
		lblAvailableSeats.setForeground(Color.WHITE);
		lblAvailableSeats.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAvailableSeats.setBounds(340, 214, 102, 16);
		paneladdbusinfo.add(lblAvailableSeats);

		textField_6 = new JTextField();
		textField_6.setBounds(452, 211, 86, 20);
		paneladdbusinfo.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Fare");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(340, 241, 58, 20);
		paneladdbusinfo.add(lblNewLabel_4);

		textField_7 = new JTextField();
		textField_7.setBounds(452, 239, 86, 20);
		paneladdbusinfo.add(textField_7);
		textField_7.setColumns(10);
		btnAddInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					String query = "INSERT INTO `travellers`.`"+important+"` (`ID`, `Agency/Company Name`, `Leaving From`, `Going To`, `Date`, `Time`, `Available Seats`, `Fare Per Seat(BDT)`) VALUES ('"
							+ textFieldIDaddinfobus.getText()
							+ "', '"
							+ textField_1.getText()
							+ "', '"
							+ textField_2.getText()
							+ "', '"
							+ textField_3.getText()
							+ "', '"
							+ txtYyyymmdd.getText()
							+ "', '"
							+ txtHrrminsec.getText()
							+ "', '"
							+ textField_6.getText()
							+ "', '"
							+ textField_7.getText() + "');";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Info Added");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textFieldIDaddinfobus.setText("");
					txtYyyymmdd.setText("yyyy-mm-dd");
					txtHrrminsec.setText("00:00:00");
				//	textField_4.setText("");
				//	textField_5.setText("");
					textField_6.setText("");
					
					textField_7.setText("");

				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});

		btnAddInfo.setBounds(394, 269, 109, 21);
		paneladdbusinfo.add(btnAddInfo);
		btnNewButton_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					String query = "SELECT * FROM `"+important+"`";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					// tableBusBookingRequest.getTableHeader();
					table_1.setModel(DbUtils.resultSetToTableModel(res));
					pst.close();
					res.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		txtName = new JTextField();
		txtEmail = new JTextField();
		txtContactNumber = new JTextField();

		btnNewButton_3.setBounds(394, 297, 109, 23);
		paneladdbusinfo.add(btnNewButton_3);
		panelUpdateBusInfo.setOpaque(false);
		Mainpanel.add(panelUpdateBusInfo, "panelUpdateBusInfo");
		panelUpdateBusInfo.setLayout(null);

		JScrollPane scrollPane_UpdateBus = new JScrollPane();
		scrollPane_UpdateBus.setBounds(10, 11, 580, 265);
		panelUpdateBusInfo.add(scrollPane_UpdateBus);

		table_UpdateBus = new JTable();
		table_UpdateBus.setEnabled(false);
		scrollPane_UpdateBus.setViewportView(table_UpdateBus);

		comboBox_IDUpdatebus.setModel(new DefaultComboBoxModel(
				new String[] { "ID" }));

		comboBox_Timeupdatebus.setModel(new DefaultComboBoxModel(new String[] {
				"Time", "17:00:00", "20:00:00", "21:00:00", "22:00:00",
				"23:00:00" }));
		JButton btnUpdatei = new JButton("Update");
		btnUpdatei.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					//System.out.println(important);
					if(important.equals("hotelbooking"))
					{
						String query = "UPDATE `"+important+"` SET `Available Rooms`="
								+ txtAvailableSeats.getText()
								+ ",`Rates Per Day(USD)`=" + txtFare.getText()
								+ " WHERE ID='"
								+ comboBox_IDUpdatebus.getSelectedItem() + "'";
						PreparedStatement pst = connection.prepareStatement(query);
						pst.execute();
						JOptionPane.showMessageDialog(null, "Update Complete");
						txtAvailableSeats.setText("Available Rooms");
						txtFare.setText("Rates Per Day");
						//System.out.println(important);
					}
					
					else {
						
					String query = "UPDATE `"+important+"` SET `Available Seats`="
							+ txtAvailableSeats.getText()
							+ ",`Fare Per Seat(BDT)`=" + txtFare.getText()
							+ " WHERE ID='"
							+ comboBox_IDUpdatebus.getSelectedItem() + "'";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Update Complete");
					comboBox_Timeupdatebus.setModel(new DefaultComboBoxModel(new String[] {
							"Time", "17:00:00", "20:00:00", "21:00:00", "22:00:00",
							"23:00:00" }));
					txtAvailableSeats.setText("Available Seats");
					txtFare.setText("Fare");
					//System.out.println(important);
					}
					// table_UpdateBus.setModel(DbUtils.resultSetToTableModel(res));
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		JButton btnRefreshUpdate = new JButton("Refresh");
		btnRefreshUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					
					String query = "SELECT * FROM `"+important+"`";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					// tableBusBookingRequest.getTableHeader();
					table_UpdateBus.setModel(DbUtils.resultSetToTableModel(res));
					pst.close();
					res.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		comboBox_IDUpdatebus.setBounds(10, 310, 57, 27);
		panelUpdateBusInfo.add(comboBox_IDUpdatebus);

		comboBox_Timeupdatebus.setBounds(100, 310, 86, 27);
		panelUpdateBusInfo.add(comboBox_Timeupdatebus);

		txtAvailableSeats = new JTextField();
		txtAvailableSeats.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtAvailableSeats.setText("");
			}
		});
		txtAvailableSeats.setText("Available Seats\r\n");
		txtAvailableSeats.setBounds(214, 311, 125, 24);
		panelUpdateBusInfo.add(txtAvailableSeats);
		txtAvailableSeats.setColumns(10);

		txtFare = new JTextField();
		txtFare.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFare.setText("");
			}
		});
		txtFare.setText("Fare");
		txtFare.setBounds(373, 311, 117, 24);
		panelUpdateBusInfo.add(txtFare);
		txtFare.setColumns(10);

		btnUpdatei.setBounds(159, 348, 125, 23);
		panelUpdateBusInfo.add(btnUpdatei);

		btnRefreshUpdate.setBounds(316, 346, 108, 23);
		panelUpdateBusInfo.add(btnRefreshUpdate);
		panelcheckbusbooking.setOpaque(false);
		Mainpanel.add(panelcheckbusbooking, "panelcheckbusbooking");
		panelcheckbusbooking.setLayout(null);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(21, 32, 569, 235);
		panelcheckbusbooking.add(scrollPane_2);

		table_checkbusbooking = new JTable();
		table_checkbusbooking.setEnabled(false);
		scrollPane_2.setViewportView(table_checkbusbooking);
		panelBusRequest.setOpaque(false);
		Mainpanel.add(panelBusRequest, "panelBusRequest");
		panelBusRequest.setLayout(null);

		JScrollPane scrollPane_BusRequest = new JScrollPane();
		scrollPane_BusRequest.setBounds(10, 35, 590, 215);
		panelBusRequest.add(scrollPane_BusRequest);

		table = new JTable();
		table.setEnabled(false);
		scrollPane_BusRequest.setViewportView(table);

		comboBox_IDr.setBounds(10, 299, 101, 26);
		panelBusRequest.add(comboBox_IDr);

		comboBox_Contact.setBounds(139, 302, 132, 23);
		panelBusRequest.add(comboBox_Contact);

		JButton btnAccepted1 = new JButton("Accepted");
		btnAccepted1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					//System.out.println(important);
					String query = "INSERT INTO `"+important+"`(`ID`, `Contact Number`, `Status`) VALUES ('"
							+ comboBox_IDr.getSelectedItem()
							+ "','"
							+ comboBox_Contact.getSelectedItem()
							+ "','Accepted')";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.execute();
					if(important.equals("checkbusbooking"))
					{String query1 = "DELETE FROM `requestforbus` WHERE ID='"
							+ comboBox_IDr.getSelectedItem() + "' ";
					PreparedStatement pst1 = connection
							.prepareStatement(query1);
					pst1.execute();
					fillcomboboxbusrequest1("requestforbus");
					fillcomboboxbusrequest2("requestforbus");
					}
					else if (important.equals("checkairbooking")) {
						String query1 = "DELETE FROM `requestforair` WHERE ID='"
								+ comboBox_IDr.getSelectedItem() + "' ";
						PreparedStatement pst1 = connection
								.prepareStatement(query1);
						pst1.execute();

						fillcomboboxbusrequest1("requestforair");
						fillcomboboxbusrequest2("requestforair");
					}
					else if (important.equals("checkhotelbooking")) {
						String query1 = "DELETE FROM `requestforhotel` WHERE ID='"
								+ comboBox_IDr.getSelectedItem() + "' ";
						PreparedStatement pst1 = connection
								.prepareStatement(query1);
						pst1.execute();

						fillcomboboxbusrequest1("requestforhotel");
						fillcomboboxbusrequest2("requestforhotel");
					}
					
					JOptionPane.showMessageDialog(null, "Request Accepted");
					
					pst.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnAccepted1.setBounds(303, 301, 115, 24);
		panelBusRequest.add(btnAccepted1);

		btnRejected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					String query = "INSERT INTO `"+important+"`(`ID`, `Contact Number`, `Status`) VALUES ('"
							+ comboBox_IDr.getSelectedItem()
							+ "','"
							+ comboBox_Contact.getSelectedItem()
							+ "','Rejected')";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.execute();
					if(important.equals("checkbusbooking")){
					String query1 = "DELETE FROM `requestforbus` WHERE ID='"
							+ comboBox_IDr.getSelectedItem() + "' ";
					PreparedStatement pst1 = connection
							.prepareStatement(query1);
					pst1.execute();
					}
					else if(important.equals("checkairbooking")){
						String query1 = "DELETE FROM `requestforair` WHERE ID='"
								+ comboBox_IDr.getSelectedItem() + "' ";
						PreparedStatement pst1 = connection
								.prepareStatement(query1);
						pst1.execute();
						}
					else if(important.equals("checkhotelbooking")){
						String query1 = "DELETE FROM `requestforhotel` WHERE ID='"
								+ comboBox_IDr.getSelectedItem() + "' ";
						PreparedStatement pst1 = connection
								.prepareStatement(query1);
						pst1.execute();
						}
					JOptionPane.showMessageDialog(null, "Request Rejected");
					
					pst.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnRejected.setBounds(428, 301, 101, 24);
		panelBusRequest.add(btnRejected);

		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					
					if(important.equals("checkbusbooking")){
					String query = "`SELECT * FROM `requestforbus";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					// tableBusBookingRequest.getTableHeader();
					table.setModel(DbUtils.resultSetToTableModel(res));
					fillcomboboxbusrequest1("requestforbus");
					fillcomboboxbusrequest2("requestforbus");
					pst.close();
					res.close();
					}
					else if(important.equals("checkairbooking"))
					{
						String query = "SELECT * FROM `requestforair`";
						PreparedStatement pst = connection.prepareStatement(query);
						ResultSet res = pst.executeQuery();
						// tableBusBookingRequest.getTableHeader();
						table.setModel(DbUtils.resultSetToTableModel(res));
						fillcomboboxbusrequest1("requestforair");
						fillcomboboxbusrequest2("requestforair");
						pst.close();
						res.close();
					}
					else if(important.equals("checkhotelbooking"))
					{
						String query = "SELECT * FROM `requestforhotel`";
						PreparedStatement pst = connection.prepareStatement(query);
						ResultSet res = pst.executeQuery();
						// tableBusBookingRequest.getTableHeader();
						table.setModel(DbUtils.resultSetToTableModel(res));
						fillcomboboxbusrequest1("requestforhotel");
						fillcomboboxbusrequest2("requestforhotel");
						pst.close();
						res.close();
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		btnRefresh.setBounds(232, 261, 139, 23);
		panelBusRequest.add(btnRefresh);

		panelBusBooking.setOpaque(false);
		Mainpanel.add(panelBusBooking, "panelBusBooking");
		panelBusBooking.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 51, 580, 230);
		panelBusBooking.add(scrollPane);

		tableBusBookingRequest = new JTable();
		scrollPane.setViewportView(tableBusBookingRequest);
		tableBusBookingRequest.setEnabled(false);
		comboBoxID.setModel(new DefaultComboBoxModel(new String[] { "ID" }));

		comboBoxID.setBounds(10, 322, 66, 31);
		panelBusBooking.add(comboBoxID);

		txtContactNumber_1 = new JTextField();
		txtContactNumber_1.setText("Contact Number");
		txtContactNumber_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtContactNumber_1.setText("");
			}
		});
		txtContactNumber_1.setBounds(108, 322, 159, 31);
		panelBusBooking.add(txtContactNumber_1);
		txtContactNumber_1.setColumns(10);

		comboBox_Seats.setModel(new DefaultComboBoxModel(new String[] {
				"Seats", "1", "2", "3", "4" }));
		comboBox_Seats.setBounds(303, 322, 92, 31);
		panelBusBooking.add(comboBox_Seats);

		JButton btnRequestForBooking = new JButton("Request For Booking");
		btnRequestForBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					if(important.equals("requestforhotel"))
					{
						String query = "INSERT INTO `"+important+"`(`ID`, `Contact Number`, `Rooms`) VALUES ('"
							+ comboBoxID.getSelectedItem()
							+ "','"
							+ txtContactNumber_1.getText()
							+ "',"
							+ comboBox_Seats.getSelectedItem() + ")";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.execute();
					pst.close();
					JOptionPane.showMessageDialog(null, "Request sent");
					}
					else 
					{
						String query = "INSERT INTO `"+important+"`(`ID`, `Contact Number`, `Seats`) VALUES ('"
								+ comboBoxID.getSelectedItem()
								+ "','"
								+ txtContactNumber_1.getText()
								+ "',"
								+ comboBox_Seats.getSelectedItem() + ")";
						PreparedStatement pst = connection.prepareStatement(query);
						pst.execute();
						pst.close();
						JOptionPane.showMessageDialog(null, "Request sent");
						
						
						
					}
					if(important.equals("requestforair"))
					{
						fillcombobox("airwaybooking");
					}
					else if (important.equals("requestforhotel")) {
						fillcombobox("hotelbooking");
					}
					else if (important.equals("requestforbus")) {
						fillcombobox("busbooking");
					}
					
					
			//		comboBoxID.setModel(new DefaultComboBoxModel(new String[] { "ID" }));
					txtContactNumber_1.setText("Contact Number");
					comboBox_Seats.setModel(new DefaultComboBoxModel(new String[] { "Seats","1","2","3","4" }));
//					if(important=="busbooking")
//					{
//						important="requestforbus";
//					}
//					else if(important=="airwaybooking")
//					{
//						important="requestforair";
//					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnRequestForBooking.setBounds(431, 322, 159, 31);
		panelBusBooking.add(btnRequestForBooking);

		btnRequestBus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");

				try {
					cardLayout.show(Mainpanel, "panelBusRequest");
					String query = "SELECT * FROM `requestforbus`";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					// tableBusBookingRequest.getTableHeader();
					table.setModel(DbUtils.resultSetToTableModel(res));
					fillcomboboxbusrequest1("requestforbus");
					fillcomboboxbusrequest2("requestforbus");
					pst.close();
					res.close();
					important="checkbusbooking";
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnRequestBus.setBounds(211, 57, 168, 34);
		panelRequest.add(btnRequestBus);
		
		
		btnRequestFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					cardLayout.show(Mainpanel, "panelBusRequest");
					String query = "SELECT * FROM `requestforair`";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					// tableBusBookingRequest.getTableHeader();
					table.setModel(DbUtils.resultSetToTableModel(res));
					fillcomboboxbusrequest1("requestforair");
					fillcomboboxbusrequest2("requestforair");
					pst.close();
					res.close();
					important="checkairbooking";
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnRequestFlight.setBounds(211, 133, 168, 34);
		panelRequest.add(btnRequestFlight);

		btnRequestRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					cardLayout.show(Mainpanel, "panelBusRequest");
					String query = "SELECT * FROM `requestforhotel`";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					// tableBusBookingRequest.getTableHeader();
					table.setModel(DbUtils.resultSetToTableModel(res));
					fillcomboboxbusrequest1("requestforhotel");
					fillcomboboxbusrequest2("requestforhotel");
					pst.close();
					res.close();
					important="checkhotelbooking";
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnRequestRoom.setBounds(211, 215, 168, 34);
		panelRequest.add(btnRequestRoom);

		btnRequestInterview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					cardLayout.show(Mainpanel, "panelrequestinterview");
					String query = "SELECT `ID`,`Name`,`Email`,`Contact_Number`,`Experience` FROM `requestforinterview`";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					// tableBusBookingRequest.getTableHeader();
					table_5.setModel(DbUtils.resultSetToTableModel(res));
				//	fillcomboboxbusrequest1("requestforinterview");
				//	fillcomboboxbusrequest2("requestforinterview");
					pst.close();
					res.close();
				//	important="checkhotelbooking";
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnRequestInterview.setBounds(211, 287, 168, 34);
		panelRequest.add(btnRequestInterview);

		panelChecking.setOpaque(false);
		Mainpanel.add(panelChecking, "panelChecking");
		panelChecking.setLayout(null);

		JButton btnCheckBus = new JButton("Check Bus Booking");
		btnCheckBus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					cardLayout.show(Mainpanel, "panelcheckbusbooking");

					String query = "SELECT * from checkbusbooking";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					// tableBusBookingRequest.getTableHeader();
					table_checkbusbooking.setModel(DbUtils
							.resultSetToTableModel(res));

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnCheckBus.setBounds(214, 65, 167, 32);
		panelChecking.add(btnCheckBus);

		JButton btnCheckFlight = new JButton("Check Flight Booking");
		btnCheckFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					cardLayout.show(Mainpanel, "panelcheckbusbooking");

					String query = "SELECT * from checkairbooking";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					// tableBusBookingRequest.getTableHeader();
					table_checkbusbooking.setModel(DbUtils
							.resultSetToTableModel(res));

				} catch (Exception ea) {
					ea.printStackTrace();
				}
			}
		});
		btnCheckFlight.setBounds(214, 143, 167, 32);
		panelChecking.add(btnCheckFlight);

		JButton btnCheckHotel = new JButton("Check Room Booking");
		btnCheckHotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					cardLayout.show(Mainpanel, "panelcheckbusbooking");

					String query = "SELECT * from checkhotelbooking";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					// tableBusBookingRequest.getTableHeader();
					table_checkbusbooking.setModel(DbUtils
							.resultSetToTableModel(res));

				} catch (Exception ea) {
					ea.printStackTrace();
				}
			}
		});
		btnCheckHotel.setBounds(214, 222, 167, 32);
		panelChecking.add(btnCheckHotel);

		JButton btnCheckInterview = new JButton("Check Interview Calling");
		btnCheckInterview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				String s="";
				s=JOptionPane.showInputDialog("Give your ID");
				

				try {
					cardLayout.show(Mainpanel, "panelcheckbusbooking");
					String query = "SELECT `Name`,`Date`,`Time`,`Place` from requestforinterview where `ID`='"+s+"' ";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					// tableBusBookingRequest.getTableHeader();
					
					table_checkbusbooking.setModel(DbUtils
							.resultSetToTableModel(res));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnCheckInterview.setBounds(214, 297, 167, 32);
		panelChecking.add(btnCheckInterview);

		JButton btnBus = new JButton("");
		btnBus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				cardLayout.show(Mainpanel, "panelBus");
				
			}
		});
		btnBus.setBounds(156, 91, 88, 67);
		getContentPane().add(btnBus);
		btnBus.setToolTipText("Bus");
		btnBus.setIcon(new ImageIcon(FirstIn.class
				.getResource("/image/bus.png")));

		final JPanel panelBus = new JPanel();
		panelBus.setOpaque(false);
		Mainpanel.add(panelBus, "panelBus");
		panelBus.setLayout(null);

		JLabel lblLeavingFrom = new JLabel("Leaving From");
		lblLeavingFrom.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLeavingFrom.setForeground(Color.WHITE);
		lblLeavingFrom.setBounds(201, 121, 99, 22);
		panelBus.add(lblLeavingFrom);

		LeavingFrom.setModel(new DefaultComboBoxModel(new String[] {"Choose Any", "Chittagong", "Dhaka"}));
		LeavingFrom.setBounds(370, 123, 99, 20);
		panelBus.add(LeavingFrom);

		JLabel lblGoingTo_1 = new JLabel("Going To");
		lblGoingTo_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGoingTo_1.setForeground(new Color(255, 255, 255));
		lblGoingTo_1.setBounds(201, 164, 99, 22);
		panelBus.add(lblGoingTo_1);

		GoingTo.setModel(new DefaultComboBoxModel(new String[] {"Choose Any", "Chittagong", "Dhaka"}));
		GoingTo.setBounds(370, 166, 99, 20);
		panelBus.add(GoingTo);

		JLabel lblDepartingOn = new JLabel("Departing On");
		lblDepartingOn.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDepartingOn.setForeground(new Color(255, 255, 255));
		lblDepartingOn.setBounds(201, 201, 99, 22);
		panelBus.add(lblDepartingOn);

		JButton btnNewButton_5 = new JButton("Find Your Bus");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					cardLayout.show(Mainpanel, "panelBusBooking");

					String query = "SELECT `ID`, `Agency/Company Name`,`Time`, `Available Seats`, `Fare Per Seat(BDT)` FROM `busbooking` WHERE `Leaving From` = '"
							+ LeavingFrom.getSelectedItem()
							+ "' AND `Going To` = '"
							+ GoingTo.getSelectedItem()
							+ "' AND `Date` = '"
							+ textFieldcal.getText() + "'";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					// tableBusBookingRequest.getTableHeader();
					tableBusBookingRequest.setModel(DbUtils
							.resultSetToTableModel(res));
					fillcombobox("busbooking");
					important="requestforbus";
					textFieldcal.setText("yyyy-mm-dd");
					LeavingFrom.setModel(new DefaultComboBoxModel(new String[] {"Choose Any", "Chittagong", "Dhaka"}));
					GoingTo.setModel(new DefaultComboBoxModel(new String[] {"Choose Any", "Chittagong", "Dhaka"}));

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton_5.setBounds(202, 263, 153, 34);
		panelBus.add(btnNewButton_5);

		btnUpdateBus.setVisible(false);
		btnUpdateBus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				cardLayout.show(Mainpanel, "panelUpdateBusInfo");
				try {
					String query = "SELECT * FROM `busbooking`";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					table_UpdateBus.setModel(DbUtils.resultSetToTableModel(res));
					fillcomboboxidudatebus("busbooking");
					important="busbooking";
					comboBox_Timeupdatebus.setVisible(true);
					txtAvailableSeats.setText("Available Seats");
					txtFare.setText("Fare");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		btnUpdateBus.setBounds(386, 263, 153, 34);
		panelBus.add(btnUpdateBus);

		btnAddBusInfo.setVisible(false);
		btnAddBusInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					cardLayout.show(Mainpanel, "paneladdbusinfo");
					String query = "SELECT * FROM `busbooking`";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(res));
					important="busbooking";
					// ta
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		btnAddBusInfo.setBounds(305, 335, 164, 28);
		panelBus.add(btnAddBusInfo);
		
		textFieldcal = new ObservingTextField();
		textFieldcal.setForeground(Color.BLACK);
		textFieldcal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textFieldcal.setText("");

					String lang=null;
				try {
					final Locale locale=getLocale(lang);
					DatePicker dp=new DatePicker(textFieldcal,locale);
					Date selectedDate=dp.parseDate(textFieldcal.getText());
					dp.setSelectedDate(selectedDate);
					dp.start(textFieldcal);
					//System.out.println(textField.getText());
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		textFieldcal.setText("yyyy-mm-dd");
		textFieldcal.setBounds(370, 203, 99, 20);
		panelBus.add(textFieldcal);
		textFieldcal.setColumns(10);
		final JPanel panelInquiry = new JPanel();
		panelInquiry.setOpaque(false);
		Mainpanel.add(panelInquiry, "panelInquiry");
		panelInquiry.setLayout(null);

		
		
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(Mainpanel,"panelHealthrisk");
			}
		});
		btnNewButton_9.setBounds(229, 73, 121, 31);
		panelInquiry.add(btnNewButton_9);

		
		btnNewButton_10.setBounds(207, 140, 171, 31);
		panelInquiry.add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("Safety Information");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(Mainpanel, "panelsafetyinfo");
			}
		});
		btnNewButton_11.setBounds(207, 212, 171, 31);
		panelInquiry.add(btnNewButton_11);

		JButton btnNewButton_14 = new JButton("Travel Agency");
		btnNewButton_14.setBounds(207, 279, 171, 31);
		panelInquiry.add(btnNewButton_14);

		panelJoin.setOpaque(false);
		Mainpanel.add(panelJoin, "panelJoin");
		panelJoin.setLayout(null);

		txtName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtName.setText("");
			}
		});
		txtName.setText("Name");
		txtName.setBounds(208, 57, 172, 29);
		panelJoin.add(txtName);
		txtName.setColumns(10);

		
		txtEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEmail.setText("");
			}
		});
		txtEmail.setText("Email");
		txtEmail.setBounds(208, 115, 172, 29);
		panelJoin.add(txtEmail);
		txtEmail.setColumns(10);

		
		txtContactNumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtContactNumber.setText("");
			}
		});
		txtContactNumber.setText("Contact Number");
		txtContactNumber.setBounds(208, 177, 172, 29);
		panelJoin.add(txtContactNumber);
		txtContactNumber.setColumns(10);

		comboBox_Experience.setModel(new DefaultComboBoxModel(new String[] {
				"Experience", "1 year", "2 years", ">2 years" }));
		comboBox_Experience.setBounds(208, 237, 172, 29);
		panelJoin.add(comboBox_Experience);

		panelJoin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtName.setText("Name");
				txtEmail.setText("Email");
				txtContactNumber.setText("Contact Number");
				comboBox_Experience.setModel(new DefaultComboBoxModel(new String[] {
						"Experience", "1 year", "2 years", ">2 years" }));

			}
		});
		

		
		
		btnsendrequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					String query = "INSERT INTO `requestforinterview`(`Name`,`Email`,`Contact_Number`, `Experience`) VALUES ('"
							+ txtName.getText()
							+ "','"
							+ txtEmail.getText()
							+ "','"
							+ txtContactNumber.getText() + "','"
							+ comboBox_Experience.getSelectedItem() + "')";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.execute();
					pst.close();
					//PreparedStatement pst1= connection1.prepareStatement("select `ID` from requestforinterview where Contact_Number='123'");
				JOptionPane.showMessageDialog(null, "Request sent");
					IDfill();
					txtName.setText("Name");
					txtEmail.setText("Email");
					txtContactNumber.setText("Contact Number");
					comboBox_Experience.setModel(new DefaultComboBoxModel(new String[] {
							"Experience", "1 year", "2 years", ">2 years" }));
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
		});
		btnsendrequest.setBounds(194, 314, 186, 29);
		panelJoin.add(btnsendrequest);

		final JPanel panelExperts = new JPanel();
		panelExperts.setOpaque(false);
		Mainpanel.add(panelExperts, "panelExperts");
		panelExperts.setLayout(null);

		JButton btnNewButton_2 = new JButton("Join in Our team");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				cardLayout.show(Mainpanel, "panelJoin");
			}
		});
		btnNewButton_2.setBounds(237, 72, 146, 36);
		panelExperts.add(btnNewButton_2);

		JLabel lblOr = new JLabel("OR");
		lblOr.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOr.setForeground(Color.BLACK);
		lblOr.setBounds(277, 134, 80, 25);
		panelExperts.add(lblOr);

		
		comboBox_region.setModel(new DefaultComboBoxModel(new String[] {"Region", "Dhaka", "Chittagong"}));
		
		comboBox_region.setBounds(237, 187, 146, 36);
		panelExperts.add(comboBox_region);

		
		btnfindguide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
			cardLayout.show(Mainpanel,"panelguide");
			try {

				String query = "SELECT `Name`, `Agency Name`,`Contact Number` FROM `findguide` WHERE `Destination` = '"
						+ comboBox_region.getSelectedItem()
						+ "'";
				PreparedStatement pst = connection.prepareStatement(query);
				ResultSet res = pst.executeQuery();
				table_3.setModel(DbUtils.resultSetToTableModel(res));
				comboBox_region.setModel(new DefaultComboBoxModel(new String[] {"Region", "Dhaka", "Chittagong"}));
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			}
		});
		btnfindguide.setBounds(232, 251, 151, 36);
		panelExperts.add(btnfindguide);

		btnAddGuide.setVisible(false);
		btnAddGuide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				cardLayout.show(Mainpanel, "paneladdguide");
				try {
					String query = "SELECT * FROM `findguide`";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					table_4.setModel(DbUtils.resultSetToTableModel(res));
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		btnAddGuide.setBounds(232, 317, 163, 36);
		panelExperts.add(btnAddGuide);
		JButton btnTourPackages = new JButton("");
		// /Travellers' way/src/image/login-icon.png

		JButton btnDestinationExperts = new JButton("");
		btnDestinationExperts.setToolTipText("Destination Expert");
		btnDestinationExperts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				cardLayout.show(Mainpanel, "panelExperts");
			}
		});

		JButton btnLogin = new JButton("");
		btnLogin.setIcon(new ImageIcon(FirstIn.class
				.getResource("/image/N_M8t5STDe4.jpg")));

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				cardLayout.show(Mainpanel, "panelLogin");
			}
		});
		btnLogin.setToolTipText("Log In");
		btnLogin.setBounds(156, 297, 89, 73);
		getContentPane().add(btnLogin);
		// CardLayOut

		// Mainpanel.setOpaque(false);

		final JPanel panelHotel = new JPanel();
		panelHotel.setOpaque(false);
		Mainpanel.add(panelHotel, "panel2");
		panelHotel.setLayout(null);

		final JPanel panelTour = new JPanel();
		panelTour.setOpaque(false);
		Mainpanel.add(panelTour, "panelTour");
		panelTour.setLayout(null);

		final JPanel panelLogin = new JPanel();
		panelLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAdminName.setText("Admin Name");
				pwdPassword.setText("Password");
				pwdPassword.setEchoChar((char) 0);
				// txtPassword.setText("Password");
			}
		});
		panelLogin.setOpaque(false);
		Mainpanel.add(panelLogin, "panelLogin");
		panelLogin.setLayout(null);

		txtAdminName = new JTextField();
		txtAdminName.setFont(new Font("SutonnyOMJ", Font.BOLD, 11));
		txtAdminName.setEditable(false);
		txtAdminName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtAdminName.setText("");
				txtAdminName.setEditable(true);

			}
		});
		txtAdminName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		btnUpdatePac.setVisible(false);
		txtAdminName.setText("Admin Name");
		txtAdminName.setBounds(219, 77, 179, 32);
		panelLogin.add(txtAdminName);
		txtAdminName.setColumns(10);

		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					String query = "select * from logintable where username=? and password=?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, txtAdminName.getText());
					pst.setString(2, pwdPassword.getText());
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while (rs.next()) {
						count = count + 1;
					}
					if (count == 1) {
						JOptionPane.showMessageDialog(null,
								"UserName and Password Correct");
						btnUpdateBus.setVisible(true);
						btnPendingRequest.setVisible(true);
						btnUpdateFlight.setVisible(true);
						btnUpdateRoom.setVisible(true);
						btnUpdatePac.setVisible(true);
						btnAddGuide.setVisible(true);
						btnLogout.setVisible(true);
						btnaddflightinfo.setVisible(true);
						btnaddroominfo.setVisible(true);
						btnAddBusInfo.setVisible(true);
						txtAdminName.setText("Admin name");
						pwdPassword.setEchoChar((char) 0);
						pwdPassword.setText("Password");
					} else {
						JOptionPane.showMessageDialog(null,
								"UserName and Password Not Correct");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
				// btnNewButton_15.setVisible(true);
				// btnPendingRequest.setVisible(true);
			}
		});
		btnLogIn.setBounds(244, 232, 113, 32);
		panelLogin.add(btnLogIn);

		pwdPassword = new JPasswordField();
		pwdPassword.setFont(new Font("SutonnyOMJ", Font.BOLD, 11));
		pwdPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pwdPassword.setText("");
				pwdPassword.setEchoChar('$');
			}
		});
		pwdPassword.setEchoChar((char) 0);
		pwdPassword.setBounds(219, 145, 179, 32);
		panelLogin.add(pwdPassword);
		pwdPassword.setText("Password");

		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {
				"Choose Any Region", "Chittagong" }));
		comboBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		comboBox_6.setBounds(118, 32, 183, 39);
		panelTour.add(comboBox_6);

		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {
				"Any budget", "2000 Taka" }));
		comboBox_7.setBounds(118, 99, 183, 39);
		panelTour.add(comboBox_7);

		JButton btnNewButton_1 = new JButton("Find Your Tour");
		btnNewButton_1.setBounds(79, 222, 225, 39);
		panelTour.add(btnNewButton_1);

		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {
				"Any Duration", "5 days", "10 days" }));
		comboBox_10.setBounds(118, 165, 183, 29);
		panelTour.add(comboBox_10);

		btnUpdatePac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdatePac.setBounds(79, 299, 222, 39);
		btnUpdatePac.setVisible(false);
		panelTour.add(btnUpdatePac);
		btnTourPackages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				cardLayout.show(Mainpanel, "panelTour");
			}
		});

		JLabel lblNewLabel_2 = new JLabel("Destination");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(202, 109, 108, 26);
		panelHotel.add(lblNewLabel_2);

		
		comboBoxdest.setModel(new DefaultComboBoxModel(new String[] {"Choose Any", "Dhaka", "Chittagong"}));
		comboBoxdest.setBounds(347, 112, 115, 23);
		panelHotel.add(comboBoxdest);

		JLabel lblCheckInDate = new JLabel("Check in Date");
		lblCheckInDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCheckInDate.setForeground(Color.WHITE);
		lblCheckInDate.setBounds(202, 163, 108, 26);
		panelHotel.add(lblCheckInDate);

		JButton btnFindYourRoom = new JButton("Find Your Room");
		btnFindYourRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					cardLayout.show(Mainpanel, "panelBusBooking");

					String query = "SELECT `ID`, `Hotel Name`, `Available Rooms`,`Room Type`, `Rates Per Day(USD)` FROM `hotelbooking` WHERE `Destination` = '"
							+ comboBoxdest.getSelectedItem()
							
							+ "' AND `Date` = '"
							+ txtYyyymmdd_1.getText() + "'";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					// tableBusBookingRequest.getTableHeader();
					tableBusBookingRequest.setModel(DbUtils
							.resultSetToTableModel(res));
					fillcombobox("hotelbooking");
					important="requestforhotel";
					comboBoxdest.setModel(new DefaultComboBoxModel(new String[] {"Choose Any", "Dhaka", "Chittagong"}));
					txtYyyymmdd_1.setText("");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnFindYourRoom.setBounds(247, 227, 135, 31);
		panelHotel.add(btnFindYourRoom);

		btnUpdateRoom.setVisible(false);
		btnUpdateRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				try {
					cardLayout.show(Mainpanel, "panelUpdateBusInfo");
					String query = "SELECT * FROM `hotelbooking`";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					table_UpdateBus.setModel(DbUtils.resultSetToTableModel(res));
					fillcomboboxidudatebus("hotelbooking");
					important="hotelbooking";
					comboBox_Timeupdatebus.setVisible(false);
					txtAvailableSeats.setText("Available Rooms");
					txtFare.setText("Per Day Cost");
				} catch (Exception ea) {
					// TODO: handle exception
				}
			}
		});
		btnUpdateRoom.setBounds(367, 270, 135, 31);
		panelHotel.add(btnUpdateRoom);
		
		
		btnaddroominfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				cardLayout.show(Mainpanel, "paneladdhotelinfo");
				try {
					
					String query = "SELECT * FROM `hotelbooking`";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					table_2.setModel(DbUtils.resultSetToTableModel(res));
					// ta
					important="hotelbooking";
				} catch (Exception ea) {
					// TODO: handle exception
				}
			}
		});
		btnaddroominfo.setBounds(118, 270, 135, 31);
		panelHotel.add(btnaddroominfo);
		
		txtYyyymmdd_1 = new ObservingTextField();
		txtYyyymmdd_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtYyyymmdd_1.setText("");
			
String lang=null;
				try {
					final Locale locale=getLocale(lang);
					DatePicker dp=new DatePicker(txtYyyymmdd_1,locale);
					Date selectedDate=dp.parseDate(txtYyyymmdd_1.getText());
					dp.setSelectedDate(selectedDate);
					dp.start(txtYyyymmdd_1);
					//System.out.println(textField.getText());
					
				} catch (Exception ea) {
					// TODO Auto-generated catch block
					ea.printStackTrace();
				}

			}
		});
		txtYyyymmdd_1.setText("yyyy-mm-dd");
		txtYyyymmdd_1.setBounds(347, 167, 126, 22);
		panelHotel.add(txtYyyymmdd_1);
		txtYyyymmdd_1.setColumns(10);

	 
		Mainpanel.add(panelAirway, "panelAirway");
		panelAirway.setLayout(null);
		panelAirway.setOpaque(false);
		// panel1.setVisible(false);

		final JPanel panelnull = new JPanel();
		Mainpanel.add(panelnull, "panelnull");
		cardLayout.show(Mainpanel, "panelnull");
		panelnull.setOpaque(false);
		panelnull.setLayout(null);

		textFielddefault = new JTextField();
		textFielddefault.setBounds(74, 174, 86, 20);
		panelnull.add(textFielddefault);
		textFielddefault.setColumns(10);
		textFielddefault.setVisible(false);

		JLabel lblNewLabel_1 = new JLabel("Leaving From");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(233, 125, 88, 25);
		panelAirway.add(lblNewLabel_1);

		
		comboBoxleavingfrom.setModel(new DefaultComboBoxModel(new String[] {"Choose Any", "Chittagong", "Dhaka"}));
		comboBoxleavingfrom.setBounds(386, 126, 107, 25);
		panelAirway.add(comboBoxleavingfrom);

		JLabel lblGoingTo = new JLabel("Going To");
		lblGoingTo.setForeground(Color.WHITE);
		lblGoingTo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGoingTo.setBounds(233, 161, 88, 25);
		panelAirway.add(lblGoingTo);

		
		comboBoxgoingto.setModel(new DefaultComboBoxModel(new String[] {"Choose Any", "Chittagong", "Dhaka"}));
		comboBoxgoingto.setBounds(386, 163, 107, 22);
		panelAirway.add(comboBoxgoingto);

		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDate.setForeground(Color.WHITE);
		lblDate.setBounds(233, 197, 88, 20);
		panelAirway.add(lblDate);

		JButton btnNewButton = new JButton("Find Airlines");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				//cardLayout.show(Mainpanel, "panelfindairway");
				try {
					cardLayout.show(Mainpanel, "panelBusBooking");

					String query = "SELECT `ID`, `Agency/Company Name`,`Time`, `Available Seats`, `Fare Per Seat(BDT)` FROM `airwaybooking` WHERE `Leaving From` = '"
							+ comboBoxleavingfrom.getSelectedItem()
							+ "' AND `Going To` = '"
							+ comboBoxgoingto.getSelectedItem()
							+ "' AND `Date` = '"
							+ txtYyyymmdd_2.getText() + "'";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					// tableBusBookingRequest.getTableHeader();
					tableBusBookingRequest.setModel(DbUtils
							.resultSetToTableModel(res));
					fillcombobox("airwaybooking");
					important="requestforair";
					 txtYyyymmdd_2.setText("");
					 comboBoxleavingfrom.setModel(new DefaultComboBoxModel(new String[] {"Choose Any", "Chittagong", "Dhaka"}));
					 comboBoxgoingto.setModel(new DefaultComboBoxModel(new String[] {"Choose Any", "Chittagong", "Dhaka"}));
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(233, 239, 144, 32);
		panelAirway.add(btnNewButton);

		// final JButton btnUpdateFlight = new JButton("Update Flight Info");
		btnUpdateFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				cardLayout.show(Mainpanel, "panelUpdateBusInfo");
				try {
					String query = "SELECT * FROM `airwaybooking`";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					table_UpdateBus.setModel(DbUtils.resultSetToTableModel(res));
					fillcomboboxidudatebus("airwaybooking");
					important="airwaybooking";
					comboBox_Timeupdatebus.setVisible(true);
					txtAvailableSeats.setText("Available Seats");
					txtFare.setText("Fare");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		btnUpdateFlight.setBounds(431, 239, 133, 32);
		panelAirway.add(btnUpdateFlight);
		
		
		btnaddflightinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
					cardLayout.show(Mainpanel, "paneladdbusinfo");
					String query = "SELECT * FROM `airwaybooking`";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet res = pst.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(res));
					// ta
					important="airwaybooking";
				} catch (Exception ea) {
					// TODO: handle exception
				}
			}
		});
		btnaddflightinfo.setBounds(319, 299, 133, 32);
		panelAirway.add(btnaddflightinfo);
		
		txtYyyymmdd_2 = new ObservingTextField();
		txtYyyymmdd_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtYyyymmdd_2.setText("");

String lang=null;
				try {
					final Locale locale=getLocale(lang);
					DatePicker dp=new DatePicker(txtYyyymmdd_2,locale);
					Date selectedDate=dp.parseDate(txtYyyymmdd_2.getText());
					dp.setSelectedDate(selectedDate);
					dp.start(txtYyyymmdd_2);
					//System.out.println(textField.getText());
					
				} catch (Exception ea) {
					// TODO Auto-generated catch block
					ea.printStackTrace();
				}

			}
		});
		txtYyyymmdd_2.setText("yyyy-mm-dd");
		txtYyyymmdd_2.setBounds(386, 197, 114, 20);
		panelAirway.add(txtYyyymmdd_2);
		txtYyyymmdd_2.setColumns(10);
		btnUpdateFlight.setVisible(false);
		btnDestinationExperts.setIcon(new ImageIcon(FirstIn.class
				.getResource("/image/images (3).jpg")));
		btnDestinationExperts.setBounds(76, 297, 81, 73);
		getContentPane().add(btnDestinationExperts);

		JButton btnReuestChecking = new JButton("");
		btnReuestChecking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				cardLayout.show(Mainpanel, "panelChecking");
			}
		});
		btnReuestChecking.setToolTipText("Request Checking");
		btnReuestChecking.setIcon(new ImageIcon(FirstIn.class
				.getResource("/image/AWT-Suitcase.png")));
		btnReuestChecking.setBounds(157, 225, 88, 73);
		getContentPane().add(btnReuestChecking);

		JButton btnInquiry = new JButton("");
		btnInquiry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				cardLayout.show(Mainpanel, "panelInquiry");
			}
		});
		btnInquiry.setToolTipText("Inquiry");
		btnInquiry.setIcon(new ImageIcon(FirstIn.class
				.getResource("/image/download (2).jpg")));
		btnInquiry.setBounds(157, 157, 88, 67);
		getContentPane().add(btnInquiry);
		btnTourPackages.setToolTipText("Tour Packages");
		btnTourPackages.setIcon(new ImageIcon(FirstIn.class
				.getResource("/image/tour1.png")));
		btnTourPackages.setBounds(76, 225, 81, 73);
		getContentPane().add(btnTourPackages);
		cardLayout.show(Mainpanel, "panelnull");
		JButton btnHotel = new JButton("");
		btnHotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				cardLayout.show(Mainpanel, "panel2");
			}
		});
		btnHotel.setToolTipText("Hotels");
		btnHotel.setIcon(new ImageIcon(FirstIn.class
				.getResource("/image/blue-home-icon.png")));
		btnHotel.setBounds(76, 157, 81, 67);
		getContentPane().add(btnHotel);

		JButton btnAirway = new JButton("");
		btnAirway.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("C:\\Users\\Pavilion g6\\workspace\\Travellers' way\\audio\\button-19.wav");
				cardLayout.show(Mainpanel, "panelAirway");
				
			}
		});

		btnAirway.setToolTipText("Airways");
		btnAirway.setIcon(new ImageIcon(FirstIn.class
				.getResource("/image/AWT-Plane.png")));
		btnAirway.setBounds(76, 91, 81, 67);
		getContentPane().add(btnAirway);
		// setBounds(100, 100, 628, 413);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 0, 0);
		getContentPane().add(desktopPane);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setToolTipText("Inquiry");
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setBounds(0, 0, 934, 495);
		Image img = new ImageIcon(this.getClass().getResource(
				"/image/passport-map-travel-.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		getContentPane().add(lblNewLabel);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(null);
		contentPane.setOpaque(false);
		setBounds(100, 100, img.getWidth(null), img.getHeight(null));
		
		//setUndecorated(true);
		//setBackground(new Color(0,0,0,0));
		//setResizable(false);
		//desktopPane.setBackground(new Color(0,0,0,0));
//TODO Airway
		
	//	Mainpanel.add(panelBusBooking,"panelBusBooking");
		//panelfindairway.setOpaque(false);
		paneladdhotelinfo.setOpaque(false);
		paneladdguide.setOpaque(false);
		paneladdbusinfo.setOpaque(false);
		
	
		slider.setVisible(false);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				txtHrrminsec.setText(Integer.toString(slider.getValue())+":00:00");
			}
		});
		slider.setBounds(323, 353, 200, 26);
		paneladdbusinfo.add(slider);
		panelBusRequest.setOpaque(false);
		panelrequestinterview.setOpaque(false);
		
		slider_1.setVisible(false);
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				txtTime.setText(Integer.toString(slider_1.getValue())+":00:00");
			}
		});
		slider_1.setBounds(169, 336, 200, 26);
		panelrequestinterview.add(slider_1);
		
		txtPlace = new JTextField();
		txtPlace.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtPlace.setText("");
			}
		});
		txtPlace.setText("Place");
		txtPlace.setBounds(419, 305, 150, 20);
		panelrequestinterview.add(txtPlace);
		txtPlace.setColumns(10);
		panelguide.setOpaque(false);
	}

	public JPasswordField getPasswordField() {
		return pwdPassword;
	}
}
