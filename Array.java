import java.util.Scanner;
import java.util.*;
public class Array {

    public static void main (String [] args) {
        int [] array = new int [] {1,2,3,4,5,6,7,8,9,10};
        Array.shiftMethod(array);
    }
    public static void shiftMethod (int [] array) {
        int i;
        int j;
        int [] c = new int [10];
        Scanner userInput = new Scanner (System.in);
        System.out.println("Dear user please enter the shift key: ");
        int loops = userInput.nextInt();
        for (i = 1;i <= loops;i++) {
            for (j = 8;j >= 0;j--) {
                c[j] = array[j+1];
                array[j+1] = array[j];
                array[j] = c[j];
            }
           System.out.println(Arrays.toString(array));
        }
    }
}
