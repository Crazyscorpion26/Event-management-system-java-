import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class User_Interface extends JFrame implements ActionListener {

    JMenuItem i3;
	JMenuItem i4;
    JMenuItem i5;
    JMenuItem i7;
    JMenuItem i8;
    JMenuItem i10;
    JMenuItem i11;
    JMenuItem i12;
    JMenuItem i13;

    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
	User_Interface(){
		
		
		setSize(10000, 800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu event = new JMenu("Events");
		
		menuBar.add(event);
		
		
		JMenu contact = new JMenu("contact");
		
		i3 = new JMenuItem("Contact info");
        i3.addActionListener(this);
		
		
		contact.add(i3);
		
		
		menuBar.add(contact);
		
		JMenu L_O_E = new JMenu("Events");  // L_O_E = List of events
		
		i4 = new JMenuItem("List of Events");
		i5 = new JMenuItem("Event details");
		
		i4.addActionListener(this);
		i5.addActionListener(this);
		
		L_O_E.add(i4);
		L_O_E.add(i5);
		
		
		event.add(L_O_E);
		

		

		
		JMenu suggest = new JMenu("Suggest");
		
		i10 = new JMenuItem("Suggest about upcoming event");
		i11 = new JMenuItem("Suggest about previous events");
        i10.addActionListener(this);
        i11.addActionListener(this);
		
		suggest.add(i10);
		suggest.add(i11);
		
		menuBar.add(suggest);
		
		JMenu performer = new JMenu("Performer");
		
		i12 = new JMenuItem("New Performer");
		i13 = new JMenuItem("Already previous performer");
        i12.addActionListener(this);
        i13.addActionListener(this);
		
		performer.add(i12);
		performer.add(i13);
		
		menuBar.add(performer);
		
		
		
		
		setJMenuBar(menuBar);

        JLabel l1 = new JLabel("Welcome to College Event Management System");
        l1.setBounds(300, 50,1000,50);
        l1.setFont(new Font("Arial", Font.BOLD, 40));
        l1.setForeground(Color.black);

        JLabel l2 = new JLabel("About College Event Management System");
        l2.setBounds(100, 200,1000,50);
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l2.setForeground(Color.black);

        JLabel l3 = new JLabel("This Project College Event Management System has been developed on Java Swing and Mysql. This project will help the students as");
        l3.setBounds(100, 300,10000,50);
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        l3.setForeground(Color.black);

        JLabel l4 = new JLabel(" well as Admins to manage the events. By using this system the students can see when the event is going to happen, the students ");
        l4.setBounds(100, 330,10000,50);
        l4.setFont(new Font("Arial", Font.BOLD, 20));
        l4.setForeground(Color.black);

        JLabel l5 = new JLabel(" can register for the events also the users are up to date because the data entered by the admins are going to be reflected in the ");
        l5.setBounds(100, 360,10000,50);
        l5.setFont(new Font("Arial", Font.BOLD, 20));
        l5.setForeground(Color.black);

        JLabel l6 = new JLabel(" students interface as well. By using this the admins can Add, Update, See and Delete the events. ");
        l6.setBounds(100, 390,10000,50);
        l6.setFont(new Font("Arial", Font.BOLD, 20));
        l6.setForeground(Color.black);

        JLabel l7 = new JLabel(" The whole data is being stored in a database which is in Mysql. Using this data the admins can take a record of number of participan ");
        l7.setBounds(100, 420,10000,50);
        l7.setFont(new Font("Arial", Font.BOLD, 20));
        l7.setForeground(Color.black);

        JLabel l8 = new JLabel(" -ts participated in a particular event. This data can be used to better manage the events that are going to occur in the future. Apart ");
        l8.setBounds(100, 450,10000,50);
        l8.setFont(new Font("Arial", Font.BOLD, 20));
        l8.setForeground(Color.black);

        JLabel l9 = new JLabel("from these features this project has additional features like giving suggestions on previous events and also for the events that are ");
        l9.setBounds(100, 480,10000,50);
        l9.setFont(new Font("Arial", Font.BOLD, 20));
        l9.setForeground(Color.black);

        JLabel l10 = new JLabel("are coming next. Also it can take record of participants that are already performed in the previous events. Also takes care of data of ");
        l10.setBounds(100, 510,10000,50);
        l10.setFont(new Font("Arial", Font.BOLD, 20));
        l10.setForeground(Color.black);

        JLabel l11 = new JLabel(" the new participants.");
        l11.setBounds(100, 540,10000,50);
        l11.setFont(new Font("Arial", Font.BOLD, 20));
        l11.setForeground(Color.black);

        b1 = new JButton("List of events");
        b1.setBounds(300,590,125,25);
        b1.addActionListener(this);

        b2 = new JButton("Contact Us");
        b2.setBounds(550,590,100,25);
        b2.addActionListener(this);

        b3 = new JButton("Login");
        b3.setBounds(800,590,100,25);
        b3.addActionListener(this);

        b4 = new JButton("Exit");
        b4.setBounds(1050,590,100,25);
        b4.addActionListener(this);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Event1.png"));
        Image i2 = i1.getImage().getScaledInstance(1500,768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1380,690);
        add(image);
        setSize(10000, 800);
        //setLocation(300, 0);
        setVisible(true);

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
        image.add(l11);
        image.add(b1);
        image.add(b2);
        image.add(b3);
        image.add(b4);

		
	}

	public static void main(String[] args) {
		new User_Interface();
        

	}

	@Override
	public void actionPerformed(ActionEvent e) {
        Conn c = new Conn();


        if(e.getSource() == i12) {
            new Performer().setVisible(true);
            dispose();
        }
        if(e.getSource() == i13) {
            new Already_performer().setVisible(true);
            dispose();
        }
        if(e.getSource() == i10) {
            new Suggest_upcoming().setVisible(true);
            dispose();
        }
        if(e.getSource() == i11) {
            new Suggest_ongoing().setVisible(true);
            dispose();
        }
        if(e.getSource() == i7) {
            new List_of_Events_upcoming().setVisible(true);
            dispose();
        }
        if(e.getSource() == i3) {
            new Contact().setVisible(true);
            dispose();
        }
		if(e.getSource() == i4) {

            new Display().showTableData();

		}
        if(e.getSource() == i5){
            new Registeration().setVisible(true);
            dispose();
            new Display().showTableData();

        }
        if(e.getSource() == i8){
            new Event_details_upcoming().setVisible(true);
            dispose();
        }
        if(e.getSource() == b1){
            new Display().showTableData();
            dispose();
        }
        if(e.getSource() == b2){
            new Contact().setVisible(true);
            dispose();
        }
        if(e.getSource() == b3){
            new Login().setVisible(true);
            dispose();
        }
        if(e.getSource() == b4){
            dispose();
        }


				
		
	}

}