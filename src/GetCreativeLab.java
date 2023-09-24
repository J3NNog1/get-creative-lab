import java.util.Scanner;

public class GetCreativeLab {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a first number: ");
        double number1 = scanner.nextDouble();
        //using double data type to store the user's input
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double number3 = scanner.nextDouble();
        System.out.print("Enter the fourth number: ");
        double number4 = scanner.nextDouble();


        scanner.close();
        //remember to close scanner to prevent resource leak!
        //below I am using arithmetic operators
        double sum = number1 + number2 + number3 + number4;
        double difference = number1 - number2 - number3 - number4;
        double product = number1 * number2 * number3 * number4;
        double quotient = number1 / number2 / number3 / number4;
        double modulo = number1 % number2 % number3 % number4;
        // below i am using logical operators
        boolean isEven = (number1 % 2 == 0);
        boolean isPositive = (number1 > 0);

        //displaying my results to the user below
        System.out.println("\nArithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Modulo: " + modulo);

        System.out.println("\nLogical Operators:");
        System.out.println("Is the first number you entered even?..." + isEven);
        System.out.println("Is the the first number you entered positive?..." + isPositive);

    }
}