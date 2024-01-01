import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Event_details_upcoming extends JFrame implements ActionListener{
	JButton b;
    JButton b1;
    JButton b2;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextArea t4;
	JTextField t5;
	JTextField t6;
	JTextField t7;
	JTextArea t8;
	JTextArea t9;
    Event_details_upcoming(){

        setSize(10000, 800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("event.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500,768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1500,768);
        add(image);
        setSize(10000, 800);
        //setLocation(300, 0);
        setVisible(true);

        JLabel l1 = new JLabel("Performer form");
        l1.setBounds(550, 10,1000,100);
        l1.setFont(new Font("Arial", Font.BOLD, 30));

        JLabel l2 = new JLabel("Name: ");
        JLabel l3 = new JLabel("PRN no :");
        JLabel l4 = new JLabel("Contact no: ");
        JLabel l5 = new JLabel("About talent: ");
        JLabel l6 = new JLabel("Division: ");
        JLabel l7 = new JLabel("Year: ");
        JLabel l8 = new JLabel("Branch: ");
        JLabel l9 = new JLabel("Address: ");
        JLabel l10 = new JLabel("2 mins video: ");

        l1.setBounds(500,100,100,25);
        l2.setBounds(500,150,100,25);
        l3.setBounds(500,200,100,25);
        l4.setBounds(500,250,100,25);
        l5.setBounds(500,300,100,25);
        l6.setBounds(500,350,100,25);
        l7.setBounds(500,400,100,25);
        l8.setBounds(500,450,100,25);
        l9.setBounds(500,500,100,25);
        l10.setBounds(500,550,100,25);

        t1 = new JTextField(30);  //name
        t2 = new JTextField(10); // PRN number
        t3 = new JTextField(12); // contact number
        t4 = new JTextArea(); // About talent
        t5 = new JTextField(6); // Division
        t6 = new JTextField(20); // Year
        t7 = new JTextField(30); // Branch
        t8 = new JTextArea(); // Address
        t9 = new JTextArea(); // 2 mins video

        t1.setBounds(600,150,200,25);
        t2.setBounds(600,200,200,25);
        t3.setBounds(600,250,200,25);
        t4.setBounds(600,300,200,25);
        t5.setBounds(600,350,200,25);
        t6.setBounds(600,400,200,25);
        t7.setBounds(600,450,200,25);
        t8.setBounds(600,500,200,25);
        t9.setBounds(600,550,200,25);

        b = new JButton("Submit");
        b.setBounds(600,600,200,25);
        b.addActionListener(this);

        b1 = new JButton("Back to Home");
        b1.setBounds(1,1,150,25);
        b1.addActionListener(this);

        b2 = new JButton("Register here");
        b2.setBounds(730,600,150,25);
        b2.addActionListener(this);




        image.add(l1);
        image.add(l2);
        image.add(l3);
        image.add(l4);
        image.add(l5);
        image.add(l6);
        image.add(l7);
        image.add(l8);
        image.add(l9);
        image.add(l10);
        image.add(t1);
        image.add(t2);
        image.add(t3);
        image.add(t4);
        image.add(t5);
        image.add(t6);
        image.add(t7);
        image.add(t8);
        image.add(t9);
        image.add(b);
        image.add(b1);
        image.add(b2);
    }

    public static void main(String[] args) {

        new Event_details();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b2){
            new Registeration().setVisible(true);
            dispose();
        }

        if(e.getSource() == b1){
            new User_Interface().setVisible(true);
            dispose();
        }
		
		if(e.getSource() == b) {
			if (t1.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "All fields are mandatory");
			}
			else if(t2.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"All fields are mandatory");
			}
			else if(t3.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"All fields are mandatory");
			}
			else if(t4.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"All fields are mandatory");
			}
			else if(t5.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"All fields are mandatory");
			}
			else if(t6.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"All fields are mandatory");
			}
			else if(t7.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"All fields are mandatory");
			}
            else if(t8.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"All fields are mandatory");
			}
            else if(t9.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"All fields are mandatory");
			}

            else{
			new Submited().setVisible(true);
            dispose();
		}
		}
	}

}