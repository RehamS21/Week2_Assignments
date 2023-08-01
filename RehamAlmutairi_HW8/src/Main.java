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

        System.out.println("__________________");
        System.out.println("Rectangle : ");
        Rectangle re1 = new Rectangle("Blue",true,12.6,12.3);
        System.out.println("Area of Rectangle :  "+String.format("%.2f",re1.getArea()));
        System.out.println("Perimeter of Rectangle : "+String.format("%.2f",re1.getPerimeter()));
        System.out.println(re1.toString());

        System.out.println("__________________");
        System.out.println("Square : ");
        Square sq1 = new Square("Red", true,1.4);
        System.out.println("Area of Square :  "+String.format("%.2f",sq1.getArea()));
        System.out.println("Perimeter of Square : "+String.format("%.2f",sq1.getPerimeter()));
        System.out.println(sq1.toString());
    }
}