import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home extends JFrame implements ActionListener {
	
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	
	Home(){
		setSize(10000, 800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel l1 = new JLabel("WELCOME TO EVENT MANAGEMENT SYSTEM");
        JLabel l2 = new JLabel("About EMS");
        JLabel l3 = new JLabel("EMS stands for Event Management System. This website is responsible for hosting all the events in Warje.");
        JLabel l4 = new JLabel("Contact Us");
        
        l1.setBounds(400, 10,1000,100);
        l1.setFont(new Font("Arial", Font.BOLD, 30));
        
        l2.setBounds(100,200,400,100);
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l3.setBounds(100,300,10000,100);
        l4.setBounds(450,600,200,100);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        
        b1 = new JButton("List of Events");
        b1.addActionListener(this);
        b1.setBounds(450,400,200,100);
        add(b1);
        
        
		
	}
	public static void main(String[] args) {
		
		new Home();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			new List_of_Events_upcoming().setVisible(true);
			dispose();
		}
		
	}

}
