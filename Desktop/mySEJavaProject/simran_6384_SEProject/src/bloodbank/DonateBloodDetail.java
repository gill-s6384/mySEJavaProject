package bloodbank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DonateBloodDetail {

	private JFrame frame;
	private JButton btnLogout;
	private JLabel lblBlood;
	private JLabel lblUser;
	private JLabel lblBloodType;
	private JLabel lblusername;
	private JLabel lblcomfirmation;
	private JLabel lblNewLabel;
	private JLabel lblAge;
	private JLabel lblNewLabel_2;
	private JLabel lblIDno;
	private JLabel lblDonorIdLabel;

	/**
	 * Launch the application.
	 */
	public static void Donate() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DonateBloodDetail window = new DonateBloodDetail();
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
	public DonateBloodDetail() {
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
		
		lblUser = new JLabel("Name");
		lblUser.setBounds(166, 44, 43, 16);
		frame.getContentPane().add(lblUser);
		
		lblusername = new JLabel("Simran Kaur");
		lblusername.setBounds(266, 44, 83, 16);
		frame.getContentPane().add(lblusername);
		
		lblBlood = new JLabel("Blood Donated");
		lblBlood.setBounds(117, 126, 92, 16);
		frame.getContentPane().add(lblBlood);
		
		lblBloodType = new JLabel("O +ve");
		lblBloodType.setBounds(266, 126, 61, 16);
		frame.getContentPane().add(lblBloodType);
		
		btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});
		btnLogout.setBounds(166, 227, 117, 29);
		frame.getContentPane().add(btnLogout);
		
		lblcomfirmation = new JLabel("Blood Donation Detail Stored");
		lblcomfirmation.setBounds(145, 171, 182, 16);
		frame.getContentPane().add(lblcomfirmation);
		
		lblNewLabel = new JLabel("THANK YOU FOR YOUR DONATION");
		lblNewLabel.setBounds(128, 199, 231, 16);
		frame.getContentPane().add(lblNewLabel);
		
		lblAge = new JLabel("Age");
		lblAge.setBounds(179, 98, 30, 16);
		frame.getContentPane().add(lblAge);
		
		lblNewLabel_2 = new JLabel("20");
		lblNewLabel_2.setBounds(266, 98, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblIDno = new JLabel("ID No.");
		lblIDno.setBounds(166, 70, 43, 16);
		frame.getContentPane().add(lblIDno);
		
		lblDonorIdLabel = new JLabel("77890");
		lblDonorIdLabel.setBounds(266, 72, 61, 16);
		frame.getContentPane().add(lblDonorIdLabel);
	}

}
