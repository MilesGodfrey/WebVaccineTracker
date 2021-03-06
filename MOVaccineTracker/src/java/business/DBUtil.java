/**
 *  IS-241 
 *  Spring 2021 
 *  The Missouri COVID-19 Vaccination Tracker 
 *  Miles Godfrey 
 */
package business;

import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
  //Close statement method.
    public static void closePreparedStatement(Statement ps) {
            try {
                //If the "ps" object was not cleared in the 
                //InsertPatient class close connection.
                if (ps != null) {
                    ps.close();  
                } 
            } catch (SQLException e) {
               System.out.println(e); 
            }
        }
}
