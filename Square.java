public class Square {
    public class Square extends Shape {
        private double length;

        public Square(int x, int y, String myColor, double length) {
            super(x, y, myColor);
            this.length = length;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public void draw() {
            System.out.println("Şekil Tipi: Kare");
            System.out.println("Konum: (" + getX() + ", " + getY() + ")");
            System.out.println("Renk: " + getMyColor());
            System.out.println("Kenar Uzunluğu: " + length);
            System.out.println("Alan: " + getArea());
            System.out.println("Çevre: " + getPerimeter());
            System.out.println("-------------------");
        }

        public double getArea()
        {
            return length * length;
        }

        public double getPerimeter()
        {
            return 4 * length;
        }

        public void resize(double s)
        {
            length = length * s;
        }
        }

    }
}