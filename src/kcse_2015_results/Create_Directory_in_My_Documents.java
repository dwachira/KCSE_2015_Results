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
import java.io.File;
import java.io.InputStream;

public class Create_Directory_in_My_Documents 
{
 
    
public String Create_Directory_in_My_Documents ()
{
    String myDocuments = null;

    try 
    {
        Process p =  Runtime.getRuntime().exec("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v personal");
        p.waitFor();

        InputStream in = p.getInputStream();
        byte[] b = new byte[in.available()];
        in.read(b);
        in.close();

        myDocuments = new String(b);
        myDocuments = myDocuments.split("\\s\\s+")[4];

    } catch(Throwable t) {
        t.printStackTrace();
    }

    //System.out.println(myDocuments);  
    String directory_path = Process_of_Creating_Directory(myDocuments) ;
    return directory_path;
}

public String Process_of_Creating_Directory(String path_of_directory) 
{
        boolean dirFlag = false;
        path_of_directory = path_of_directory + "\\KCSE Results 2015";
        // create File object
        File stockDir = new File(path_of_directory);

        try {
           dirFlag = stockDir.mkdir();
        } catch (SecurityException Se) {
        System.out.println("Error while creating directory in Java:" + Se);
        }

        if (dirFlag)
        {System.out.println("Directory created successfully");}
        else
        {System.out.println("Directory was not created successfully");}
    return path_of_directory;
}

  
}
