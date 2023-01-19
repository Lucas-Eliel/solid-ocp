package withoutocp;

public class ShapeService {

    public void execute() {
        Rectangle rectangle = new Rectangle(10, 10);
        Circle circle = new Circle(10);

        var rectangleArea = rectangle.calculateArea();
        var circleArea = circle.calculateArea();
    }
}
