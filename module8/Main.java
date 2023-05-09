package module8;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Octagon();
        Shape shape3 = new Rectangle();
        Shape shape4 = new Square();
        Shape shape5 = new Trapezoid();
        Shape shape6 = new Triangle();
        NamePrinter.printShapeName(shape1);
        NamePrinter.printShapeName(shape2);
        NamePrinter.printShapeName(shape3);
        NamePrinter.printShapeName(shape4);
        NamePrinter.printShapeName(shape5);
        NamePrinter.printShapeName(shape6);
    }
}
