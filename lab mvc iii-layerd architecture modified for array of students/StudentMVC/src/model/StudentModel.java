package model;

import java.util.ArrayList;
import java.util.List;

public class StudentModel {
    private List<Student> students;
    public StudentModel() {
        students = new ArrayList<>();
    }
   public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
    public String getAllStudentDetails() {
        StringBuilder details = new StringBuilder();
        for (Student student : students) {
            details.append(student.getStudentDetails()).append("\n\n");
        }
        return details.toString();
    }

    public static class Student {
      
        private int studentId;
        
               private String firstName;
      private String lastName;
             private int age;
      
          private double gpa;
       private String address;

        public Student(int studentId, String firstName, String lastName, int age, double gpa, String address) {
            this.studentId = studentId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.gpa = gpa;
            this.address = address;
        }

        public String getStudentDetails() {
            return "Student ID: " + studentId + "\n" +
                   "Name: " + firstName + " " + lastName + "\n" +
                   "Age: " + age + "\n" +
                   "GPA: " + gpa + "\n" +
                   "Address: " + address;
        }
        public int getStudentId() { return studentId; }
      public void setStudentId(int studentId) { this.studentId = studentId; }
 public String getFirstName() { return firstName; }
       public void setFirstName(String firstName) { this.firstName = firstName; }

        public String getLastName() { return lastName; }
     public void setLastName(String lastName) { this.lastName = lastName; }
        public int getAge() { return age; }
      public void setAge(int age) { this.age = age; }
        public double getGpa() { return gpa; }
     public void setGpa(double gpa) { this.gpa = gpa; }

    public String getAddress() { return address; }
        public void setAddress(String address) { this.address = address; }
    }
}
