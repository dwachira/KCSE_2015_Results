 /*************************************************************************
 *                                                                        *
 *                   Mureithi David Wachira	                              *
 *                                                                        *
 *                   Mobile: +254 (0) 722 413 699                         *
 *                   Email:  davidwachira90@gmail.com                     *
 *                   Website: davidwachira.com                            *
 *                                                                        *
 *                   Date:   Saturday 30th April 2016                    *
 *                                                                        *
 *                   KCSE 2015 Results Application                        *
 *                                                                        *
 *************************************************************************/

package kcse_2015_results;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Robot_Connection_to_Localhost 
{
        public static Connection getDBConnection() 
        {
            Connection connection;
              try 
                {
                            connection = DriverManager.getConnection(
                            
                            "jdbc:mysql://localhost:3306/db_kcse_2015",
                            "local_user_db",
                            "N1756AqA2MWfG4t");
                            return connection;
                } 

                catch (SQLException ex) 
                {                
                    // Try catch statement to capture and handle any errors
                    System.out.println("SQLException: " + ex.getMessage());
                    System.out.println("SQLState: " + ex.getSQLState());
                    System.out.println("VendorError: " + ex.getErrorCode());
                    return null;
                }//Try catch block closed
        
        }//getDBConnection() closed  
}
