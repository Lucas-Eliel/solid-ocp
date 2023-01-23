package withocp;

public class ShapeService {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10);
        Circle circle = new Circle(10);

        var rectangleArea = rectangle.calculateArea();
        var circleArea = circle.calculateArea();

        System.out.println("The rectangle area is: " + rectangleArea);
        System.out.println("The circle area is: " + circleArea);
    }
}
