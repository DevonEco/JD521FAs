/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmarksreport;

import javax.swing.JOptionPane;

/**
 *
 * @author Devon
 */
public class Student_Report extends Student{
    
  Student_Report(int studentNr, int testResults, int assignmentResults, int exam){
      
      super (studentNr, testResults, assignmentResults, exam);    
}
   public void print_report (int sNumber, int tResults, int aResults, int eXam ){
    
    double s = (tResults * 0.25 + aResults * 0.25 + eXam * 0.5);
    JOptionPane.showMessageDialog( null, "Student Number: " + sNumber + "\n" + "Test Results: " + tResults + "\n" + "Assignment Resluts: " + aResults + "\n" + 
                                    "Exam Results: " + eXam + "\n" + "Average Results: " + s);
}
}
