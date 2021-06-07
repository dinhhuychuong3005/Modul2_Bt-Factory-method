public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s1 = shapeFactory.getShape("circle");
        System.out.println("s1: ");
        s1.draw();
        Shape s2 = shapeFactory.getShape("square");
        System.out.println("s2: ");
        s2.draw();
        Shape s3 = shapeFactory.getShape("rectangle");
        System.out.println("s3: ");
        s3.draw();
    }
}
