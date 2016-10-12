import java.util.Scanner;
public class Exercise1 {

    public static void main (String [] args) {
        Scanner userInput = new Scanner (System.in);
        System.out.println("Dear user please enter the first number: ");
        int a = userInput.nextInt();
        System.out.println("Dear user please enter the second number: ");
        int b = userInput.nextInt();
        System.out.println("Dear user the result is: " + Exercise1.bootCamp(a,b));
    }
    public static int bootCamp (int number1, int number2) {
        if (number1 < number2) {
            int c = Math.abs(number1-number2);
            double d = Math.sqrt(c);
            int l = (int) d;
            return l;
        }
        else {
            int l = number1 - number2;
            return l;
        }

    }
}
