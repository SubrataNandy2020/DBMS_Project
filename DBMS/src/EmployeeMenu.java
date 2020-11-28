import java.awt.BorderLayout;
import java.awt.Dimension;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeMenu frame = new EmployeeMenu();
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
	public EmployeeMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 858, 634);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeMenu = new JLabel("MENU\r\n");
		lblEmployeeMenu.setFont(new Font("Vladimir Script", Font.BOLD, 35));
		lblEmployeeMenu.setBounds(360, 11, 153, 32);
		contentPane.add(lblEmployeeMenu);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 54, 822, 2);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Select frame = new Select();
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
		btnNewButton.setBounds(32, 67, 250, 265);
		contentPane.add(btnNewButton);
		Image img1= new ImageIcon(this.getClass().getResource("/ev.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img1));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EmployeeSalary frame = new EmployeeSalary();
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
		btnNewButton_1.setBounds(597, 67, 216, 265);
		contentPane.add(btnNewButton_1);
		Image img2= new ImageIcon(this.getClass().getResource("/es.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(img2));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EUpdate frame = new EUpdate();
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
		btnNewButton_2.setBounds(333, 332, 216, 227);
		contentPane.add(btnNewButton_2);
		Image img3= new ImageIcon(this.getClass().getResource("/eu.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(img3));
		
		JLabel lblViewYourProfile = new JLabel("View Your Profile");
		lblViewYourProfile.setBounds(113, 343, 114, 14);
		contentPane.add(lblViewYourProfile);
		
		JLabel lblSeeYourPay = new JLabel("See Your PaySlip");
		lblSeeYourPay.setBounds(670, 343, 114, 14);
		contentPane.add(lblSeeYourPay);
		
		JLabel lblNewLabel = new JLabel("Update Information");
		lblNewLabel.setBounds(399, 570, 114, 14);
		contentPane.add(lblNewLabel);
	}

}
