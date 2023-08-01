public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super.setWidth(side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        super.setWidth(side);

    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double width) {
       super.setWidth(width);
    }

    public double getArea(){
        return super.getLength() * getSide();
    }
    public double getPerimeter(){
        return getArea() * 2;
    }

    @Override
    public String toString() {
        return "A square with side = "+super.getWidth()+", which is a subclass of "+super.toString()+", where "+super.toString()+
                " is the output of the toString() method from the superclass";
    }
}
