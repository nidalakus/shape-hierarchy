public class ShapeTester
{
    public static void main (String[] args)
    {
        System.out.println("------Shape Tester------");

        Square s1 = new Square(10, 20, "Green", 2.0);
        Square s2 = new Square(5, 10, "Blue", 3.0);

        Circle c1 = new Circle(25, 30, "Red", 5.0);
        Circle c2 = new Circle(35, 40, "Yellow", 7.0);

        System.out.println("------Draw Method Test------");
        s1.draw();
        c1.draw();

        System.out.println("------Area and Perimeter Test------");
        System.out.println("s1 area: " + s1.getArea());
        System.out.println("s1 perimeter: " + s1.getPerimeter());
        System.out.println("c1 area: " + c1.getArea());
        System.out.println("c1 perimeter: " + c1.getPerimeter());
        System.out.println();

        System.out.println("------Resize Method Test------");
        System.out.println("s1's previous length: " + s1.getLength());
        s1.resize(0.5);
        System.out.println("s12s ahter length (0.5): " + s1.getLength());
        System.out.println("New area: " + s1.getArea());
        System.out.println();

        System.out.println("c1's previous radius: " + c1.getRadius());
        c1.resize(2.0);
        System.out.println("c1's after radius (2.0): " + c1.getRadius());
        System.out.println("New area: " + c1.getArea());
        System.out.println();

        System.out.println("------Compare Test------");

        int result1 = s2.compareTo(c2);
        if (result1 > 0) {
            System.out.println("s2's area is greater than c2's area");
        } else if (result1 < 0) {
            System.out.println("s2's area is samller than c2's area");
        } else {
            System.out.println("s2's area is equal to c2's area");
        }

        int result2 = c1.compareTo(s1);
        if (result2 > 0) {
            System.out.println("c1's area is greater than s1's area");
        } else if (result2 < 0) {
            System.out.println("c1's area is samller than s1's area");
        } else {
            System.out.println("c1's area is equal to s1's area");
        }

        System.out.println();

        System.out.println("------Getter and Setter------");
        System.out.println("s1 X coordiante: " + s1.getX());
        s1.setX(100);
        System.out.println("new s1 X coordinate: " + s1.getX());

        System.out.println("c1's color: " + c1.getMyColor());
        c1.setMyColor("Pink");
        System.out.println("c1's new color: " + c1.getMyColor());

        System.out.println("\n------Test Completed------");
    }
}
