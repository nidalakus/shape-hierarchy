public class Circle
{
    public class circle extends Shape
    {
        private double radius;

        public Circle(int x, int y; String myColor, double radius)
        {
            super(x, y, myColor);
            this.radius = radius;
        }

        public double getRadius()
        {
            return radius;
        }

        public void setRadius(double radius)
        {
            this.radius = radius;
        }

        public void draw() {
            System.out.println("Shape type: Circle");
            System.out.println("Position: (" + getX() + ", " + getY() + ")");
            System.out.println("Color: " + getMyColor());
            System.out.println("Radius: " + radius);
            System.out.println("Area: " + getArea());
            System.out.println("Perimeter: " + getPerimeter());
            System.out.println("-------------------");
        }

        public double getArea()
        {
            return radius * radius * Math.PI;
        }

        public double getPerimeter()
        {
            return 2 * radius * Math.PI;
        }

        public void resize(double s)
        {
            radius = radius * s;
        }
    }
}
