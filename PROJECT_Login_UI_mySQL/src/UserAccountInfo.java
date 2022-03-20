import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class UserAccountInfo extends Login {

	
	private JPanel contentPane;
	public String url = "jdbc:mysql://localhost:3306/logininfo";
	private JButton btnNewButtonShow;
	double balance;
	Login login = new Login();

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {	
			public void run() {
				try {
					UserAccountInfo frame = new UserAccountInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserAccountInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelAccBal = new JLabel("Account balance");
		lblNewLabelAccBal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabelAccBal.setBounds(82, 10, 137, 13);
		contentPane.add(lblNewLabelAccBal);
		
		btnNewButtonShow = new JButton("Show");
		btnNewButtonShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = DriverManager.getConnection(url, "root", "zg85eg7s");

					
					Statement statement = conn.createStatement();
					
					
					String sql = "select * from login where UserName= '"+username+"' and UserPass='"+password+"'";
					ResultSet rs = statement.executeQuery(sql);
					
					
					
					
					while(rs.next()) {
						balance = rs.getDouble("account_balance");
						JOptionPane.showInputDialog(balance);
					}
							
					
					
					conn.close();
				}catch (SQLException z) {
					// TODO Auto-generated catch block
					z.printStackTrace();
			}
			}
		});
		btnNewButtonShow.setBounds(92, 33, 85, 21);
		contentPane.add(btnNewButtonShow);
		
	}

}
