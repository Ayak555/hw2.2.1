public class Rectangle extends Figure {

    public double sideA;
    public double sideB;

    @Override
    public double calculatePerimetr() {
        return 2 * sideA + 2 * sideB;
    }

    public Rectangle(double sideA, double sideB) {
        super("прямоугольник");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public String draw() {
        char c = '\u2B1B';
        return new String().valueOf(c) + new String().valueOf(c);
    }

}
