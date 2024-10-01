import java.util.Scanner;
import java.util.Random;
public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numberArray = new int[5];
        System.out.println("Enter 5 Numbers");


        for (int i = 0; i < 5; i++) {
            // Asks the user for 5 numbers then places them in
            // corresponding index in numberArray using a loop.
            System.out.print("Number " + (i + 1) + ": ");
            int userNum = sc.nextInt();
            numberArray[i] = userNum;
        }
        System.out.print("| ");
        for (int number : numberArray) {
            // Prints out each index's contents
            System.out.print(number + " | ");
        }
        System.out.println();

        // Creates a 2D array containing strings
        // and assigns user input into 2D array
        // using a nested loop
        String[][] stringArray = new String[5][5];
        System.out.println("Enter 25 Strings");
        sc.nextLine();
        int counter = 1;
        for (int j = 0; j < 5; j++) {
            for (int g = 0; g < 5; g++) {
                System.out.print("String " + counter++ + ": ");
                String userString = sc.nextLine();
                stringArray[j][g] = userString;
            }
        }
        // Prints out 2D array in an easy-to-read format
        System.out.print("| ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(stringArray[i][j] + " | ");
            }
            System.out.println();
        }

        // Asks user to select an option
        // then executes code based on what option was chosen
        // continues to ask until user selects sentinel value (0)
        int selection = -1;
        while (selection != 0) {
            System.out.println("Selection an option");
            System.out.println("0) Quit");
            System.out.println("1) Print a random number");
            System.out.println("2) Double a number");
            System.out.println("3) Print out a string");
            selection = sc.nextInt();
            sc.nextLine();
            switch (selection) {
                case 1:
                    Random rand = new Random();
                    int random = rand.nextInt(1000);
                    System.out.println("Your random number is: " + random);
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int userNumber = sc.nextInt();
                    System.out.println(userNumber + " doubled is " + (userNumber * 2));
                    break;
                case 3:
                    System.out.println("Hello World!");
                    break;
            }

            // Asks user for input then executes code based on input
            // uses nested if statements
            System.out.print("Enter your age: ");
            int userAge = sc.nextInt();
            sc.nextLine();
            if (userAge >= 18) {
                System.out.println("You can drive.");
                if (userAge >= 21) {
                    System.out.println("You can also drink.");
                }
            } else if (userAge >= 16 && userAge < 18) {
                System.out.println("You can get a permit.");
            } else {
                System.out.println("You are too young.");

            }
        }
    }
}
