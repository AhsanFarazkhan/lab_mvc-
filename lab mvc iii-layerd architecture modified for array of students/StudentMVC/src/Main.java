import model.StudentModel;
import view.StudentView;
import controller.StudentController;

public class Main {
    public static void main(String[] args) {
       StudentModel model = new StudentModel();
      StudentView view = new StudentView();
      
        StudentController controller = new StudentController(model, view);

      controller.addStudent(1, "John", "Doe", 20, 3.8, "1234 Elm Street, Springfield");
        controller.addStudent(2, "Jane", "Smith", 22, 3.9, "5678 Oak Street, Rivertown");
        
        
      controller.addStudent(3, "Jim", "Brown", 19, 3.5, "9101 Pine Avenue, Hilltop");

        controller.displayAllStudents();
    }
}
