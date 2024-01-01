import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Thank_you extends JFrame implements ActionListener {

    JButton b;
	Thank_you(){
		setLayout(null);
		setSize(1000,600);
		setLocation(0,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Thank_you1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500,768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1380,700);
        add(image);
        setSize(10000, 800);
        //setLocation(300, 0);
        setVisible(true);
		
		JLabel l1 = new JLabel("Thank you for Participating.");
		l1.setBounds(350, 10,1000,100);
	    l1.setFont(new Font("Arial", Font.BOLD, 60));
        l1.setForeground(Color.black);
	    image.add(l1);
        b = new JButton("Back to Home page");
        b.addActionListener(this);
        b.setBounds(1,1,150,25);
        image.add(b);
	}
	public static void main(String[] args) {
		new Thank_you();
	}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b){
            new User_Interface().setVisible(true);
            dispose();
        }
        
    }

}
