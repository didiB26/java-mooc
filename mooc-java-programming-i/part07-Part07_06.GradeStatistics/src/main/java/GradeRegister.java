
import java.util.ArrayList;

public class GradeRegister {

    //aici grades
    private ArrayList<Integer> register;
    //aici notes
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.register = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public double averagePoints() {
        int sum = 0;
        int count = 0;
        double average;
        for (int i = 0; i < this.points.size(); i++) {
            sum = sum + this.points.get(i);
            count++;
        }

        average = 1.0 * sum / count;
        return average;
    }

    public void adder(int x) {
        if (x >= 0 && x <= 100) {
            this.points.add(x);
        }
    }

    public void adderGrades(int x) {
        if ((x >= 0 && x <= 100) && (x >= 50)) {
            this.register.add(x);
        }
    }

    public int countGrades() {
        int count = 0;
        for (int i = 0; i < this.register.size(); i++) {
            count++;
        }

        return count;
    }

    public int countPoints() {
        int count = 0;
        for (int i = 0; i < this.points.size(); i++) {
            count++;
        }

        return count;
    }

    public int sumGrades() {
        int sum = 0;
        for (int i = 0; i < this.register.size(); i++) {
            sum = sum + this.register.get(i);
        }
        return sum;

    }

    public void averagePointsByGrade() {

        if (this.register.isEmpty()) {
            System.out.println("-");
        } else {
            double average = 0.0;
            average = 1.0 * this.sumGrades() / this.countGrades();
            System.out.println(average);
        }

    }

    public double passPercentage() {
        double percentage = 0.0;
        if (this.countPoints() > 0) {
            percentage = 100.0 * this.countGrades() / this.countPoints();
        }
        return percentage;
    }

    public void gradeDistribution() {
        int[] vect = {0, 50, 60, 70, 80, 90, 101};
        int j = 5;
        while (j >=0) {
            System.out.print(j + ": ");
            for (int x : this.points) {
                if (x >= vect[j] && x < vect[j+1]) {
                    System.out.print("*");
                }
            }
            j--;
            System.out.println("");
        }

    }

}
