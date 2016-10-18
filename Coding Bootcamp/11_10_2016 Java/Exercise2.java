import java.util.Scanner;
public class Exercise2 {

    public static void main (String [] args) {
        Scanner banknotes = new Scanner (System.in);
        System.out.println("Enter the number of 50 euro banknotes: ");
        int a = banknotes.nextInt();
        System.out.println("Enter the number of 20 euro banknotes: ");
        int b = banknotes.nextInt();
        System.out.println("Enter the number of 10 euro banknotes: ");
        int c = banknotes.nextInt();
        System.out.println("Enter the number of 5 euro banknotes: ");
        int d = banknotes.nextInt();
        System.out.println("Enter the number of 2 euro coins: ");
        int e = banknotes.nextInt();
        System.out.println("Enter the number of 1 euro coins: ");
        int f = banknotes.nextInt();
        System.out.println("You have " + (a*50+b*20+c*10+d*5+e*2+f) + " euros.");
    }
}
