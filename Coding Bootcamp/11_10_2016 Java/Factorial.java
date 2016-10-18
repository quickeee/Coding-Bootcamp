import java.util.Scanner;
public class Factorial {

    public static void main (String [] args) {
        Scanner userInput = new Scanner (System.in);
        System.out.println("Please enter the number you would like to calculate the factorial: ");
        int n = userInput.nextInt();
        while (n < 0) {
            System.out.println("Dear user please enter a positive number!! Enter again: ");
            n = userInput.nextInt();
        }
        factorialMethod(n);

    }
    public static void factorialMethod (int n) {
        long i;
        long sum = 1;
        if (n > 1) {
            for (i = 1; i <= n;i++) {
                sum *= i;
            }
            System.out.println("The factorial of " + n + " is: " +sum);
        }
        else {
            System.out.println("The factorial of " + n + " is: 1");
        }
      }
}
