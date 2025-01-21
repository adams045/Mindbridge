import java.util.List;

public class StudentGPACalculator {
    public static double calculateAverageGPA(List<Double> gpas) {
        if (gpas.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;
        for (Double gpa : gpas) {
            total += gpa;
        }

        return total / gpas.size();
    }

    public static void main(String[] args) {
        List<Double> gpas = List.of(3.5, 3.8, 4.0, 3.2);
        double averageGPA = calculateAverageGPA(gpas);
        System.out.println("Average GPA: " + averageGPA);
    }
}
