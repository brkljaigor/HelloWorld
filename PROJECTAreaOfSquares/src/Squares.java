import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class Squares extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	double a;
	double ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Squares frame = new Squares();
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
	public Squares() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel1 = new JLabel("Program for calculating area of squares");
		lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel1.setBounds(40, 10, 286, 35);
		contentPane.add(lblNewLabel1);

		JLabel lblNewLabel2 = new JLabel("Enter side dimension in cm");
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel2.setBounds(40, 68, 170, 13);
		contentPane.add(lblNewLabel2);

		textField1 = new JTextField();
		textField1.setBounds(249, 61, 114, 31);
		contentPane.add(textField1);
		textField1.setColumns(10);

		JButton btnNewButton1 = new JButton("Press for result");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					a = Double.parseDouble(textField1.getText());
					if (a >= 0) {
						ans = a * a;
						textField2.setText(Double.toString(ans));

					} else {
						JOptionPane.showMessageDialog(null, "Please enter positive value! ");
					}

				} catch (Exception z) {
					JOptionPane.showMessageDialog(null, "Please enter valid value! ");
				}

			}
		});
		btnNewButton1.setBounds(40, 111, 170, 35);
		contentPane.add(btnNewButton1);

		textField2 = new JTextField();
		textField2.setBounds(249, 116, 114, 31);
		contentPane.add(textField2);
		textField2.setColumns(10);

		JButton btnNewButton2 = new JButton("Exit");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton2.setBounds(319, 430, 85, 21);
		contentPane.add(btnNewButton2);

		JButton btnNewButton3 = new JButton("Clear");
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText("");
				textField2.setText(null);
			}
		});
		btnNewButton3.setBounds(10, 430, 85, 21);
		contentPane.add(btnNewButton3);

		DefaultListModel demoList = new DefaultListModel();
		
		JList list = new JList(demoList);
		list.setBounds(41, 206, 124, 195);
		contentPane.add(list);
		
		JButton btnNewButton4 = new JButton("ADD to list");
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				demoList.addElement(ans);
			}
		});
		btnNewButton4.setBounds(40, 156, 170, 29);
		contentPane.add(btnNewButton4);

	}
}
