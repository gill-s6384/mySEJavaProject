package bloodbank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JButton btnSignup;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
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
	public MainPage() {
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
		
		lblNewLabel = new JLabel("WELCOME TO BLOOD BANK SYSTEM");
		lblNewLabel.setBounds(121, 44, 227, 16);
		frame.getContentPane().add(lblNewLabel);
		
		btnSignup = new JButton("Sign Up");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					frame.dispose();
					Registration obj5=new Registration();
					obj5.Register();
				
			}
		});
		btnSignup.setBounds(168, 116, 117, 29);
		frame.getContentPane().add(btnSignup);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				GUILogin obj4=new GUILogin();
				obj4.Login();
			}
		});
		btnLogin.setBounds(168, 157, 117, 29);
		frame.getContentPane().add(btnLogin);
	}

}
