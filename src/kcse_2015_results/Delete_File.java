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
 /*************************************************************************
 *                                                                        *
 *                   The various imports: Libraries used in this file     *
 *                                                                        *
 *************************************************************************/

import java.io.*;
import javax.swing.*;

public class Delete_File 
{
    
    
    public void Delete_File (File ImageFile)
     {
        // When want to delete a file named data.txt
        File file = ImageFile;
 
        // Checks if the file is exists before deletion.
        if (file.exists())
        {
            // JOptionPane.showMessageDialog(null, "Deleting file " + file.getAbsolutePath());
    
            // Use the delete method to delete the given file.
            file.delete();
       
            // JOptionPane.showMessageDialog(null, "File Successfully Deleted!");
        } 

        else
        {
           // JOptionPane.showMessageDialog(null, file.getAbsolutePath() + " doesn't exists.");
          
        }  
    }
}
