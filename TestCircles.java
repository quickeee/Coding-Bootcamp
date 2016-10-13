public class TestCircles {

    public static void main (String [] args) {
        Circle a = new Circle();
        a.setx(3);
        a.sety(4);
        a.setr(5);
        a.print();
        Circle b = new Circle(5,7);
        b.print();
        Circle c = new Circle(1,1,1);
        c.print();
        System.out.println("The area of circle a is: "+a.calculateArea());
        System.out.println("The perimeter of circle c is: "+c.calculatePerimeter());
        Circle d = c.copy();
        System.out.println("The perimeter of circle d is: "+d.calculatePerimeter());
        c.setx(2);
        c.sety(3);
        c.setr(18);
        System.out.println("Perimeter c = "+ c.calculatePerimeter()+" Perimeter d = "+d.calculatePerimeter());
        System.out.println(Circle.cocentric(c,d));
        Circle e = new Circle(1,1,5);
        System.out.println(Circle.cocentric(d,e));
        System.out.println(Circle.getCounter());
    }
}
