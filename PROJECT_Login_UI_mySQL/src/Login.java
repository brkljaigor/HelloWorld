import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	public JTextField textFieldUser;
	public JPasswordField passwordFieldPass;
	public String url = "jdbc:mysql://localhost:3306/logininfo";
	JButton btnNewButtonLogin;
	JButton btnNewButtonRes;
	static String username;
	static String password; 
	Login login;
	
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		System.out.println();
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		initComp();
		createEvents();
		
	}
	
	private void initComp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelUsser = new JLabel("User:");
		lblNewLabelUsser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabelUsser.setBounds(23, 28, 91, 31);
		contentPane.add(lblNewLabelUsser);
		
		JLabel lblNewLabelPass = new JLabel("Password:");
		lblNewLabelPass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabelPass.setBounds(23, 69, 91, 20);
		contentPane.add(lblNewLabelPass);
		
		textFieldUser = new JTextField();
		textFieldUser.setBounds(124, 35, 224, 20);
		contentPane.add(textFieldUser);
		textFieldUser.setColumns(10);
		
		passwordFieldPass = new JPasswordField();
		passwordFieldPass.setBounds(124, 72, 224, 19);
		contentPane.add(passwordFieldPass);
		
		btnNewButtonLogin = new JButton("Login");
		btnNewButtonLogin.setBounds(124, 113, 85, 21);
		contentPane.add(btnNewButtonLogin);
		
		btnNewButtonRes = new JButton("Reset");
		btnNewButtonRes.setBounds(263, 113, 85, 21);
		contentPane.add(btnNewButtonRes);
		
		
	}
	
	private void createEvents() {
		btnNewButtonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection conn = DriverManager.getConnection(url, "root", "zg85eg7s");
					
					
					username = textFieldUser.getText();
					password = passwordFieldPass.getText();
					
					Statement statement = conn.createStatement();
					
					String sql = "select * from login where UserName= '"+username+"' and UserPass='"+password+"'";
					ResultSet rs = statement.executeQuery(sql);
					
					
					if(rs.next()) {
						dispose();
						UserAccountInfo uai = new UserAccountInfo();
						uai.setVisible(true);	
					}else {
						JOptionPane.showInputDialog(this, "Incorrect username or password. ");
						textFieldUser.setText("");
						passwordFieldPass.setText("");
						
					}
					

					conn.close();
				}catch (SQLException z) {
					// TODO Auto-generated catch block
					z.printStackTrace();
			}
			
			}
			
		});
		
		btnNewButtonRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUser.setText("");
				passwordFieldPass.setText("");
			}
		});

	}
	
	
	
}
