package bloodbank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class BloodBankMainPage {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JButton btnDonate;
	private JButton btnRequest;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void LandingPage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BloodBankMainPage window = new BloodBankMainPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BloodBankMainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Blood Bank System");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel.setBounds(148, 45, 142, 16);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBounds(154, 226, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		btnDonate = new JButton("Donate Blood");
		btnDonate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				DonateBloodDetail obj1=new DonateBloodDetail();
				obj1.Donate();
			}
		});
		btnDonate.setBounds(35, 133, 117, 29);
		frame.getContentPane().add(btnDonate);
		
		btnRequest = new JButton("Request Blood");
		btnRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				RequestBloodDetail obj2=new RequestBloodDetail();
				obj2.Request();
			}
		});
		btnRequest.setBounds(241, 133, 117, 29);
		frame.getContentPane().add(btnRequest);
	}

}
