import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import oracle.jdbc.pool.OracleDataSource;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class CreateSalary extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	public double payment,p1,p2,p3,total;
	public double deduction,d1,d2,d3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateSalary frame = new CreateSalary();
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
	public CreateSalary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 460);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddSalaryTo = new JLabel("ADD SALARY TO EMPLOYEE");
		lblAddSalaryTo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAddSalaryTo.setBounds(212, 11, 291, 38);
		contentPane.add(lblAddSalaryTo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 48, 680, 2);
		contentPane.add(separator);
		
		JLabel lblEmployeeId = new JLabel("Employee Id");
		lblEmployeeId.setBounds(20, 71, 96, 14);
		contentPane.add(lblEmployeeId);
		
		textField = new JTextField();
		textField.setBounds(162, 68, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Payments");
		lblNewLabel.setBounds(134, 99, 62, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pay");
		lblNewLabel_1.setBounds(70, 158, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDa = new JLabel("DA");
		lblDa.setBounds(70, 199, 46, 14);
		contentPane.add(lblDa);
		
		JLabel lblTravelAllowance = new JLabel("Travel Allowance");
		lblTravelAllowance.setBounds(70, 243, 106, 14);
		contentPane.add(lblTravelAllowance);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 126, 291, 14);
		contentPane.add(separator_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 155, 111, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(200, 196, 111, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(200, 240, 111, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDeductions = new JLabel("Deductions");
		lblDeductions.setBounds(513, 99, 78, 14);
		contentPane.add(lblDeductions);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(395, 126, 284, 2);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_2 = new JLabel("Licence Fee");
		lblNewLabel_2.setBounds(435, 158, 68, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblIncomeTax = new JLabel("Income Tax");
		lblIncomeTax.setBounds(435, 199, 68, 14);
		contentPane.add(lblIncomeTax);
		
		JLabel lblMisc = new JLabel("Misc");
		lblMisc.setBounds(435, 243, 46, 14);
		contentPane.add(lblMisc);
		
		textField_4 = new JTextField();
		textField_4.setBounds(548, 155, 96, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(548, 196, 96, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(548, 240, 96, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(24, 268, 303, 2);
		contentPane.add(separator_3);
		
		JLabel lblTotalPayments = new JLabel("Total Payments");
		lblTotalPayments.setBounds(70, 293, 86, 14);
		contentPane.add(lblTotalPayments);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(200, 290, 111, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(395, 268, 284, 2);
		contentPane.add(separator_4);
		
		JLabel lblTotalDeductions = new JLabel("Total Deductions");
		lblTotalDeductions.setBounds(435, 293, 106, 14);
		contentPane.add(lblTotalDeductions);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(548, 290, 96, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(20, 329, 656, 2);
		contentPane.add(separator_5);
		
		JLabel lblNetPayment = new JLabel("NET PAYMENT");
		lblNetPayment.setBounds(265, 346, 96, 14);
		contentPane.add(lblNetPayment);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(371, 342, 110, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 p1=Double.parseDouble(textField_1.getText());
				 p2=Double.parseDouble(textField_2.getText());
				 p3=Double.parseDouble(textField_3.getText());
				 d1=Double.parseDouble(textField_4.getText());
				 d2=Double.parseDouble(textField_5.getText());
				 d3=Double.parseDouble(textField_6.getText());
				payment=p1+p2+p3;
				deduction=d1+d2+d3;
				total=payment-deduction;
				String pay=Double.toString(payment);
				String ded=Double.toString(deduction);
				String net=Double.toString(total);
				textField_7.setText(pay);
				textField_8.setText(ded);
				textField_9.setText(net);
			
				
			}
		});
		btnCalculate.setBounds(107, 387, 89, 23);
		contentPane.add(btnCalculate);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					OracleDataSource ods;
					ods = new OracleDataSource();
									
					ods.setURL("jdbc:oracle:thin:SNANDY/snandy@localhost:1521/XE");
			        Connection con= ods.getConnection();
			        String sql = "insert into SALARY values(?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1,textField.getText());
					ps.setString(2,textField_1.getText());
					ps.setString(3,textField_2.getText());
					ps.setString(4,textField_3.getText());
					ps.setString(5,textField_4.getText());
			    	ps.setString(6,textField_5.getText()); 
					ps.setString(7,textField_6.getText());
					ps.setString(8,textField_7.getText());
					ps.setString(9,textField_8.getText());
					ps.setString(10,textField_9.getText());
					int res = ps.executeUpdate();
					if(res>0) {
					JOptionPane.showMessageDialog(null, "SALARY INSERTED");
					}
					
						
						
				} 
					
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "FAULT!!!!!!!!!!COMPLETE ALL DETAILS AGAIN");
					
				} 
			}
		});
		btnSave.setBounds(345, 387, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AfterAdmin frame=new AfterAdmin();
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
		btnBack.setBounds(568, 387, 89, 23);
		contentPane.add(btnBack);
	}
	
}
