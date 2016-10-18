import java.util.Scanner;
public class Exercise4 {

    public static void main (String [] args) {
        Scanner bitnumber = new Scanner (System.in);
        System.out.println("Enter the binary number you would like to check: ");
        String a = bitnumber.next();
        int i;
        int counter1 = 0;
        for (i=0;i < a.length();i++) {
            if (a.substring(i,i+1).equals("1")) {
                counter1 += 1;
            }

        }

        if (counter1 % 2 == 0) {
            System.out.println("Parity check OK");
          }
            else{
                System.out.println("Parity check not OK");
            }
        }
    }
