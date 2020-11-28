import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutUs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs frame = new AboutUs();
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
	public AboutUs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 422);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDataBaseManagement = new JLabel("DATA BASE MANAGEMENT SYSTEM");
		lblDataBaseManagement.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDataBaseManagement.setBounds(175, 26, 572, 31);
		contentPane.add(lblDataBaseManagement);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 68, 691, 2);
		contentPane.add(separator);
		
		JLabel lblProjectDoneOn = new JLabel("PROJECT BASED  ON:");
		lblProjectDoneOn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblProjectDoneOn.setBounds(68, 101, 185, 24);
		contentPane.add(lblProjectDoneOn);
		
		JLabel lblJavaOracle = new JLabel("JAVA & ORACLE");
		lblJavaOracle.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblJavaOracle.setBounds(282, 107, 164, 14);
		contentPane.add(lblJavaOracle);
		
		JLabel lblProjectMadeBy = new JLabel("PROJECT MADE BY:");
		lblProjectMadeBy.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblProjectMadeBy.setBounds(68, 151, 164, 14);
		contentPane.add(lblProjectMadeBy);
		
		JTextPane txtpnNameRollNo = new JTextPane();
		txtpnNameRollNo.setEditable(false);
		txtpnNameRollNo.setText("NAME                                                ROLL NO\r\n------------------------------------------------------\r\nSUBRATA NANDY                                  73\r\nSAGAR KUMAR JHA                              74");
		txtpnNameRollNo.setBounds(282, 145, 277, 82);
		contentPane.add(txtpnNameRollNo);
		
		JLabel lblTopicOfProject = new JLabel("TOPIC OF PROJECT:");
		lblTopicOfProject.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTopicOfProject.setBounds(68, 240, 164, 14);
		contentPane.add(lblTopicOfProject);
		
		JLabel lblSalaryManagementSystem = new JLabel("SALARY MANAGEMENT SYSTEM");
		lblSalaryManagementSystem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSalaryManagementSystem.setBounds(282, 238, 277, 14);
		contentPane.add(lblSalaryManagementSystem);
		
		JLabel lblThankYou = new JLabel("THANK YOU   *___*");
		lblThankYou.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblThankYou.setBounds(253, 294, 164, 24);
		contentPane.add(lblThankYou);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btnBack.setBounds(305, 349, 89, 23);
		contentPane.add(btnBack);
	}
}
