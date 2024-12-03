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
    public void updateStudentDetails(int studentId, String firstName, String lastName, int age, double gpa, String address) {
        model.setStudentId(studentId);
             model.setFirstName(firstName);
        
        model.setLastName(lastName);
             model.setAge(age);
        model.setGpa(gpa);
        
        
          model.setAddress(address);
    }
    public void displayStudentDetails() {
        String studentDetails = model.getStudentDetails();
        
        view.displayStudentDetails(studentDetails);
        
    }
}
