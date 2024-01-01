import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Already_performer extends JFrame implements ActionListener {
	
	JButton b;
    JButton b1;
    JButton b2;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	JTextField t5;
	JTextField t6;
	JTextArea t7;
	JTextArea t8;
	Already_performer(){
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
        
        JLabel l9 = new JLabel("Already participants");
        JLabel l1 = new JLabel("Name: ");
        JLabel l2 = new JLabel("PRN no: ");
        JLabel l3 = new JLabel("Contact no: ");
        JLabel l4 = new JLabel("Division: ");
        JLabel l5 = new JLabel("Branch: ");
        JLabel l6 = new JLabel("Year: ");
        JLabel l7 = new JLabel("Video(max 2 mins): ");
        JLabel l8 = new JLabel("Describe your talent: ");
        
        l9.setBounds(550, 10,1000,100);
        l9.setFont(new Font("Arial", Font.BOLD, 30));
        l9.setForeground(Color.black);

        l1.setBounds(500,100,100,25);
        l2.setBounds(500,150,100,25);
        l3.setBounds(500,200,130,25);
        l4.setBounds(500,250,100,25);
        l5.setBounds(500,300,100,25);
        l6.setBounds(500,350,100,25);
        l7.setBounds(430,400,200,25);
        l8.setBounds(410,450,220,25);

    l1.setFont(new Font("Arial",Font.BOLD,20));
    l1.setForeground(Color.black);
    l2.setFont(new Font("Arial",Font.BOLD,20));
    l2.setForeground(Color.black);
    l3.setFont(new Font("Arial",Font.BOLD,20));
    l3.setForeground(Color.black);
    l4.setFont(new Font("Arial",Font.BOLD,20));
    l4.setForeground(Color.black);
    l5.setFont(new Font("Arial",Font.BOLD,20));
    l5.setForeground(Color.black);
    l6.setFont(new Font("Arial",Font.BOLD,20));
    l6.setForeground(Color.black);
    l7.setFont(new Font("Arial",Font.BOLD,20));
    l7.setForeground(Color.black);
    l8.setFont(new Font("Arial",Font.BOLD,20));
    l8.setForeground(Color.black);
    
        
        t1 = new JTextField(30); // Name
        t2 = new JTextField(30); // PRN no.
        t3 = new JTextField(30); // Contact number
        t4 = new JTextField(6); // Division
        t5 = new JTextField(10); // Branch
        t6 = new JTextField(20); // Year
        t7 = new JTextArea();
        t8 = new JTextArea();
        
        t1.setBounds(620,100,200,25);
        t2.setBounds(620,150,200,25);
        t3.setBounds(620,200,200,25);
        t4.setBounds(620,250,200,25);
        t5.setBounds(620,300,200,25);
        t6.setBounds(620,350,200,25);
        t7.setBounds(620,400,200,25);
        t8.setBounds(620,450,200,25);
        
        b = new JButton("Submit");
        b.addActionListener(this);
        b.setBounds(580,550,100,25);

        b1 = new JButton("Back to Home");
        b1.setBounds(1,1,150,25);
        b1.addActionListener(this);

        b2 = new JButton("Reset");
        b2.setBounds(700,550,100,25);
        b2.addActionListener(this);
        
        image.add(l9);
        image.add(l1);
        image.add(l2);
        image.add(l3);
        image.add(l4);
        image.add(l5);
        image.add(l6);
        image.add(l7);
        image.add(l8);
        image.add(t1);
        image.add(t2);
        image.add(t3);
        image.add(t4);
        image.add(t5);
        image.add(t6);
        image.add(t7);
        image.add(t8);
        image.add(b);
        image.add(b1);
        image.add(b2);
        
	}

	public static void main(String[] args) {
		
		new Already_performer();
        

	}

	@Override
	public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b2){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
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
           

            else{
                try{
                    String Name = t1.getText();
                    String PRN_no = t2.getText();
                    String Contact_no = t3.getText();
                    String Division = t4.getText();
                    String Branch = t5.getText();
                    String Year = t6.getText();
                    String Video = t7.getText();
                    String About_talent = t8.getText();




                    Conn c = new Conn();
                    String query = "insert into Already_performer values('"+Name+"','"+PRN_no+"', '"+Contact_no+"', '"+Division+"', '"+Branch+"', '"+Year+"', '"+Video+"', '"+About_talent+"')";
                    c.s.executeUpdate(query);

                }
                catch(Exception e1){
                    System.out.println(e1);

                }
                new Thank_you().setVisible(true);
                dispose();
		}

			
		}
		
	}

}
