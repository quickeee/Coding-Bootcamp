import java.util.Scanner;
public class Exercise9_1 {

    public static void main (String [] args) {
        Scanner userinput = new Scanner (System.in);
        System.out.println("Dear user enter the phrase that you would like to encrypt: ");
        String phrase = userinput.next();
        System.out.println("Dear user enter the key you would like to use in order to encrypt: ");
        int shift = userinput.nextInt();
        int i;
        int a;
        char c;
        char j;
        int encrypted;
        for (i = 0;i < phrase.length();i++) {
            c = phrase.charAt(i);
            a = (int) c;
            encrypted = a + shift;
            if (encrypted > 90) {
                encrypted = (encrypted - 64)%26 + 64;
            }
            j = (char) encrypted;
            System.out.print(j);
        }
    }
}
