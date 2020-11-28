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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

import oracle.jdbc.pool.OracleDataSource;

public class Create extends JFrame {

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
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create frame = new Create();
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
	public Create() {
		setBackground(new Color(0, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 745, 458);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFillTheForm = new JLabel("FILL THE FORM");
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
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(186, 167, 113, 20);
		contentPane.add(dateChooser);
		
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
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnMale.isSelected())
					sex="MALE";
			}
		});
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBackground(new Color(0, 255, 255));
		rdbtnMale.setBounds(568, 123, 63, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnFemale.isSelected()) {
					sex="FEMALE";
				}
			}
		});
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBackground(new Color(0, 255, 255));
		rdbtnFemale.setBounds(633, 123, 75, 23);
		contentPane.add(rdbtnFemale);
		
		JLabel lblBankAccountNo = new JLabel("Bank Account No.");
		lblBankAccountNo.setBounds(447, 170, 120, 14);
		contentPane.add(lblBankAccountNo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(577, 167, 131, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAadharCardNo = new JLabel("Aadhar Card No.");
		lblAadharCardNo.setBounds(447, 213, 103, 14);
		contentPane.add(lblAadharCardNo);
		
		textField_5 = new JTextField();
		textField_5.setBounds(577, 210, 131, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setBounds(447, 255, 103, 14);
		contentPane.add(lblDesignation);
		
		textField_6 = new JTextField();
		textField_6.setBounds(577, 252, 131, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblBloodGroup = new JLabel("Blood Group");
		lblBloodGroup.setBounds(447, 294, 103, 14);
		contentPane.add(lblBloodGroup);
		
		
		JComboBox comboBox = new JComboBox(list);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				select=comboBox.getSelectedItem().toString();
			}
		});
		comboBox.setBounds(577, 291, 131, 20);
		contentPane.add(comboBox);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String date = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();	
				try {
					
					OracleDataSource ods;
					ods = new OracleDataSource();
									
					ods.setURL("jdbc:oracle:thin:SNANDY/snandy@localhost:1521/XE");
			        Connection con= ods.getConnection();
			        String sql = "insert into EMPLOYEE (Name,DOB,Email,Empid,Password,Sex,Bank,Aadhar,Desg,Bldgrp) values(?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1,textField.getText());
					ps.setString(2,date);
					ps.setString(3,textField_2.getText());
					ps.setString(4,textField_3.getText());
					ps.setString(5,passwordField.getText());
			    	ps.setString(6,sex); 
					ps.setString(7,textField_4.getText());
					ps.setString(8,textField_5.getText());
					ps.setString(9,textField_6.getText());
					ps.setString(10,select);
					int res = ps.executeUpdate();
					if(res>0) {
					JOptionPane.showMessageDialog(null, "NEW USER ID INSERTED");
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
		btnBack.setBounds(447, 369, 89, 23);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Login frame = new Login();
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
	}
}
