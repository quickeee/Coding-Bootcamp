import java.util.Scanner;
public class Exercise8 {

    public static void main (String [] args) {
        Scanner userinput = new Scanner (System.in);
        System.out.println("Enter the number of prionic numbers: ");
        int n = userinput.nextInt();
        int i;
        for (i = 1;i < n + 1;i++) {
            System.out.print(i * (i+1) + " ");
        }
    }
}
