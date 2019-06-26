public class Triangle extends Figure {

    public double sideA;
    public double sideB;
    public double sideC;

    @Override
    public double calculatePerimetr() {
        return sideA + sideB + sideC;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        super("треугольник");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String draw() {
        return "\ud83d\udd3a";
    }

}
