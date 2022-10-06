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
public class StudentMarksReport {
    
    
    ////////////////////////////////////////////////////////
    public static void main(String[] args) {
        // TODO code application logic here
    int studentNr = 0;
    int testResults = 0;
    int assignmentResults = 0;
    int exam = 0;
    
    boolean y = true;
    
    Student z = new Student( studentNr , testResults , assignmentResults , exam);
    
    while( y == true ) {
        
        try{
            studentNr = Integer.parseInt(JOptionPane.showInputDialog("Enter Student Number"));
            testResults = Integer.parseInt(JOptionPane.showInputDialog("Enter Test Results"));
            assignmentResults = Integer.parseInt(JOptionPane.showInputDialog("Enter Assignment Results"));
            exam = Integer.parseInt(JOptionPane.showInputDialog("Enter Exam Results"));
            z.setStudentNr(studentNr);
            z.setTestResults(testResults);
            z.setAssignmentResults(assignmentResults);
            z.setExam(exam);
            y = false;
        }
        catch(NumberFormatException a) {
            JOptionPane.showMessageDialog( null, "Enter a valid number");
        }
        
    }
    Student_Report r = new Student_Report(z.getStudentNr(),z.getTestResults(),z.getAssignmentResults(),z.getExam());
        
        r.print_report(r.getStudentNr(),r.getTestResults(),r.getAssignmentResults(),r.getExam());
    }
}
