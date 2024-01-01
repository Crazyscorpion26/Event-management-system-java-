import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

class Admin {

    private JFrame frame;
    private JTextField admin1;
    private JTextField name;
    private JTextField edate;
    private JTextField evenue;
    private JTextField etime;
    private JTextField edes;
    private JButton b1;
    private JButton b2;
   // String driverName = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql:///Event_Management_system";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
       EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Admin window = new Admin();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Admin() {
        initialize();
    }


    private void initialize() {
        frame = new JFrame();
        frame.setSize( 10000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel event_no = new JLabel("Event no");
        event_no.setFont(new Font("Tahoma", Font.BOLD, 12));
        event_no.setBounds(500, 100, 100, 25);
        frame.getContentPane().add(event_no);

        JLabel admin_access = new JLabel("Admin Access");
        admin_access.setFont(new Font("Arial", Font.BOLD, 25));
        admin_access.setBounds(600, 10,1000,100);
        frame.getContentPane().add(admin_access);

        admin1 = new JTextField();
        admin1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        admin1.setBounds(600, 100, 200, 25);
        frame.getContentPane().add(admin1);
        admin1.setColumns(10);

        JLabel name_of_event = new JLabel("Name of event:  ");
        name_of_event.setFont(new Font("Tahoma", Font.BOLD, 12));
        name_of_event.setBounds(480, 150, 150, 25);
        frame.getContentPane().add(name_of_event);

        name = new JTextField();
        name.setFont(new Font("Tahoma", Font.PLAIN, 12));
        name.setBounds(600, 150, 200, 25);
        frame.getContentPane().add(name);
        name.setColumns(10);

        JLabel date = new JLabel("Date");
        date.setFont(new Font("Tahoma", Font.BOLD, 12));
        date.setBounds(500, 200, 100, 25);
        frame.getContentPane().add(date);

        edate = new JTextField();
        edate.setFont(new Font("Tahoma", Font.PLAIN, 12));
        edate.setBounds(600, 200, 200, 25);
        frame.getContentPane().add(edate);
        edate.setColumns(10);

        JLabel venue = new JLabel("Venue");
        venue.setFont(new Font("Tahoma", Font.BOLD, 12));
        venue.setBounds(500, 250, 100, 25);
        frame.getContentPane().add(venue);

        evenue = new JTextField();
        evenue.setFont(new Font("Tahoma", Font.PLAIN, 12));
        evenue.setBounds(600, 250, 200, 25);
        frame.getContentPane().add(evenue);
        evenue.setColumns(10);

        JLabel time = new JLabel("Time");
        time.setFont(new Font("Tahoma", Font.BOLD, 12));
        time.setBounds(500, 300, 100, 25);
        frame.getContentPane().add(time);

        etime = new JTextField();
        etime.setFont(new Font("Tahoma", Font.PLAIN, 12));
        etime.setBounds(600, 300, 200, 25);
        frame.getContentPane().add(etime);
        etime.setColumns(10);

        JLabel des = new JLabel("Description");
        des.setFont(new Font("Tahoma", Font.BOLD, 12));
        des.setBounds(500, 350, 100, 25);
        frame.getContentPane().add(des);

        edes = new JTextField();
        edes.setFont(new Font("Tahoma", Font.PLAIN, 12));
        edes.setBounds(600, 350, 200, 25);
        frame.getContentPane().add(edes);
        edes.setColumns(10);

        b1 = new JButton("Back to login");
        b1.setBounds(0,0,150,25);
        b1.setFont(new Font("Tahoma", Font.BOLD, 13));
        frame.getContentPane().add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login().setVisible(true);

            }
        });
        b2 = new JButton("RESET");
        b2.setFont(new Font("Tahoma", Font.BOLD, 13));
        b2.setBounds(920,400,100,25);
        frame.getContentPane().add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                admin1.setText("");
                name.setText("");
                edate.setText("");
                evenue.setText("");
                etime.setText("");
                edes.setText("");

            }
        });




        JButton btnNewButton = new JButton("ADD");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String No = admin1.getText();
                String Name = name.getText();
                String Date = edate.getText();
                String Venue = evenue.getText();
                String Time = etime.getText();
                String Description = edes.getText();
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
                    String query = "INSERT INTO Event_ongoing values('" + No + "','" + Name + "','" + Date +"','" + Venue + "','" + Time + "','" + Description +  "')";
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);

                    JOptionPane.showMessageDialog(btnNewButton,"data for "+ Name + " added sucessfully ");

                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }

        });

        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNewButton.setBounds(400, 400, 100, 25);
        frame.getContentPane().add(btnNewButton);

        JButton btnDisplay = new JButton("DISPLAY");
        btnDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Display().showTableData();
            }
        });
        btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnDisplay.setBounds(790, 400, 100, 25);
        frame.getContentPane().add(btnDisplay);

        JButton btnUpdate = new JButton("UPDATE");
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new UpdateStud().updateTableData();

            }
        });
        btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnUpdate.setBounds(530, 400, 100, 25);
        frame.getContentPane().add(btnUpdate);

        JButton btnDelete = new JButton("DELETE");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new DeleteStud().deleteTableData();
            }
        });
        btnDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnDelete.setBounds(660, 400, 100, 25);
        frame.getContentPane().add(btnDelete);
    }

    public void setVisible(boolean b) {
        frame.setVisible(true);
    }
}


