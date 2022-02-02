package Student_Portal;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class AdminFacultySearchFrame extends JFrame implements ActionListener{
	
	JLabel j1,j2,j3;
	JTextField t1,t2;
	JButton b1,b2,b3;
	
	Faculty_Panel faculty;
	
	AdminFacultySearchFrame(){

		setLayout(null);
        setSize(1200, 700);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.RED);
        j1 = new JLabel("Admin Faculty Search Frame");
        j1.setBounds(200, 10, 270, 100);
        j1.setFont(new Font("MS Sans Serif", Font.PLAIN, 20));
        add(j1);
        j2 = new JLabel("Enter Name: ");
        j2.setBounds(40, 100, 200, 100);
        add(j2);
        t1 = new JTextField(15);
        t1.setBounds(250, 140, 200, 30);
        add(t1);
        j3 = new JLabel("Enter ID : ");
        j3.setBounds(40, 250, 200, 100);
        add(j3);
        t2 = new JTextField(15);
        t2.setBounds(250, 290, 200, 30);
        add(t2);
        b1 = new JButton("Search");
        b1.setBounds(220, 530, 80, 30);
        add(b1);
        b2 = new JButton("Back");
        b2.setBounds(110, 530, 70, 30);
        add(b2);
        b3 = new JButton("Exit");
        b3.setBounds(350, 530, 70, 30);
        add(b3);
        j1.setForeground(Color.white);
        j2.setForeground(Color.white);
        j3.setForeground(Color.white);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
              
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == b1) {
			Faculty_Panel faculty = Admin_Panel.search_faculty(t1.getText(), t2.getText());
			if (faculty != null) {
				dispose();
				FacultyProfileViewFrame a = new FacultyProfileViewFrame(faculty);
			}
				
			else {
				JOptionPane.showMessageDialog(null, "Faculty not found!");
			}		
		}
		else if (src == b2) {
			dispose();
			AdminFacultyFrame a = new AdminFacultyFrame();
		}
		else {
			dispose();
		}
		
	}
}