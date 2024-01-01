import java.sql.Statement;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///Event_Management_system", "root", "root");
            s = c.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}