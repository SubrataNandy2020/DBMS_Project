import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

import oracle.jdbc.pool.OracleDataSource;

public class Select extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public String sex;
	public String[] list= {"AB+","A+","B+","O+","AB-","A-","B-","O-"};
	public String select;
	private JTextField textField_1;
	private JTextField textField_7;
	private JTextField textField_8;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select frame = new Select();
					frame.setVisible(true);
					 Toolkit t=Toolkit.getDefaultToolkit();
					 Dimension d = t.getScreenSize();
					 int width=frame.getWidth();
					 int height=frame.getHeight();
					 int x=(d.width -width)/2;
					 int y=(d.height- height)/2;
					 frame.setLocation(x,y);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Select() {
		setBackground(new Color(0, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 458);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFillTheForm = new JLabel("VIEW THE FORM");
		lblFillTheForm.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblFillTheForm.setBounds(298, 11, 161, 44);
		contentPane.add(lblFillTheForm);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 65, 709, 2);
		contentPane.add(separator);
		
		JLabel lblFirstName = new JLabel("Name");
		lblFirstName.setBounds(74, 124, 63, 20);
		contentPane.add(lblFirstName);
		
		textField = new JTextField();
		textField.setBounds(186, 124, 113, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("D_O_B");
		lblLastName.setBounds(74, 167, 63, 20);
		contentPane.add(lblLastName);
		
		JLabel lblEmailId = new JLabel("Email Id");
		lblEmailId.setBounds(74, 213, 63, 14);
		contentPane.add(lblEmailId);
		
		textField_2 = new JTextField();
		textField_2.setBounds(186, 207, 113, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmployeeId = new JLabel("Employee Id");
		lblEmployeeId.setBounds(74, 252, 86, 20);
		contentPane.add(lblEmployeeId);
		
		textField_3 = new JTextField();
		textField_3.setBounds(186, 252, 113, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(74, 294, 63, 14);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(186, 291, 113, 20);
		contentPane.add(passwordField);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setBounds(464, 127, 46, 14);
		contentPane.add(lblSex);
		
		JLabel lblBankAccountNo = new JLabel("Bank Account No.");
		lblBankAccountNo.setBounds(437, 170, 130, 14);
		contentPane.add(lblBankAccountNo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(577, 167, 131, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAadharCardNo = new JLabel("Aadhar Card No.");
		lblAadharCardNo.setBounds(437, 213, 113, 14);
		contentPane.add(lblAadharCardNo);
		
		textField_5 = new JTextField();
		textField_5.setBounds(577, 210, 131, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setBounds(437, 255, 113, 14);
		contentPane.add(lblDesignation);
		
		textField_6 = new JTextField();
		textField_6.setBounds(577, 252, 131, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(186, 167, 113, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(577, 291, 131, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(577, 124, 131, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblBloodGroup = new JLabel("Blood Group");
		lblBloodGroup.setBounds(464, 294, 86, 14);
		contentPane.add(lblBloodGroup);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					textField_3.setText(Login.textField.getText());
					String empid=textField_3.getText();
					OracleDataSource ods;
					ods = new OracleDataSource();
									
					ods.setURL("jdbc:oracle:thin:SNANDY/snandy@localhost:1521/XE");
			        Connection con= ods.getConnection();
			        String sql = "select name,dob,email,empid,password,sex,bank,aadhar,desg,bldgrp from employee where empid=?";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1,empid);
					ResultSet res = ps.executeQuery();
					while(res.next()) {
						textField.setText(res.getString(1));
					    Date d1 = new Date(res.getDate(2).getTime());
						SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
					    String strDate = formatter.format(d1);  
					    textField_1.setText(strDate);
						textField_2.setText(res.getString(3));
					    textField_3.setText(res.getString(4));
					    passwordField.setText(res.getString(5));
					    textField_8.setText(res.getString(6));
					    textField_4.setText(res.getString(7));
					    textField_5.setText(res.getString(8));
					    textField_6.setText(res.getString(9));
					    textField_7.setText(res.getString(10));
					   	
					}
								
						
				} 
					
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "FAULT!!!!!!!!!!COMPLETE ALL DETAILS AGAIN");
					
				} 
			}
				
			
			
		});
		btnSubmit.setBounds(237, 369, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeMenu frame = new EmployeeMenu();
				frame.setVisible(true);
				 Toolkit t=Toolkit.getDefaultToolkit();
				 Dimension d = t.getScreenSize();
				 int width=frame.getWidth();
				 int height=frame.getHeight();
				 int x=(d.width -width)/2;
				 int y=(d.height- height)/2;
				 frame.setLocation(x,y);
			}
		});
		btnBack.setBounds(447, 369, 89, 23);
		contentPane.add(btnBack);
		
	
		
		
	}
}
