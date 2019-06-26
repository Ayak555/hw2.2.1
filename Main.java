public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(5, 3.14);
        Square s1 = new Square(25);
        Triangle t1 = new Triangle(6, 5, 9);
        Rectangle r1 = new Rectangle(4, 3);
        Dog d1 = new Dog();


        System.out.println(c1.getName() + " " + c1.draw());
        System.out.println(s1.getName() + " " + s1.draw());
        System.out.println(t1.getName() + " " + t1.draw());
        System.out.println(r1.getName() + " " + r1.draw());
        System.out.println(d1.getName() + " " + d1.draw());
        System.out.println(d1.draw() + " " + d1.callSound());

        System.out.println("Периметр круга равен " + c1.calculatePerimetr());
        System.out.println("Периметр прямоугольника равен " + r1.calculatePerimetr());
        System.out.println("Периметр квадрата равен " + s1.calculatePerimetr());
        System.out.println("Периметр треугольника равен " + t1.calculatePerimetr());

        System.out.println("           ");
        System.out.println("___________________________");
        System.out.println("           ");

        Figure[] figures = {new Circle(5, 3.14), new Triangle(5, 4, 7),
                new Square(33), new Rectangle(4, 8), new Triangle(7, 6, 15),
                new Rectangle(45, 3)};

        for (int i = 0; i < figures.length; i++) {
           System.out.println(figures[i].draw() + "  Периметр фигуры - " + figures[i].getName() + "  " + figures[i].calculatePerimetr());
        }

    }


}
