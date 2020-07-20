package bloodbank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUILogin {

	private JFrame frame;
	private JTextField textUsername;
	private JTextField textPassword;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void Login() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILogin window = new GUILogin();
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
	public GUILogin() {
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
		
		textUsername = new JTextField();
		textUsername.setBounds(184, 54, 130, 26);
		frame.getContentPane().add(textUsername);
		textUsername.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setBounds(184, 98, 130, 26);
		frame.getContentPane().add(textPassword);
		textPassword.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textPassword.getText().equals("12345")&& textUsername.getText().equals("Simran1"))
				{
					frame.dispose();
					BloodBankMainPage obj=new BloodBankMainPage();
					obj.LandingPage();
				}
				else {
					JOptionPane.showMessageDialog(null, "UserName or Password Incorrect");
				}
			}
		});
		btnLogin.setBounds(184, 219, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(49, 59, 73, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(49, 103, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
