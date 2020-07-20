package bloodbank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration {

	private JFrame frame;
	private JTextField textFName;
	private JLabel lblFirstName;
	private JTextField textLName;
	private JLabel lblLastName;
	private JLabel lblAge;
	private JTextField textAge;
	private JTextField textContact;
	private JLabel lblBloodGroup;
	private JLabel lblContactInfo;
	private JTextField textBloodGroup;
	private JButton btnRegister;

	/**
	 * Launch the application.
	 */
	public static void Register() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
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
		
		textFName = new JTextField();
		textFName.setBounds(230, 24, 130, 26);
		frame.getContentPane().add(textFName);
		textFName.setColumns(10);
		
		lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(62, 29, 68, 16);
		frame.getContentPane().add(lblFirstName);
		
		lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(62, 63, 68, 16);
		frame.getContentPane().add(lblLastName);
		
		textLName = new JTextField();
		textLName.setBounds(230, 58, 130, 26);
		frame.getContentPane().add(textLName);
		textLName.setColumns(10);
		
		lblAge = new JLabel("Age");
		lblAge.setBounds(62, 101, 61, 16);
		frame.getContentPane().add(lblAge);
		
		textAge = new JTextField();
		textAge.setToolTipText("");
		textAge.setBounds(230, 96, 130, 26);
		frame.getContentPane().add(textAge);
		textAge.setColumns(10);
		
		lblContactInfo = new JLabel("Contact");
		lblContactInfo.setBounds(62, 139, 61, 16);
		frame.getContentPane().add(lblContactInfo);
		
		textContact = new JTextField();
		textContact.setBounds(230, 134, 130, 26);
		frame.getContentPane().add(textContact);
		textContact.setColumns(10);
		
		lblBloodGroup = new JLabel("Blood Group");
		lblBloodGroup.setBounds(62, 177, 77, 16);
		frame.getContentPane().add(lblBloodGroup);
		
		textBloodGroup = new JTextField();
		textBloodGroup.setBounds(230, 172, 130, 26);
		frame.getContentPane().add(textBloodGroup);
		textBloodGroup.setColumns(10);
		
		btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFName.getText().equals("") || textLName.getText().equals("")|| 
						textAge.getText().equals("")|| textContact.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Complete All Fields");
				}
				
				
				else{
					frame.dispose();
					BloodBankMainPage obj=new BloodBankMainPage();
					obj.LandingPage();
				}
			}
		});
		btnRegister.setBounds(146, 230, 117, 29);
		frame.getContentPane().add(btnRegister);
	}

}
