import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public class Student {
    private final String id;
    private final String name;
    private final Department department;
    private final int[] marks;

    public Student(String id, String name, Department department, int[] marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department.name();
    }

    public int[] getMarks() {
        return marks;
    }

    public int getTotalMarks() {
        return Arrays.stream(marks).sum();
    }

    public String toString() {
        return getId() + ", " + getName() + ", " + getDepartment() + ", " + Arrays.toString(getMarks());
    }

    public double getAverageMarks() {
        return (double) getTotalMarks() / marks.length;
    }

    public String getGradePoint(int grade) {
        if (grade >= 90) {
            return "A+";
        } else if (grade >= 85) {
            return "A";
        } else if (grade >= 80) {
            return "B+";
        } else if (grade >= 75) {
            return "B";
        } else if (grade >= 70) {
            return "C+";
        } else if (grade >= 65) {
            return "C";
        } else if (grade >= 60) {
            return "D+";
        } else if (grade >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public String getLetterGrade() {
        int maxGrade = 0;

        for (int grade : marks) {
            if (grade > maxGrade) {
                maxGrade = grade;
            }
        }

        return getGradePoint(maxGrade);
    }

    public double getPointForGrade(String grade) {
        return switch (grade) {
            case "A+" -> 4.00;
            case "A" -> 3.75;
            case "B+" -> 3.50;
            case "B" -> 3.25;
            case "C+" -> 3.00;
            case "C" -> 2.75;
            case "D+" -> 2.50;
            case "D" -> 2.25;
            case null, default -> 0.00;
        };
    }

    public double calculateTotalGradePoint() {
        double sum = 0;

        for (int mark : marks) {
            double grade = getPointForGrade(getGradePoint(mark));
            sum += grade;
        }

        return sum / marks.length;
    }
}
