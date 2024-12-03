import model.StudentModel;
import view.StudentView;
import controller.StudentController;

public class Main {
    public static void main(String[] args) {
       StudentModel model = new StudentModel(0, "", "", 0, 0.0, "");
       StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
      controller.updateStudentDetails(1, "John", "Doe", 20, 3.8, "1234 Elm Street, Springfield");
      
        controller.displayStudentDetails();
    }
}
