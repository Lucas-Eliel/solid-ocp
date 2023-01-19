package withoutocp;

public class Circle implements Area {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return this.radius * radius * Math.PI;
    }
}
