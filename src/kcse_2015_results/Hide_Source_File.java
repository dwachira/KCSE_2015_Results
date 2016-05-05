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
import java.io.IOException;

public class Hide_Source_File 
{
    String source_file_path = "C:\\Program Files\\KCSE 2015 Results\\DB@254@2015KCSE.txt";
    
    public void hide_file(File file_src) throws InterruptedException, IOException {
        // win32 command line variant
        Process p = Runtime.getRuntime().exec("attrib +h " + file_src.getPath());
        p.waitFor(); // p.waitFor() important, so that the file really appears as hidden immediately after function exit.
        System.out.println("File hidden!");
    }
    
    public void check_Programs_File_directory()
    {
	  File f = new File(source_file_path);
 
	  if(f.exists())
          {
		  System.out.println("File exists");
	  }
          else
          {
		  System.out.println("File not found!");
                  source_file_path = "C:\\Program Files (x86)\\KCSE 2015 Results\\DB@254@2015KCSE.txt";
                  check_Programs_File_directory ();
	  }
    }
    
    public void check_to_see_if_file_already_hidden () throws InterruptedException, IOException
    {
    	File file = new File(source_file_path);
 
    	if(file.isHidden())
        {
    		System.out.println("This file is hidden");
    	}
        else
        {
    		System.out.println("This file is not hidden");
                hide_file(file);
    	}
    }
    
    public static void main(String[] args) throws InterruptedException, IOException 
    {
        Hide_Source_File get_dir = new Hide_Source_File();
        get_dir.check_Programs_File_directory();
        get_dir.check_to_see_if_file_already_hidden();
        
        
    }

}
