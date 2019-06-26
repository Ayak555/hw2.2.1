public class Square extends Figure {

    private double sideA;

    @Override
    public double calculatePerimetr() {
        return 4 * sideA;
    }

    public Square(double sideA) {
        super("квадрат");
        this.sideA = sideA;
    }

    @Override
    public String draw() {
        return "\u2B1B";
    }
}
