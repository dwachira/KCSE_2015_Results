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

import java.io.BufferedReader;
import java.io.FileReader;

public class School_Performance_in_Particular_Subjects 
{
/* ----------------------------------------------------------------------------------------------------------------------------- */ 
    int Subject_analysis_candidates_with_A_plain_in_particular_subject = 0;
    int Subject_analysis_candidates_with_A_minus_in_particular_subject = 0;
    int Subject_analysis_candidates_with_B_plus_in_particular_subject = 0;
    int Subject_analysis_candidates_with_B_plain_in_particular_subject = 0;
    int Subject_analysis_candidates_with_B_minus_in_particular_subject = 0;
    int Subject_analysis_candidates_with_C_plus_in_particular_subject = 0;
    int Subject_analysis_candidates_with_C_plain_in_particular_subject = 0;
    int Subject_analysis_candidates_with_C_minus_in_particular_subject = 0;
    int Subject_analysis_candidates_with_D_plus_in_particular_subject = 0;
    int Subject_analysis_candidates_with_D_plain_in_particular_subject = 0;
    int Subject_analysis_candidates_with_D_minus_in_particular_subject = 0;
    int Subject_analysis_candidates_with_E_in_particular_subject = 0;
    int Subject_analysis_candidates_with_U_in_particular_subject = 0;
    int Subject_analysis_candidates_with_W_in_particular_subject = 0;
    int Subject_analysis_candidates_with_X_in_particular_subject = 0;
    int Subject_analysis_candidates_with_Y_in_particular_subject = 0;
    int Subject_analysis_candidates_with_Z_in_particular_subject = 0;
    int Subject_analysis_candidates_with_P_in_particular_subject = 0;
    int Subject_analysis_calculated_male_candidates_taking_particular_subject = 0;
    int Subject_analysis_calculated_female_candidates_taking_particular_subject = 0;
/* ----------------------------------------------------------------------------------------------------------------------------- */ 

    
    public void Variables_Instantiated_to_Zero ()
    {
/* ----------------------------------------------------------------------------------------------------------------------------- */ 
    Subject_analysis_candidates_with_A_plain_in_particular_subject = 0;
    Subject_analysis_candidates_with_A_minus_in_particular_subject = 0;
    Subject_analysis_candidates_with_B_plus_in_particular_subject = 0;
    Subject_analysis_candidates_with_B_plain_in_particular_subject = 0;
    Subject_analysis_candidates_with_B_minus_in_particular_subject = 0;
    Subject_analysis_candidates_with_C_plus_in_particular_subject = 0;
    Subject_analysis_candidates_with_C_plain_in_particular_subject = 0;
    Subject_analysis_candidates_with_C_minus_in_particular_subject = 0;
    Subject_analysis_candidates_with_D_plus_in_particular_subject = 0;
    Subject_analysis_candidates_with_D_plain_in_particular_subject = 0;
    Subject_analysis_candidates_with_D_minus_in_particular_subject = 0;
    Subject_analysis_candidates_with_E_in_particular_subject = 0;
    Subject_analysis_candidates_with_U_in_particular_subject = 0;
    Subject_analysis_candidates_with_W_in_particular_subject = 0;
    Subject_analysis_candidates_with_X_in_particular_subject = 0;
    Subject_analysis_candidates_with_Y_in_particular_subject = 0;
    Subject_analysis_candidates_with_Z_in_particular_subject = 0;
    Subject_analysis_candidates_with_P_in_particular_subject = 0;
    Subject_analysis_calculated_male_candidates_taking_particular_subject = 0;
    Subject_analysis_calculated_female_candidates_taking_particular_subject = 0;
/* ----------------------------------------------------------------------------------------------------------------------------- */ 

    }
    
