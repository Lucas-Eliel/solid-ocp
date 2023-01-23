package withoutocp;

import java.security.InvalidParameterException;

public class Area {

    public double calculateArea(Object shape) {

        if (shape == null) {
            throw new InvalidParameterException("The parameter is null");
        }

        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getHeight() * rectangle.getWidth();
        } else {
            Circle circle = (Circle) shape;
            return circle.getRadius() * circle.getRadius() * Math.PI;
        }
    }

}
