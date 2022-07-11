import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome. Thank you for taking the survey.");
        System.out.println("What is your name?");
        String name = scan.nextLine();

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();

        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();

        scan.close();
    }
}