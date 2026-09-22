import java.util.Scanner;

public class WeeklyTemperatures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] days = {
            "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"
        };

        double[] temperatures = {
            95.0, 97.5, 99.0, 101.0, 100.5, 98.0, 96.5
        };

        System.out.print("Enter a day Monday through Sunday, or enter week: ");
        String selection = scanner.nextLine();

        if (selection.equalsIgnoreCase("week")) {
            double total = 0.0;

            System.out.println("\nWeekly Temperatures:");

            for (int i = 0; i < days.length; i++) {
                System.out.printf("%s: %.1f°F%n", days[i], temperatures[i]);
                total += temperatures[i];
            }

            double average = total / temperatures.length;
            System.out.printf("Weekly Average: %.1f°F%n", average);
        } else {
            boolean found = false;

            for (int i = 0; i < days.length; i++) {
                if (selection.equalsIgnoreCase(days[i])) {
                    System.out.printf("%s: %.1f°F%n", days[i], temperatures[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Invalid entry. Enter Monday through Sunday, or week.");
            }
        }

        scanner.close();
    }
}