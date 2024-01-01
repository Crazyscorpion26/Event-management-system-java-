import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registeration extends JFrame implements ActionListener {
    JButton b;
    JButton b1;
    JButton b2;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;
    JTextField t7;
    JTextField t8;
    JTextArea a1;
    Registeration(){

        setSize(10000, 800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Registeration.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500,768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1500,750);
        add(image);
        setSize(10000, 800);
        //setLocation(300, 0);
        setVisible(true);

        JLabel l7 = new JLabel("Registeration here");
        JLabel l1 = new JLabel("Name: ");
        JLabel l2 = new JLabel("Branch: ");
        JLabel l3 = new JLabel("Conatct number: ");
        JLabel l4 = new JLabel("Division: ");
        JLabel l5 = new JLabel("Year: ");
        JLabel l6 = new JLabel("Address: ");
        JLabel l8 = new JLabel("PRN no: ");
        JLabel l9 = new JLabel("Event no: ");
        JLabel l10 = new JLabel("Event name: ");

        l7.setBounds(550, 10,1000,100);
        l1.setBounds(500, 100, 100, 25);
        l2.setBounds(500, 150, 100, 25);
        l3.setBounds(440, 200, 200, 25);
        l4.setBounds(500, 250, 100, 25);
        l5.setBounds(500, 300, 100, 25);
        l6.setBounds(500, 350, 100, 25);
        l8.setBounds(500,400,100,25);
        l9.setBounds(500,450,100,25);
        l10.setBounds(480,500,150,25);

        l1.setFont(new Font("Arial", Font.BOLD, 20));
        l1.setForeground(Color.black);
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l2.setForeground(Color.black);
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        l3.setForeground(Color.black);
        l4.setFont(new Font("Arial", Font.BOLD, 20));
        l4.setForeground(Color.black);
        l5.setFont(new Font("Arial", Font.BOLD, 20));
        l5.setForeground(Color.black);
        l6.setFont(new Font("Arial", Font.BOLD, 20));
        l6.setForeground(Color.black);
        l7.setFont(new Font("Arial", Font.BOLD, 30));
        l7.setForeground(Color.black);
        l8.setFont(new Font("Arial", Font.BOLD, 20));
        l8.setForeground(Color.black);
        l9.setFont(new Font("Arial", Font.BOLD, 20));
        l9.setForeground(Color.black);
        l10.setFont(new Font("Arial", Font.BOLD, 20));
        l10.setForeground(Color.black);

        t1 = new JTextField(20); // name
        t2 = new JTextField(30); // branch
        t3 = new JTextField(12); // Contact number
        t4 = new JTextField(5); // Division
        t5 = new JTextField(50); // College name
        t6 = new JTextField(10); // PRN number
        t7 = new JTextField(10); // Event number
        t8 = new JTextField(10); // Event name
        a1 = new JTextArea(); // Address

        t1.setBounds(600, 100, 200, 25);
        t2.setBounds(600, 150, 200, 25);
        t3.setBounds(600, 200, 200, 25);
        t4.setBounds(600, 250, 200, 25);
        t5.setBounds(600, 300, 200, 25);
        t6.setBounds(600,400,200,25);
        a1.setBounds(600, 350, 200, 25);
        t7.setBounds(600, 450, 200, 25);
        t8.setBounds(600, 500, 200, 25);

        b = new JButton("Submit");
        b.setBounds(580, 550, 100, 25);
        b.addActionListener(this);

        b1 = new JButton("Reset");
        b1.setBounds(700,550,100,25);
        b1.addActionListener(this);

        b2 = new JButton("Back to Home");
        b2.setBounds(1,1,150,25);
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
        image.add(a1);
        image.add(t7);
        image.add(t8);
        image.add(b);
        image.add(b1);
        image.add(b2);


    }
    public static void main(String[] args){
        Registeration r = new Registeration();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Conn c = new Conn();


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
            else if(a1.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"All fields are mandatory");
            }
            else {

                try{
                    String Name = t1.getText();
                    String Branch = t2.getText();
                    String Contact_number = t3.getText();
                    String Division = t4.getText();
                    String Address = a1.getText();

                    String Year = t5.getText();
                    String PRN_no = t6.getText();
                    String ENo = t7.getText();
                    String EName = t8.getText();

                    String query = "insert into reg values('"+Name+"','"+Branch+"', '"+Contact_number+"', '"+Division+"', '"+Address+"', '"+Year+"', '"+PRN_no+"', '"+ENo+"', '"+EName+"')";
                    c.s.executeUpdate(query);

                }
                catch(Exception e1){
                    System.out.println(e1);

                }
                new Submited().setVisible(true);
                dispose();

            }


        }
        if(e.getSource() == b1){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            a1.setText("");
        }
        if(e.getSource() == b2){
            new User_Interface().setVisible(true);
            dispose();
        }
    }
}
