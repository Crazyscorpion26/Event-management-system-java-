import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JButton b;
    JButton b1;
    JTextField t1;
    JPasswordField p1;
    JButton forgotPasswordButton;
    Login(){
        JLabel l1 = new JLabel("Username: ");
        JLabel l2 = new JLabel("Password: ");
        JLabel l3 = new JLabel("Login here");

        t1 = new JTextField();
        b = new JButton("LOGIN");
        p1 = new JPasswordField();
        l1.setBounds(490, 100, 150, 25);
        l2.setBounds(490, 150, 150, 25);
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        l1.setForeground(Color.black);
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l2.setForeground(Color.black);
        l3.setBounds(600, 10,1000,100);
        l3.setFont(new Font("Arial", Font.BOLD, 30));
        l3.setForeground(Color.black);


        t1.setBounds(600, 100, 200, 25);
        p1.setBounds(600, 150, 200, 25);


        b.setBounds(640, 200, 100, 25);
        b.addActionListener(this);
        setSize(10000, 800);

        b1 = new JButton("Sign up");
        b1.setBounds(640,250,100,25);
        b1.addActionListener(this);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Login.png"));
        Image i2 = i1.getImage().getScaledInstance(1500,768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1500,750);
        add(image);
        setSize(10000, 800);
        //setLocation(300, 0);
        setVisible(true);

        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        image.add(l1);
        image.add(l2);
        image.add(l3);
        image.add(t1);
        image.add(p1);
        image.add(b);
        image.add(b1);

    }
    public static void main(String [] args){

        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Conn c = new Conn();

        if(e.getSource() == b){
            if (t1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "All fields are mandatory");
            }
            else if(p1.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"All fields are mandatory");
            }else if(t1.getText().equals("tester")){
                if(p1.getText().equals("tester")){
                    new Admin().setVisible(true);
                    dispose();
                }
            }

            else {

                String sname = t1.getText();
                String spassword = p1.getText();
                String query = "select * from signup where Name = '"+sname+"' and password = '"+spassword+"'";
                try {
                    ResultSet rs = c.s.executeQuery(query);
                    if (rs.next()) {
                        setVisible(false);
                        new User_Interface().setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect credentials");
                    }
                }catch(Exception e4){
                    System.out.println(e4);
                }
            }



        }
        if(e.getSource() == b1){
            new Signup().setVisible(true);
            dispose();
        }
        if (e.getSource() == forgotPasswordButton) {
            dispose();
        }
    }
}