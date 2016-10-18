public class Exercise1 {

    public static void main (String [] args) {
        int i;
        int j;
        int k;
        for (i = 1;i < 10; i++){
          for (j = 9 - i; j > 0;j--){
            System.out.print(0);
          }
          for (k = 0;k < i;k++){
            System.out.print(i);
        }
        System.out.println("");
      }
    }
}
