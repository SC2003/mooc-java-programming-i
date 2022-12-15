
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> averageOfPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.averageOfPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.averageOfPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    private int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int nums : list) {
            sum += nums;
        }
        return sum;
    }
    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        return ((double) this.sum(this.grades) / this.grades.size());
    }

    public double averageOfPoints() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        return ((double) this.sum(this.averageOfPoints) / this.averageOfPoints.size());
    }
}
