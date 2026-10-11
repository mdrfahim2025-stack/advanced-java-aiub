public class AverageMarksThread extends Thread{
    private final Student student;

    public AverageMarksThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Average marks for " + student.getName() + ": " + student.getAverageMarks());
    }
}
