import java.util.Scanner;
public class Exercise9_2 {

    public static void main (String [] args) {
        Scanner userinput = new Scanner (System.in);
        System.out.println("Dear user enter the phrase that you would like to decrypt: ");
        String phrase = userinput.next();
        System.out.println("Dear user enter the key you would like to use in order to decrypt: ");
        int shift = userinput.nextInt();
        int i;
        int a;
        char c;
        char j;
        int decrypted;
        for (i = 0;i < phrase.length();i++) {
            c = phrase.charAt(i);
            a = (int) c;
            decrypted = a - shift;
            if (decrypted < 65) {
                decrypted = (90 - (64 - decrypted)%26);
            }
            j = (char) decrypted;
            System.out.print(j);
        }
    }
}
