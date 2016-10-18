public class Circle {

    private int x;
    private int y;
    private int r;
    private final double pi = 3.14;
    private static int number_of_circles;

    public int getx() {
        return x;
    }
    public int gety() {
        return y;
    }
    public int getr() {
        return r;
    }
    public void setx(int x) {
        this.x = x;
    }
    public void sety(int y) {
        this.y = y;
    }
    public void setr(int r) {
        this.r = r;
    }
    Circle () {
        number_of_circles += 1;
        this.x = this.y = 0;
        this.r = 1;
    }
    Circle(int x,int y) {
        this();
        this.x = x;
        this.y = y;
    }
    Circle(int x,int y,int r) {
        this(x,y);
        this.r = r;
    }
    public void print() {
        System.out.println("I am a circle at point (" + x + "," + y +") with radius " + r +" Where " + x+","+ y +" and " + r+" are the values of the current circle.");
    }
    public double calculateArea () {
        double area = pi * r * r;
        return area;
    }
    public double calculatePerimeter() {
        double perimeter = 2*pi*r;
        return perimeter;
    }
    public Circle copy() {
        /*Circle new_Object = new Circle();
        new_Object.x = this.x;
        new_Object.y = this.y;
        new_Object.r = this.r;
        return new_Object;*/
        return new Circle(this.x, this.y, this.r);
    }
    public static boolean cocentric(Circle a,Circle b) {
        if ((a.getx() == b.getx()) && ((a.gety() == b.gety()))) {
            return true;
        }
        else {
            return false;
        }
    }
    public static int getCounter() {
        return number_of_circles;
    }
}
