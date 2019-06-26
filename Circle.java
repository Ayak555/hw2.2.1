public class Circle extends Figure {

    public double radius;
    public double pi;

    @Override
    public double calculatePerimetr() {
        return 2 * pi * radius;
    }

    public Circle(double radius, double pi) {
        super("круг");
        this.radius = radius;
        this.pi = pi;
    }

    public String draw() {
        return "\u26AB";
    }
}
