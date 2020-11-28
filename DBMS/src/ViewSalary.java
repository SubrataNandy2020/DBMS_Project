import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;
import oracle.jdbc.pool.OracleDataSource;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Toolkit;

public class ViewSalary extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblTotalNoOf;
	private JButton btnBack;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSalary frame = new ViewSalary();
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
	public ViewSalary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 471);
		setSize(1366,768);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Load");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					OracleDataSource ods;
					ods = new OracleDataSource();
									
					ods.setURL("jdbc:oracle:thin:SNANDY/snandy@localhost:1521/XE");
			        Connection con= ods.getConnection();
			        String sql = "select s.empid,e.name,e.email,e.SEX,e.password,e.desg,e.bldgrp,s.pay,s.da,s.travel_allowance,s.LICENCE_FEE,s.INCOME_TAX,s.MISC,s.TOTAL_PAY,s.TOTAL_DED,s.NET_PAYMENT from salary s,employee e where s.empid=e.empid";
					PreparedStatement ps=con.prepareStatement(sql);
					ResultSet res = ps.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(res));
												
						
				} 
					
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "FAULT!!!!!!!!!!COMPLETE ALL DETAILS AGAIN");
					
				} 
			}
				
			
		});
		btnNewButton.setBounds(449, 695, 89, 23);
		contentPane.add(btnNewButton);
		
		lblTotalNoOf = new JLabel("SALARY OF ALL EMPLOYEES");
		lblTotalNoOf.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTotalNoOf.setBounds(491, 11, 398, 27);
		contentPane.add(lblTotalNoOf);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					AfterAdmin frame= new AfterAdmin();
					frame.setVisible(true);
					Toolkit t=Toolkit.getDefaultToolkit();
					 Dimension d = t.getScreenSize();
					 int width=frame.getWidth();
					 int height=frame.getHeight();
					 int x=(d.width -width)/2;
					 int y=(d.height- height)/2;
					 frame.setLocation(x,y);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnBack.setBounds(760, 695, 89, 23);
		contentPane.add(btnBack);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 58, 1330, 626);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
