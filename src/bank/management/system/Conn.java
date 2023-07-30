package bank.management.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            //forName is used for driver registeration step 1
            //Class.forName(com.mysql.cj.jdbc.Driver);
            //driver establishes connection between application and databases and allows apps to use databases
            //get connection is used for creating connection step 2
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "123456veyron");
            s = c.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
