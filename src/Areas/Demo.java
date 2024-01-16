package Areas;

public class Demo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(1,2);
        System.out.println(shape.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle1.getArea());
    }
}
