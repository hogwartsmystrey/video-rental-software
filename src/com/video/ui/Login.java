package com.video.ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

	private JFrame frame;
	private JTextField username;
	private JPasswordField passwordField;
	private JPasswordField password;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(103, 88, 69, 37);
		frame.getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(108, 136, 64, 40);
		frame.getContentPane().add(lblPassword);

		username = new JTextField();
		username.setBounds(235, 96, 169, 20);
		frame.getContentPane().add(username);
		username.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(395, 146, -125, 20);
		frame.getContentPane().add(passwordField);

		password = new JPasswordField();
		password.setBounds(235, 141, 169, 30);
		frame.getContentPane().add(password);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname = username.getText();
			System.out.println("username  :" +uname);
				String psd = passwordField.getText();
				if (uname.contentEquals("name") && psd.equals("password")) {
					JOptionPane.showMessageDialog(frame, "successfully logined");
				} else

				{
					JOptionPane.showMessageDialog(frame, "invalid username or password");
				}
			}

		});
		btnLogin.setBounds(169, 187, 89, 23);
		frame.getContentPane().add(btnLogin);

	}
}