    public void School_Performance_in_Particular_Subjects (int Header_for_School, int Subject_that_is_Analysed, String Name_of_Subject_that_is_Analysed, String school_index_code)
    {
        System.out.println("\n\t" + Header_for_School + "\n\t" + Subject_that_is_Analysed + "\n\t" + Name_of_Subject_that_is_Analysed + "\n\t" + school_index_code);
    try 
       {    
            Variables_Instantiated_to_Zero ();
//            
            int SUBJECT_ANALYSIS_IN_SCHOOL_line_number_where_school_is_found = Header_for_School;
//            FileReader Subject_Analysis_in_School_FileReader = new FileReader("DB@254@2015KCSE.txt");
//
//            BufferedReader Subject_Analysis_in_School_Buffered_Reader = new BufferedReader(Subject_Analysis_in_School_FileReader);
//            String Subject_Analysis_in_School__Retrieved_Students_Line;
//
//            int SUBJECT_ANALYSIS_IN_SCHOOL_Students_of_particular_school_Line_count = 0;
//
//            int SUBJECT_ANALYSIS_IN_SCHOOL_Array_of_Footers_to_assist_in_marking_end_of_school[] = new int[10];
//            int SUBJECT_ANALYSIS_IN_SCHOOL_Counter_Array_of_Footers = 0;
//            int SUBJECT_ANALYSIS_IN_SCHOOL_max_limit_line_number_where_school_is_found = SUBJECT_ANALYSIS_IN_SCHOOL_line_number_where_school_is_found + 500;
//
//              while ((Subject_Analysis_in_School__Retrieved_Students_Line = Subject_Analysis_in_School_Buffered_Reader.readLine())!=null) 
//                    {
//                       SUBJECT_ANALYSIS_IN_SCHOOL_Students_of_particular_school_Line_count++;
//
//                       if (SUBJECT_ANALYSIS_IN_SCHOOL_Students_of_particular_school_Line_count > SUBJECT_ANALYSIS_IN_SCHOOL_line_number_where_school_is_found && SUBJECT_ANALYSIS_IN_SCHOOL_Students_of_particular_school_Line_count <= SUBJECT_ANALYSIS_IN_SCHOOL_max_limit_line_number_where_school_is_found)
//                            {
//                                     int SUBJECT_ANALYSIS_IN_SCHOOL_KNEC_header_index_found = Subject_Analysis_in_School__Retrieved_Students_Line.indexOf("THE	 KENYA	 NATIONAL	 EXAMINATIONS	 COUNCIL");
//                                     if (SUBJECT_ANALYSIS_IN_SCHOOL_KNEC_header_index_found>-1)
//					  {
//                                              System.out.println("Header was found at position:: " + SUBJECT_ANALYSIS_IN_SCHOOL_KNEC_header_index_found + " ::on line "+ SUBJECT_ANALYSIS_IN_SCHOOL_Students_of_particular_school_Line_count);
//                                              SUBJECT_ANALYSIS_IN_SCHOOL_Array_of_Footers_to_assist_in_marking_end_of_school[SUBJECT_ANALYSIS_IN_SCHOOL_Counter_Array_of_Footers] = SUBJECT_ANALYSIS_IN_SCHOOL_Students_of_particular_school_Line_count;
//                                              SUBJECT_ANALYSIS_IN_SCHOOL_Counter_Array_of_Footers++;
//                                              SUBJECT_ANALYSIS_IN_SCHOOL_max_limit_line_number_where_school_is_found = SUBJECT_ANALYSIS_IN_SCHOOL_Array_of_Footers_to_assist_in_marking_end_of_school[SUBJECT_ANALYSIS_IN_SCHOOL_Counter_Array_of_Footers] - 2;
//                                          } 
            FileReader SCHOOL_PERFORMANCE_KCSE_Results_Student_Details_FileReader = new FileReader("DB@254@2015KCSE.txt");

            BufferedReader SCHOOL_PERFORMANCE_Students_Result_Buffered_Reader = new BufferedReader(SCHOOL_PERFORMANCE_KCSE_Results_Student_Details_FileReader);
            String SCHOOL_PERFORMANCE_Retrieved_Students_Line;

            int SCHOOL_PERFORMANCE_Students_of_particular_school_Line_count = 0;
	    String SCHOOL_PERFORMANCE_Array_for_Grades[] = new String[500];
            int Counter_Array_for_Grades =0;
//            int SCHOOL_PERFORMANCE_Array_of_Footers_to_assist_in_marking_end_of_school[] = new int[10];
//            int SCHOOL_PERFORMANCE_Counter_Array_of_Footers = 0;
            int SCHOOL_PERFORMANCE_max_limit_line_number_where_school_is_found = SUBJECT_ANALYSIS_IN_SCHOOL_line_number_where_school_is_found + 500;

            String Check_if_next_school_reached = school_index_code.substring(0,school_index_code.length() - 3);
            int SCHOOL_PERFORMANCE_KNEC_header_index_found = -1;//SCHOOL_PERFORMANCE_Retrieved_Students_Line.indexOf("THE	 KENYA	 NATIONAL	 EXAMINATIONS	 COUNCIL");
            int start = 0;
            int end = 0;
            
            while ((SCHOOL_PERFORMANCE_Retrieved_Students_Line = SCHOOL_PERFORMANCE_Students_Result_Buffered_Reader.readLine())!=null) 
                    { 
                        //System.out.println(SCHOOL_PERFORMANCE_Retrieved_Students_Line);
                        SCHOOL_PERFORMANCE_KNEC_header_index_found = -1;
                        SCHOOL_PERFORMANCE_Students_of_particular_school_Line_count++;

                       if (SCHOOL_PERFORMANCE_Students_of_particular_school_Line_count >= SUBJECT_ANALYSIS_IN_SCHOOL_line_number_where_school_is_found && SCHOOL_PERFORMANCE_Students_of_particular_school_Line_count <= SCHOOL_PERFORMANCE_max_limit_line_number_where_school_is_found )
                            {
                                //System.out.println(SCHOOL_PERFORMANCE_Retrieved_Students_Line);
                        
                                if (SCHOOL_PERFORMANCE_Retrieved_Students_Line.startsWith(Check_if_next_school_reached)==false)
                                {
                                    SCHOOL_PERFORMANCE_KNEC_header_index_found = 1;
                                    
                                }
                                
                                if (SCHOOL_PERFORMANCE_KNEC_header_index_found>-1)
					  {
                                              System.out.println("Header was found at position:: " + SCHOOL_PERFORMANCE_KNEC_header_index_found + " ::on line "+ SCHOOL_PERFORMANCE_Students_of_particular_school_Line_count);
                                              break;
//                                              SCHOOL_PERFORMANCE_Array_of_Footers_to_assist_in_marking_end_of_school[SCHOOL_PERFORMANCE_Counter_Array_of_Footers] = SCHOOL_PERFORMANCE_Students_of_particular_school_Line_count-1;
//                                              SCHOOL_PERFORMANCE_Counter_Array_of_Footers++;
//                                              SCHOOL_PERFORMANCE_max_limit_line_number_where_school_is_found = SCHOOL_PERFORMANCE_Array_of_Footers_to_assist_in_marking_end_of_school[SCHOOL_PERFORMANCE_Counter_Array_of_Footers];
                                          }
                                //-----------------------------------------------------------------------------------------------------------------------
//
//                                        nth_occurrence_of_substring occurrence_of_2ndtab = new nth_occurrence_of_substring();
//                                        int nthPositionOfThe = 2;
//                                        String sub_string_searched = "\t";
//                                        int index_start_of_grade = Integer.parseInt(occurrence_of_2ndtab.indexOfOccurance(SCHOOL_PERFORMANCE_Retrieved_Students_Line, sub_string_searched, nthPositionOfThe));
                                        
                                        start = SCHOOL_PERFORMANCE_Retrieved_Students_Line.indexOf( "\t" + Subject_that_is_Analysed )+1;
                                        end = SCHOOL_PERFORMANCE_Retrieved_Students_Line.indexOf( " ", start );   

                                        //System.out.println(SCHOOL_PERFORMANCE_Retrieved_Students_Line.substring((end+1), (end+3)));
        
                                        String student_details_grade = SCHOOL_PERFORMANCE_Retrieved_Students_Line.substring((end+1), (end+3));
                                        //SCHOOL_PERFORMANCE_Retrieved_Students_Line.substring(index_start_of_grade, (index_start_of_grade+2));

                                        SCHOOL_PERFORMANCE_Array_for_Grades[Counter_Array_for_Grades] = student_details_grade; 
                                        //System.out.println(SCHOOL_PERFORMANCE_Array_for_Grades[Counter_Array_for_Grades]);
                                        //System.out.println(SCHOOL_PERFORMANCE_Array_for_Grades[Counter_Array_for_Grades].length());
                                        Counter_Array_for_Grades++;
/* ----------------------------------------------------------------------------------------------------------------------------- */ 
               if (SCHOOL_PERFORMANCE_Retrieved_Students_Line.length() > 0 )
                {
                      int subject_index_in_line = SCHOOL_PERFORMANCE_Retrieved_Students_Line.indexOf("\t"+ Subject_that_is_Analysed +" ");
                      //System.out.println("Found ---> " + subject_index_in_line + " in line "+ buffered_reader_line_number);
                      if (subject_index_in_line!=-1)//&& (Subject_Analysis_in_School__Retrieved_Students_Line.length() > (subject_index_in_line + 5) ))
                      {
                          int grade_in_subject_index_in_line = subject_index_in_line + 4;
                          int grade_1st_char = grade_in_subject_index_in_line + 1;
                          int grade_2nd_char = grade_in_subject_index_in_line + 2;
                          //System.out.println("Grade [index[" + grade_1st_char + "][" + grade_2nd_char + "]");
                          //String actual_grade_in_subject = ""+Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_in_subject_index_in_line+1) + Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_in_subject_index_in_line+2);

//                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(6) == 'F'))
//                            { 
//                                Subject_analysis_calculated_female_candidates_taking_particular_subject++;
//                            }
//                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(6) == 'M'))
//                            {
//                                Subject_analysis_calculated_male_candidates_taking_particular_subject++;
//                            }
                            
                          if (SCHOOL_PERFORMANCE_Retrieved_Students_Line.length() > (subject_index_in_line + 6))
                            {    
                               
        /* ----------------------------------------------------------------------------------------------------------------------------- */ 

                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'A') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '\t'))
                            {
                                Subject_analysis_candidates_with_A_plain_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'A') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '-'))
                            {
                                Subject_analysis_candidates_with_A_minus_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'B') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '+'))
                            {
                                Subject_analysis_candidates_with_B_plus_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'B') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '\t'))
                            {
                                Subject_analysis_candidates_with_B_plain_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'B') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '-'))
                            {
                                Subject_analysis_candidates_with_B_minus_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'C') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '+'))
                            {
                                Subject_analysis_candidates_with_C_plus_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'C') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '\t'))
                            {
                                Subject_analysis_candidates_with_C_plain_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'C') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '-'))
                            {
                                Subject_analysis_candidates_with_C_minus_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'D') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '+'))
                            {
                                Subject_analysis_candidates_with_D_plus_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'D') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '\t'))
                            {
                                Subject_analysis_candidates_with_D_plain_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'D') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '-'))
                            {
                                Subject_analysis_candidates_with_D_minus_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'E') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '\t'))
                            {
                                Subject_analysis_candidates_with_E_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'U') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '\t'))
                            {
                                Subject_analysis_candidates_with_U_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'W') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '\t'))
                            {
                                Subject_analysis_candidates_with_W_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'X') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '\t'))
                            {
                                Subject_analysis_candidates_with_X_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'Y') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '\t'))
                            {
                                Subject_analysis_candidates_with_Y_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'Z') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '\t'))
                            {
                                Subject_analysis_candidates_with_Z_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'P') && (SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_2nd_char) == '\t'))
                            {
                                Subject_analysis_candidates_with_P_in_particular_subject++;
                            }
        /* ----------------------------------------------------------------------------------------------------------------------------- */ 
                         }
                        if (SCHOOL_PERFORMANCE_Retrieved_Students_Line.length() == (subject_index_in_line + 6))
                         {    
        /* ----------------------------------------------------------------------------------------------------------------------------- */ 

                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'A'))
                            {
                                Subject_analysis_candidates_with_A_plain_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'B'))
                            {
                                Subject_analysis_candidates_with_B_plain_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'C'))
                            {
                                Subject_analysis_candidates_with_C_plain_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'D'))
                            {
                                Subject_analysis_candidates_with_D_plain_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'E'))
                            {
                                Subject_analysis_candidates_with_E_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'U'))
                            {
                                Subject_analysis_candidates_with_U_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'W'))
                            {
                                Subject_analysis_candidates_with_W_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'X'))
                            {
                                Subject_analysis_candidates_with_X_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'Y'))
                            {
                                Subject_analysis_candidates_with_Y_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'Z'))
                            {
                                Subject_analysis_candidates_with_Z_in_particular_subject++;
                            }
                            if ((SCHOOL_PERFORMANCE_Retrieved_Students_Line.charAt(grade_1st_char) == 'P'))
                            {
                                Subject_analysis_candidates_with_P_in_particular_subject++;
                            }
        /* ----------------------------------------------------------------------------------------------------------------------------- */ 
                        }      
                      }
                } 
/* ----------------------------------------------------------------------------------------------------------------------------- */     
                                        
               }
              }

                 SCHOOL_PERFORMANCE_KCSE_Results_Student_Details_FileReader.close();

		   } 
		   catch (Exception SCHOOL_PERFORMANCE_in_Subjects_ex_performance_of_student) 
		   {  
			   System.out.println("Error on finding performance of school in subjects----> " + SCHOOL_PERFORMANCE_in_Subjects_ex_performance_of_student); 
		   } 
    
    
    }
    
}
