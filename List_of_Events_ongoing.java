import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class List_of_Events_ongoing extends JFrame implements ActionListener {
    // frame
    
    // Table
    JTable j;
    JButton b;
 
    // Constructor
    List_of_Events_ongoing()
    {

        /*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("events.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500,768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1500,750);
        add(image);
        setSize(10000, 800);
        //setLocation(300, 0);
        setVisible(true);*/
        b = new JButton("Back to Home");
        b.setBounds(1,1,150,25);
        b.addActionListener(this);
        add(b);

        String[][] data = {
            { "1","Vishwakarandak","23-11-2022","9.00 am","Sharad Arena","Click here" },
            { "2","Vishwautsav","23-12-2022","9.00 am","Sharad Arena","Click here" },
            {"3","Melange","1-1-2023","10.00 am","Sharad Arena","Click here"}
        };
 
        // Column Names
        String[] columnNames = { "Sr.no", "Name of Event", "Date","Timing","Venue","For more info" };
 
        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 200, 200, 300);

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);

        add(sp);
        // Frame Size
        setSize(10000, 800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    // Driver  method
    public static void main(String[] args)
    {
        new List_of_Events_ongoing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b){
            new User_Interface().setVisible(true);
            dispose();
        }
        
    }
}