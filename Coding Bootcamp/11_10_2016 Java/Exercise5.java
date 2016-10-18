import java.util.Scanner;
public class Exercise5 {

    public static void main (String [] args) {
        Scanner userinput = new Scanner (System.in);
        System.out.println("Enter the a value of the equation: ");
        int a = userinput.nextInt();
        System.out.println("Enter the b value of the equation: ");
        int b = userinput.nextInt();
        System.out.println("Enter the c value of the equation: ");
        int c = userinput.nextInt();
        if (Math.pow(b,2) - (4*a*c) < 0) {
          System.out.println("Dear user unfortunately there are no real-valued solutions that exist for this equation");
      } else {
          double d = Math.pow(b,2) - 4*a*c;
          double x1 = ((((-1)*b)+Math.sqrt(d)))/(2*a);
          double x2 = ((((-1)*b)-Math.sqrt(d)))/(2*a);
          System.out.println("The first solution is:" + x1);
          System.out.println("The first solution is:" + x2);
      }
    }
}
