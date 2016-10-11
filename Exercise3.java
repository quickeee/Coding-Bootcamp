import java.util.Scanner;
public class Exercise3 {

    public static void main (String [] args) {
        Scanner userinput = new Scanner (System.in);
        System.out.println("Enter the first side of the triangle: ");
        int a = userinput.nextInt();
        System.out.println("Enter the second side of the triangle: ");
        int b = userinput.nextInt();
        System.out.println("Enter the third side of the triangle: ");
        int c = userinput.nextInt();
        double d = (a+b+c)*(b+c-a)*(a-b+c)*(a+b-c);
        double area = Math.sqrt(d)/4;
        System.out.printf("The area of the given triangle is: %.2f", area);

    }
}
