import java.util.Scanner;

public class Input {
    public static void main(String[] org) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String uName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int uAge = scanner.nextInt();

        System.out.print("Enter your weight (in kg): ");
        double uWeight = scanner.nextDouble();

        scanner.nextLine(); // Consume the leftover newline

        System.out.print("Are you a smoker? (Yes/No): ");
        String smokerInput = scanner.nextLine().trim().toLowerCase(); 
        boolean uSmoker = smokerInput.equals("yes"); // Convert "yes" to true

        System.out.println("\n--- Medical Form Summary ---");
        System.out.println("Name: " + uName);
        System.out.println("Age: " + uAge + " years");
        System.out.println("Weight: " + uWeight + " kg");
        System.out.println("Smoker: " + (uSmoker ? "Yes" : "No"));

        scanner.close();
    }
}
