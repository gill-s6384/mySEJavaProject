package bloodbank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RequestBloodDetail {

	private JFrame frame;
	private JLabel lblUser;
	private JLabel lblName;
	private JLabel lblAge;
	private JLabel lblAgeLabel;
	private JLabel lblBlood;
	private JLabel lblType;
	private JLabel lblDetail;
	private JLabel lblNewLabel;
	private JButton btnLogout;

	/**
	 * Launch the application.
	 */
	public static void Request() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RequestBloodDetail window = new RequestBloodDetail();
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
	public RequestBloodDetail() {
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
		lblUser.setBounds(153, 28, 41, 16);
		frame.getContentPane().add(lblUser);
		
		lblName = new JLabel("Simran Kaur");
		lblName.setBounds(254, 28, 86, 16);
		frame.getContentPane().add(lblName);
		
		lblBlood = new JLabel("Blood Requested");
		lblBlood.setBounds(86, 112, 108, 16);
		frame.getContentPane().add(lblBlood);
		
		lblType = new JLabel("AB -ve");
		lblType.setBounds(254, 112, 61, 16);
		frame.getContentPane().add(lblType);
		
		btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});
		btnLogout.setBounds(165, 216, 117, 29);
		frame.getContentPane().add(btnLogout);
		
		lblDetail = new JLabel("Requested Blood Not Available");
		lblDetail.setBounds(133, 160, 207, 16);
		frame.getContentPane().add(lblDetail);
		
		lblNewLabel = new JLabel("AVAILABLE DONOR INFORMED");
		lblNewLabel.setBounds(133, 188, 195, 16);
		frame.getContentPane().add(lblNewLabel);
		
		lblAge = new JLabel("Age");
		lblAge.setBounds(162, 84, 32, 16);
		frame.getContentPane().add(lblAge);
		
		lblAgeLabel = new JLabel("20");
		lblAgeLabel.setBounds(254, 84, 61, 16);
		frame.getContentPane().add(lblAgeLabel);
		
		JLabel lblIDno = new JLabel("ID No.");
		lblIDno.setBounds(153, 56, 41, 16);
		frame.getContentPane().add(lblIDno);
		
		JLabel lblIdnoLabel = new JLabel("77890");
		lblIdnoLabel.setBounds(254, 56, 61, 16);
		frame.getContentPane().add(lblIdnoLabel);
	}
}
