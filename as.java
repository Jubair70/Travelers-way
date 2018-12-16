

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;

public class as extends JFrame  implements Runnable {
	public JLabel lblWelcsf = new JLabel("");
	
	private JPanel contentPane;
	// public JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					as frame = new as();
					frame.setVisible(true);
					
		
				} catch (Exception e) {
					e.printStackTrace();
				}
				//frame.setVisible(false);
			}
			
			
		});
		
		
	}

	/**
	 * Create the frame.
	 */
	public as() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		//contentPane.setFocusable(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image img = new ImageIcon(this.getClass().getResource(
				"/image/welcome.jpg")).getImage();
		lblWelcsf.setIcon(new ImageIcon(img));
		
		
		//lblWelcsf.setIcon(new ImageIcon(as.class.getResource("/image/travel-money.jpg")));
		
		
		
		lblWelcsf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWelcsf.setBounds(0, 0, img.getWidth(null),  img.getHeight(null));
		contentPane.add(lblWelcsf);
		lblWelcsf.setVisible(true);
		getContentPane().add(lblWelcsf);
		this.setBounds(5,5, img.getWidth(null), img.getHeight(null));
		
		this.setVisible(true);
		//frame.add(lblWelcsf);
	//	frame.setUndecorated(true);
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			//lblWelcsf.setVisible(true);
			Thread.sleep(2000);
			this.setVisible(false);
			//frame.setVisible(false);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
