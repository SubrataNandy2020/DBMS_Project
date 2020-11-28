import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import oracle.jdbc.pool.OracleDataSource;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	public static JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 433);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setForeground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				JFrame frame=new Create();				
				frame.setVisible(true);
				//frame.setLocationto(null);
				 Toolkit t=Toolkit.getDefaultToolkit();
				 Dimension d = t.getScreenSize();
				 int width=frame.getWidth();
				 int height=frame.getHeight();
				 int x=(d.width -width)/2;
				 int y=(d.height- height)/2;
				 frame.setLocation(x,y);
			}
		});
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OracleDataSource ods;
				try {
					
					ods=new OracleDataSource();
				ods.setURL("jdbc:oracle:thin:SNANDY/snandy@localhost:1521/XE");
		        Connection con= ods.getConnection();
				String sql="select empid,password from employee where empid=? and password=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, textField.getText());
				ps.setString(2,passwordField.getText());
			    ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					JOptionPane.showMessageDialog(null,"LOGIN SUCCESSFULLY");
					dispose();
					
					
					
					JFrame frame=new EmployeeMenu();				
					frame.setVisible(true);
					//frame.setLocationto(null);
					 Toolkit t=Toolkit.getDefaultToolkit();
					 Dimension d = t.getScreenSize();
					 int width=frame.getWidth();
					 int height=frame.getHeight();
					 int x=(d.width -width)/2;
					 int y=(d.height- height)/2;
					 frame.setLocation(x,y);
				
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"LOGIN FAILED");
					
				}
			}
				catch(SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane.showMessageDialog(null,e);
					
				}
				
			}
		});
		btnLogin.setBounds(160, 345, 89, 23);
		contentPane.add(btnLogin);
		btnSignUp.setBounds(459, 345, 89, 23);
		contentPane.add(btnSignUp);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				    dispose();
				    Home frame = new Home();
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
		btnBack.setBounds(312, 345, 89, 23);
		contentPane.add(btnBack);
		btnLogin.setBounds(160, 345, 89, 23);
		
		textField = new JTextField();
		textField.setBounds(291, 211, 153, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPassword.setBounds(87, 265, 162, 20);
		contentPane.add(lblPassword);
		
		JLabel lblUserId = new JLabel("EMPLOYEE ID");
		lblUserId.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblUserId.setBounds(87, 202, 147, 35);
		contentPane.add(lblUserId);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(291, 268, 153, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 97, 730, 344);
		contentPane.add(lblNewLabel);
		Image img= new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN ");
		lblNewLabel_1.setFont(new Font("Vladimir Script", Font.BOLD, 40));
		lblNewLabel_1.setBounds(258, 34, 186, 67);
		contentPane.add(lblNewLabel_1);
		
		

		
	
		
	}
}
