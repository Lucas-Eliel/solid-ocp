package withocp;

public class ShapeService {

    public void execute() {
        Area area = new Area();
        Rectangle rectangle = new Rectangle(10, 10);
        Circle circle = new Circle(10);

        var rectangleArea = area.calculateArea(rectangle);
        var circleArea = area.calculateArea(circle);
    }
}
