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
        //below i added the integerInput
        System.out.println("Enter an integer: ");
        int integerInput = scanner.nextInt();
        //below i'll be using a float expression
        System.out.println("Enter a floating-point number: ");
        float floatInput = scanner.nextFloat();
        //below i'll be using the charInput
        System.out.println("Enter a character: ");
        char charInput = scanner.next().charAt(0);
        //below i'll be using string method
        System.out.println("Enter a string: ");
        String stringInput = scanner.next();


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

        //unary expression
        //i am initializing the double variable "unaryResult" to an initial value of 0

        //next i create an if conditional checking if "unaryOperator" string is equal to string "++"
        //if yes, it goes to to next block of code where the integerInput increments by 1
        //it assigns the result to unaryResult
//        String unaryOperator = "++"; // Initialize unaryOperator based on your logic
//        double unaryResult = 0;
//        double doubleInput = 0.0;
        //next i create an if conditional checking if "unaryOperator" string is equal to string "++"
        //if yes, it goes to next block of code where the integerInput increments by 1
        //it assigns the result to unaryResult
//        if (unaryOperator.equals("++")) {
//            unaryResult = integerInput + 1;
//        } else if (unaryOperator.equals("--")) {
//            unaryResult = integerInput - 1;
//        } else if (unaryOperator.equals("!")) {
//            unaryResult = (doubleInput != 0) ? 0 : 1;
//        }


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

        System.out.println("\nUser Inputs: ");
        //displaying integer input
        System.out.println("Integer Input: " + integerInput);
        //displaying float input
        System.out.println("Float Input: " + floatInput);
        //displaying charInput
        System.out.println("Character Input: " + charInput);
        //displaying stringInput
        System.out.println("String Input: " + stringInput);

        System.out.println("\nResults: ");
        //display unary result
//        System.out.println("Results of the unary expression: " + unaryResult);
        //display logical expression
//        System.out.println("Result of Logical Expression: " + logicalResult);

    }
}