class Display {


    String driverName = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql:///Event_Management_system";
    static final String USER = "root";
    static final String PASS = "root";
    public void showTableData() {

        JFrame frame1 = new JFrame("Database Result");
        JTable table;

        String[] columnNames = {"No","Name" ,"Date","Venue","Time","Description"};

        //frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setLayout(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);

        table = new JTable();

        table.setModel(model);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        table.setFillsViewportHeight(true);

        JScrollPane scroll = new JScrollPane(table);

        scroll.setHorizontalScrollBarPolicy(

                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(

                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
            String sql = "select * from Event_ongoing";
            Statement ps =  con.createStatement();
            ResultSet rs = ps.executeQuery(sql);

            int i = 0;
            while(rs.next())
            {
                String No = rs.getString(1);
                String Name =rs.getString(2);
                String Date =rs.getString(3);
                String Venue =rs.getString(4);
                String Time =rs.getString(5);
                String Description =rs.getString(6);

                model.addRow(new Object[]{No,Name,Date,Venue,Time,Description });
                i++;
            }
            if(i <1)
            {
                JOptionPane.showMessageDialog(null, "No Record Found","Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            if(i ==1)
            {
                System.out.println(i+" Record Found");
            }
            else
            {
                System.out.println(i+" Records Found");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        frame1.add(scroll);
        frame1.setVisible(true);
        frame1.setSize(400,300);
    }

}

//UpdatStud.java


class UpdateStud {
    //String driverName = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql:///Event_Management_system";
    static final String USER = "root";
    static final String PASS = "root";
    public void updateTableData() {

        try {
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            InputDialogInFrame frame = new InputDialogInFrame();
            String m1 = JOptionPane.showInputDialog(frame, "Enter Number of event to update a record");
            if(m1.isEmpty()){
                frame.closeIt();
            }
            String m = JOptionPane.showInputDialog(frame, "New value for Event name");
            if(m.isEmpty()){
                frame.closeIt();
            }

            String usql = "update Event_ongoing set Name=? WHERE No =?";
            java.sql.PreparedStatement pst = conn.prepareStatement(usql);
            pst.setString(1,m);
            pst.setString(2,m1);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "record updated");
        } catch (SQLException e ) {
            JOptionPane.showMessageDialog(null, e);

        }
    }}
//DeleteStud.java


class DeleteStud {
    //String driverName = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql:///Event_Management_system";
    static final String USER = "root";
    static final String PASS = "root";
    public void deleteTableData() {

        try {
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            InputDialogInFrame frame = new InputDialogInFrame();
            String m = JOptionPane.showInputDialog(frame, "Enter Number to delete a record");
            if(m.isEmpty()){
                frame.closeIt();
            }

            String usql = "delete from Event_ongoing WHERE No =?";
            java.sql.PreparedStatement pst = conn.prepareStatement(usql);
            pst.setString(1,m);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "record deleted");
        } catch (SQLException e ) {
            JOptionPane.showMessageDialog(null, e);

        }
    }}
//InputDialogFrame.java



class InputDialogInFrame extends JFrame{


    public InputDialogInFrame() {

        getContentPane().setBackground(Color.DARK_GRAY);
        setTitle("Input Dialog in Frame");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        getContentPane().setLayout(null);

    }

    void closeIt(){

        this.getContentPane().setVisible(true);
        this.dispose();

    }


}
