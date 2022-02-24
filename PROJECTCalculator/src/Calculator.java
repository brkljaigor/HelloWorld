import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Calculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(25, 24, 197, 48);
		contentPane.add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(306, 24, 197, 48);
		contentPane.add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton1 = new JButton("Add Numbers");
		btnNewButton1.setBackground(Color.ORANGE);
		btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, ans;
				
				try {
					num1 = Double.parseDouble(textFieldNum1.getText());
					num2 = Double.parseDouble(textFieldNum2.getText());
					ans = num1 + num2;
					textFieldResult.setText(Double.toString(ans));
					
				}
				catch(Exception z){
					JOptionPane.showMessageDialog(null, "Please enter valid value! ");
				}
			}
		});
		btnNewButton1.setBounds(25, 82, 197, 48);
		contentPane.add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("Substract Numbers");
		btnNewButton2.setBackground(Color.ORANGE);
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, ans;
				
				try {
					num1 = Double.parseDouble(textFieldNum1.getText());
					num2 = Double.parseDouble(textFieldNum2.getText());
					ans = num1 - num2;
					textFieldResult.setText(Double.toString(ans));
					
				}
				catch(Exception z1){
					JOptionPane.showMessageDialog(null, "Please enter valid value! ");
				}
				
			}
		});
		btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton2.setBounds(306, 82, 197, 48);
		contentPane.add(btnNewButton2);
		
		JButton btnNewButton3 = new JButton("Multiply Numbers");
		btnNewButton3.setBackground(Color.ORANGE);
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, ans;
				
				try {
					num1 = Double.parseDouble(textFieldNum1.getText());
					num2 = Double.parseDouble(textFieldNum2.getText());
					ans = num1 * num2;
					textFieldResult.setText(Double.toString(ans));
					
				}
				catch(Exception z2){
					JOptionPane.showMessageDialog(null, "Please enter valid value! ");
				}
			}
		});
		btnNewButton3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton3.setBounds(25, 147, 197, 48);
		contentPane.add(btnNewButton3);
		
		JButton btnNewButton4 = new JButton("Divide Numbers");
		btnNewButton4.setBackground(Color.ORANGE);
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, ans;
				
				try {
					num1 = Double.parseDouble(textFieldNum1.getText());
					num2 = Double.parseDouble(textFieldNum2.getText());
					ans = num1 / num2;
					textFieldResult.setText(Double.toString(ans));
					
				}
				catch(Exception z3){
					JOptionPane.showMessageDialog(null, "Please enter valid value! ");
				}
			}
		});
		btnNewButton4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton4.setBounds(306, 147, 197, 48);
		contentPane.add(btnNewButton4);
		
		textFieldResult = new JTextField();
		textFieldResult.setForeground(Color.BLACK);
		textFieldResult.setBackground(Color.ORANGE);
		textFieldResult.setBounds(157, 263, 261, 48);
		contentPane.add(textFieldResult);
		textFieldResult.setColumns(10);
		
		JLabel lblNewLabel1 = new JLabel("RESULT");
		lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel1.setBounds(250, 224, 66, 29);
		contentPane.add(lblNewLabel1);
	}
}
