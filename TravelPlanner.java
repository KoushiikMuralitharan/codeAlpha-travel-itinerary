import java.util.Scanner;

public class TravelPlanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Travel Itinerary Planner!");

        System.out.print("Enter number of destinations: ");
        int numDestinations = scanner.nextInt();

        String[] destinations = new String[numDestinations];
        double[] budgets = new double[numDestinations];
        String[] dates = new String[numDestinations];

        for (int i = 0; i < numDestinations; i++) {
            System.out.println("\nDestination " + (i + 1) + ":");
            System.out.print("Enter destination name: ");
            destinations[i] = scanner.next();

            System.out.print("Enter budget for destination " + destinations[i] + ": ");
            budgets[i] = scanner.nextDouble();

            System.out.print("Enter date of visit (MM/DD/YYYY): ");
            dates[i] = scanner.next();
        }

        System.out.println("\n=== Your Travel Itinerary ===");
        for (int i = 0; i < numDestinations; i++) {
            System.out.println("\nDestination: " + destinations[i]);
            System.out.println("Date of Visit: " + dates[i]);
            System.out.println("Budget: $" + budgets[i]);
            // You can include weather information here by integrating with a weather API
            // Similarly, you can integrate with mapping APIs for displaying maps
        }

        double totalBudget = calculateTotalBudget(budgets);
        System.out.println("\nTotal Budget for the Trip: $" + totalBudget);

        scanner.close();
    }

    private static double calculateTotalBudget(double[] budgets) {
        double total = 0;
        for (double budget : budgets) {
            total += budget;
        }
        return total;
    }    
}
