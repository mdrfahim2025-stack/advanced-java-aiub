import java.util.Map;

public class DepartmentGradeCountThread extends Thread {
    final Student[] students;

    public DepartmentGradeCountThread(Student[] students) {
        this.students = students;
    }

    @Override
    public void run() {
        super.run();
    }
}
