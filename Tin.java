import java.util.Scanner;
public class Tin {

    public static void main(String []args) {
        System.out.println("Please enter a Tin number: ");
        Scanner mitsos = new Scanner (System.in);
        String tin = mitsos.next();
        if (tin.length() == 9) {
            int sum = 0;
            int i;
            double b;
            int c;
            String a;
            int modulo;
            int modulo1;
            for (i = 8; i > 0; i--){
                a = tin.substring(i-1,i);
                c = Integer.parseInt(a);
                b = Math.pow(2,(9-i));
                sum += b*c;
            }
            modulo = sum % 11;
            modulo1 = modulo % 10;
            a = tin.substring(8,9);
            c = Integer.parseInt(a);
            System.out.println(c+" "+ modulo+" "+ modulo1);
            if (modulo == modulo1 & modulo1 == c){
                System.out.println("Congratulations, Tax Identification number valid!");
            }
            else {
                System.out.println("Tax number not valid!");
            }
        }
      else {
        System.out.println("The Tax identification number you have entered in not a valid one! Try again with another!");
      }
   }
}
