import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Performer extends JFrame implements ActionListener {
	
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
	
	Performer(){
		
	    setSize(10000, 800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    JLabel l1 = new JLabel("Performer form");
    l1.setBounds(550, 10,1000,100);
    l1.setFont(new Font("Arial", Font.PLAIN, 30));

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Performer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500,768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1500,750);
        add(image);
        setSize(10000, 800);
        //setLocation(300, 0);
        setVisible(true);

    
    JLabel l2 = new JLabel("Name: ");
    JLabel l3 = new JLabel("PRN no :");
    JLabel l4 = new JLabel("Contact no: ");
    JLabel l5 = new JLabel("About talent: ");
    JLabel l6 = new JLabel("Division: ");
    JLabel l7 = new JLabel("Year: ");
    JLabel l8 = new JLabel("Branch: ");
    JLabel l9 = new JLabel("Address: ");
    JLabel l10 = new JLabel("video: ");
    
    l1.setBounds(500,50,1000,50);
    l2.setBounds(480,150,100,25);
    l3.setBounds(480,200,100,25);
    l4.setBounds(480,250,150,25);
    l5.setBounds(480,300,150,25);
    l6.setBounds(480,350,100,25);
    l7.setBounds(480,400,100,25);
    l8.setBounds(480,450,100,25);
    l9.setBounds(480,500,100,25);
    l10.setBounds(480,550,150,25);

    l1.setFont(new Font("Arial",Font.BOLD,50));
    l1.setForeground(Color.white);
    l2.setFont(new Font("Arial",Font.BOLD,20));
    l2.setForeground(Color.white);
    l3.setFont(new Font("Arial",Font.BOLD,20));
    l3.setForeground(Color.white);
    l4.setFont(new Font("Arial",Font.BOLD,20));
    l4.setForeground(Color.white);
    l5.setFont(new Font("Arial",Font.BOLD,20));
    l5.setForeground(Color.white);
    l6.setFont(new Font("Arial",Font.BOLD,20));
    l6.setForeground(Color.white);
    l7.setFont(new Font("Arial",Font.BOLD,20));
    l7.setForeground(Color.white);
    l8.setFont(new Font("Arial",Font.BOLD,20));
    l8.setForeground(Color.white);
    l9.setFont(new Font("Arial",Font.BOLD,20));
    l9.setForeground(Color.white);
    l10.setFont(new Font("Arial",Font.BOLD,20));
    l10.setForeground(Color.white);

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
    b.addActionListener(this);
    b.setBounds(580,600,100,25);

    b1 = new JButton("Back to Home");
    b1.setBounds(1,1,150,25);
    b1.addActionListener(this);

    b2 = new JButton("Reset");
    b2.setBounds(700,600,100,25);
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
		
        new Performer();
     
        

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
            t9.setText("");

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
			else {


                try{
                    String Name = t1.getText();
                    String PRN_no = t2.getText();
                    String Contact_no = t3.getText();
                    String About_talent = t4.getText();
                    String Division = t5.getText();
                    String Year = t6.getText();
                    String Branch = t7.getText();
                    String Address = t8.getText();
                    String video = t9.getText();



                    Conn c = new Conn();
                    String query = "insert into Performer values('"+Name+"','"+PRN_no+"', '"+Contact_no+"', '"+About_talent+"', '"+Division+"', '"+Year+"', '"+Branch+"', '"+Address+"', '"+video+"')";
                    c.s.executeUpdate(query);

                }
                catch(Exception e1){
                    System.out.println(e1);

                }
                new Feedback().setVisible(true);
                dispose();

            }
			
			}
		}
		
	}



