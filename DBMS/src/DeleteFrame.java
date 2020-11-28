import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import oracle.jdbc.pool.OracleDataSource;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

public class DeleteFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteFrame frame = new DeleteFrame();
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
	public DeleteFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSid = new JLabel("EMLOYEE_ID");
		lblSid.setBounds(53, 99, 116, 14);
		contentPane.add(lblSid);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String empid = textField.getText();
				String x=empid;
				OracleDataSource ods;
				try {
					ods = new OracleDataSource();
					ods.setURL("jdbc:oracle:thin:SNANDY/snandy@localhost:1521/XE");
			        Connection con= ods.getConnection();
			        String sql = "DELETE  FROM SALARY where empid=?";
			        String sq="DELETE FROM EMPLOYEE where empid=?";
					PreparedStatement ps=con.prepareStatement(sql);
					PreparedStatement pes=con.prepareStatement(sq);
					ps.setString(1,empid);
					pes.setString(1,empid);
					int res = ps.executeUpdate();
					int re=pes.executeUpdate();
					if(res>0) {
					JOptionPane.showMessageDialog(null, "EMPLOYEE Deleted");
					}
					
						
						
				} 
					
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "EMPLOYEE NOT FOUND WITH SALARY!!!!!!!");
					
				}
			}
		});
		btnDelete.setBounds(48, 189, 89, 23);
		contentPane.add(btnDelete);
		
		textField = new JTextField();
		textField.setBounds(235, 96, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
			}
		});
		btnBack.setBounds(232, 189, 89, 23);
		contentPane.add(btnBack);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 43, 414, 2);
		contentPane.add(separator);
		
		JLabel lblDeleteEmployee = new JLabel("DELETE EMPLOYEE");
		lblDeleteEmployee.setFont(new Font("Vladimir Script", Font.BOLD, 26));
		lblDeleteEmployee.setBounds(84, 11, 281, 34);
		contentPane.add(lblDeleteEmployee);
	}
}
