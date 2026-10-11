public class TotalMarksThread extends Thread {
    private final Student student;

    public TotalMarksThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Total Marks for " + student.getName() + ": " + student.getTotalMarks());
        System.out.println("Letter grade for " + student.getName() + ": " + student.getLetterGrade());
    }
}
