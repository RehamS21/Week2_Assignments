// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Shape : ");
        Shape sh1 = new Shape("Black" , false);
        System.out.println("Before edit shape information");
        System.out.println(sh1.toString());
        sh1.setColor("Yellow");
        sh1.setFilled(true);
        System.out.println("After edit shape");
        System.out.println(sh1.toString());

        System.out.println("__________________");
        System.out.println("Circle");
        Circle c1 = new Circle("Gold", false , 5);
        System.out.println("Area of Circle = "+String.format("%.2f",c1.getArea()));
        System.out.println("Perimeter of Circle =  "+String.format("%.2f",c1.getPerimeter()));
        System.out.println(c1.toString());
        System.out.println("Circle after update : ");
        c1.setRadius(12);
        c1.setColor("Blue");
        c1.setFilled(false);
        System.out.println(c1.toString());

        System.out.println("__________________");
        System.out.println("Rectangle : ");
        Rectangle re1 = new Rectangle("Blue",true,12.6,12.6);
        System.out.println("Area of Rectangle :  "+String.format("%.2f",re1.getArea()));
        System.out.println("Perimeter of Rectangle : "+String.format("%.2f",re1.getPerimeter()));
        System.out.println(re1.toString());

        System.out.println("Rectangle after update : ");
        re1.setWidth(15);
        re1.setLength(15);
        re1.setColor("light blue");
        re1.setFilled(false);
        System.out.println(re1.toString());

        System.out.println("__________________");
        System.out.println("Square : ");
        Square sq1 = new Square("Red", true,8);
        System.out.println("Area of Square :  "+String.format("%.2f",sq1.getArea()));
        System.out.println("Perimeter of Square : "+String.format("%.2f",sq1.getPerimeter()));
        System.out.println(sq1.toString());

        System.out.println("Square after update : ");
        sq1.setSide(12);
        re1.setColor("dark blue");
        System.out.println(sq1.toString());
    }
}