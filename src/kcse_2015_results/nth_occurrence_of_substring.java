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

public class nth_occurrence_of_substring
{
    //int index_until_subjects = 0;
    
    public void nth_occurrence_of_substring()
    {
        
    }
//    public int count_the_number_of_tokens_in_string()
//    {
//        
//    }
    
    
    public String indexOfOccurance(String string, String token, int nthOccurance)
    {
     
        int lengthOfToken = token.length();
        int nthCount = 0;
        for (int shift = 0,count = 0; count < string.length() - token.length() + 2; count++, shift++, lengthOfToken++)
          if (string.substring(shift, lengthOfToken).equalsIgnoreCase(token)) 
          { 
            // keeps count of nthOccurance
            nthCount++; 
            if (nthCount == nthOccurance)
            {
               //checks if nthCount  == nthOccurance. If true, then breaks 
                return String.valueOf(lengthOfToken);
                //return String.valueOf(shift)+ " " +String.valueOf(lengthOfToken);   

            }  
          }
          return "-1";
    }
    
    public static void main(String args[])
    {
        nth_occurrence_of_substring example_nth_occurrence_of_substring = new nth_occurrence_of_substring();
        String data_captured = "38618109004	ANAMI CHARLES LUBEKA	B	61	101 B-	102 B-	121 B+	231 B	232 C+	233 C	312 B+	565 B		KILINGILI SECONDARY SCHOOL";

        int nthPositionOfThe = 4;
        String sub_string_searched = "\t";
        System.out.println("No. "+(nthPositionOfThe-1)+" occurance of the is at: " + example_nth_occurrence_of_substring.indexOfOccurance(data_captured, sub_string_searched, nthPositionOfThe));
        //System.out.println(data_captured.substring(index_until_subjects));
        String student_details_without_subjects = data_captured.substring(0,38);
        System.out.println(student_details_without_subjects);
    }
}