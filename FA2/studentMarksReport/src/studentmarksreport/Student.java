/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmarksreport;

/**
 *
 * @author Devon
 */
public class Student {
    
    //Create a class attribute    
    int studentNr;
    int testResults;
    int assignmentResults;
    int exam;

    
    //adding parameters
     Student(int studentNr, int testResults, int assignmentResults, int exam)
    {
        this.studentNr = studentNr;
        this.testResults = testResults;
        this.assignmentResults = assignmentResults;
        this.exam = exam;
    }

    public int getStudentNr() {
        return studentNr;
    }

    public void setStudentNr(int studentNr) {
        this.studentNr = studentNr;
    }

    public int getTestResults() {
        return testResults;
    }

    public void setTestResults(int testResults) {
        this.testResults = testResults;
    }

    public int getAssignmentResults() {
        return assignmentResults;
    }

    public void setAssignmentResults(int assignmentResults) {
        this.assignmentResults = assignmentResults;
    }

    public int getExam() {
        return exam;
    }

    public void setExam(int exam) {
        this.exam = exam;
    }
}
