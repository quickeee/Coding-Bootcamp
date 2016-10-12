public class Dice {

    public static void main (String [] args) {
        Dice.roll();
    }
    public static void roll () {
      int a = 0;
      int b = 0;
      int counter = 0;
        while ((a != 1) | (b != 1)) {
            a = 1 + (int)(Math.random() * 6);
            b = 1 + (int)(Math.random() * 6);
            System.out.println(a + ":" + b);
            counter += 1;
        }
        System.out.println(counter);
    }
}
