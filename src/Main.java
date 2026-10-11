//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Student[] students = new Student[]{
                new Student("101", "Rahim", Department.CSE, new int[] {65, 70, 75}),
                new Student("102", "Afif", Department.EEE, new int[] {95, 60, 70}),
                new Student("103", "Sabbir", Department.BBA, new int[] {95, 50, 85}),
                new Student("104", "Karim", Department.CSE, new int[] {65, 60, 70}),
        };
        System.out.println("Student Information:");
        for (Student student : students) {
            System.out.println(student.toString());
        }

        TotalMarksThread totalMarksThread = new TotalMarksThread(students[0]);
        totalMarksThread.start();
        totalMarksThread.join();
        AverageMarksThread averageMarksThread = new AverageMarksThread(students[0]);
        averageMarksThread.start();
        averageMarksThread.join();
    }
}