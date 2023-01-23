package withoutocp;

public class ShapeService {

    public static void main(String[] args) {
        Area area = new Area();
        Rectangle rectangle = new Rectangle(10, 10);
        Circle circle = new Circle(10);

        var rectangleArea = area.calculateArea(rectangle);
        var circleArea = area.calculateArea(circle);

        System.out.println("The rectangle area is: " + rectangleArea);
        System.out.println("The circle area is: " + circleArea);
    }
}
