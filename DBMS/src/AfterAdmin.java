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
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AfterAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfterAdmin frame = new AfterAdmin();
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
	public AfterAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 769);
		setResizable(false);
		//setSize(800,600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setFont(new Font("Vladimir Script", Font.BOLD, 35));
		lblNewLabel.setBounds(354, 11, 145, 54);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 58, 842, 14);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					CreateAdmin frame= new CreateAdmin();
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
		btnNewButton.setBounds(57, 126, 236, 233);
		contentPane.add(btnNewButton);
		Image img= new ImageIcon(this.getClass().getResource("/e.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img));
		
		JLabel lblViewAllEmployees = new JLabel("View All Employees");
		lblViewAllEmployees.setBounds(128, 372, 128, 14);
		contentPane.add(lblViewAllEmployees);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					CreateSalary frame= new CreateSalary();
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
		btnNewButton_1.setBounds(511, 126, 258, 233);
		contentPane.add(btnNewButton_1);
		Image img1= new ImageIcon(this.getClass().getResource("/sal.jpg")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(img1));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					ViewSalary frame= new ViewSalary();
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
		btnNewButton_2.setBounds(65, 436, 247, 233);
		contentPane.add(btnNewButton_2);
		Image img2= new ImageIcon(this.getClass().getResource("/z.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(img2));
		
		JLabel lblAddSalary = new JLabel("Add Salary");
		lblAddSalary.setBounds(611, 372, 74, 14);
		contentPane.add(lblAddSalary);
		
		JLabel lblViewSalary = new JLabel("View Salary");
		lblViewSalary.setBounds(156, 683, 100, 14);
		contentPane.add(lblViewSalary);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				DeleteFrame frame= new DeleteFrame();
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
		btnNewButton_3.setBounds(529, 436, 258, 233);
		contentPane.add(btnNewButton_3);
		Image img3= new ImageIcon(this.getClass().getResource("/del.png")).getImage();
		btnNewButton_3.setIcon(new ImageIcon(img3));
		
		JLabel lblDelete = new JLabel("Delete");
		lblDelete.setBounds(639, 683, 46, 14);
		contentPane.add(lblDelete);
		
	}
}
