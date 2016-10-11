import java.util.Scanner;
public class Triangle {

    public static void main (String [] args) {
        Scanner userInput = new Scanner (System.in);
        System.out.println("Dear user please enter the first side of the triangle: ");
        int a = userInput.nextInt();
        System.out.println("Dear user please enter the second side of the triangle: ");
        int b = userInput.nextInt();
        System.out.println("Dear user please enter the third side of the triangle: ");
        int c = userInput.nextInt();
        int max;
        int other1;
        int other2;
        if (a >= b){
            if (a >= c) {
                max = a;
                other1 = c;
                other2 = b;
            }
            else {
                max = c;
                other1 = a;
                other2 = b;
            }
        }
        else {
            if (b >= c){
                max = b;
                other1 = a;
                other2 = c;
            }
            else {
                max = c;
                other1 = a;
                other2 = b;
            }
        }
        while (max >= other1 + other2) {
            System.out.println("Dear user the values you have entered are not values for a triangle!! Please enter again: ");
            System.out.println("Dear user please enter the first side of the triangle: ");
            a = userInput.nextInt();
            System.out.println("Dear user please enter the second side of the triangle: ");
            b = userInput.nextInt();
            System.out.println("Dear user please enter the third side of the triangle: ");
            c = userInput.nextInt();
            if (a >= b){
                if (a >= c) {
                    max = a;
                    other1 = c;
                    other2 = b;
                }
                else {
                    max = c;
                    other1 = a;
                    other2 = b;
                }
            }
            else {
                if (b >= c){
                    max = b;
                    other1 = a;
                    other2 = c;
                }
                else {
                    max = c;
                    other1 = a;
                    other2 = b;
                }
            }
        }
        equalizer (a,b,c);
        int area = perimeterMethod (a,b,c);
        if ((a != b) | (a != c)) {
            System.out.println("Dear user the triangle you have entered is not equilateral and it's perimeter is: " +area);
        }

    }
    public static int perimeterMethod(int a,int b, int c) {
        int sum;
        sum = a + b + c;
        return sum;
    }
    public static void equalizer (int a,int b,int c) {
        if (a == b){
            if (a == c){
                System.out.println("Dear user the triangle you entered is an equilateral triangle!! And its perimeter is: " + (a+b+c));
            }
        }
    }
}
