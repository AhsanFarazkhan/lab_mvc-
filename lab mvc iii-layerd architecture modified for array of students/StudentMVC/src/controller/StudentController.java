package controller;

import model.StudentModel;
import view.StudentView;

public class StudentController {
    private StudentModel model;
    
    
    private StudentView view;
    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    public void addStudent(int studentId, String firstName, String lastName, int age, double gpa, String address) {
        StudentModel.Student student = new StudentModel.Student(studentId, firstName, lastName, age, gpa, address);
        
        model.addStudent(student);
    }
    public void displayAllStudents() {
        String allStudentDetails = model.getAllStudentDetails();
        view.displayAllStudentDetails(allStudentDetails);
    }
}
