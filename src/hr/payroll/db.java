
package hr.payroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class db {
    
    public static Connection java_db(){
        
        try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","payroll_db","payroll");
            Statement st = con.createStatement();
            
            // Write code here ***
            
            con.close();            
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
        
    }
    
}

