import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 414);
		setSize(1200,600);
		setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToSalary = new JLabel("WELCOME TO SALARY MANAGEMENT SYSTEM");
		lblWelcomeToSalary.setFont(new Font("Vladimir Script", Font.BOLD, 35));
		lblWelcomeToSalary.setBounds(161, 11, 1013, 43);
		contentPane.add(lblWelcomeToSalary);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 85, 1164, 2);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminLogin frame = new AdminLogin();
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
		Image img= new ImageIcon(this.getClass().getResource("/ad.jpg")).getImage();
		btnNewButton.setIcon(new ImageIcon(img));
		btnNewButton.setBounds(24, 167, 305, 298);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		Image img1= new ImageIcon(this.getClass().getResource("/user.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(img1));
		btnNewButton_1.setBounds(481, 211, 237, 236);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AboutUs frame = new AboutUs();
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
		Image img2= new ImageIcon(this.getClass().getResource("/about.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(img2));
		btnNewButton_2.setBounds(844, 183, 305, 282);
		contentPane.add(btnNewButton_2);
		
		JLabel lblAdmins = new JLabel("Admins");
		lblAdmins.setBounds(138, 488, 71, 14);
		contentPane.add(lblAdmins);
		
		JLabel lblEmployees = new JLabel("Employees");
		lblEmployees.setBounds(586, 488, 82, 14);
		contentPane.add(lblEmployees);
		
		JLabel lblAboutUs = new JLabel("About Us");
		lblAboutUs.setBounds(958, 488, 71, 14);
		contentPane.add(lblAboutUs);
	}
}
