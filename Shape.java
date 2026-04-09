public class Shape
{
    public Shape(int x, int y, String myColor) {
    }

    public abstract class Shape implements Comparable<Shape>
    {
        private int x;
        private int y;
        private String myColor;

        public Shape(int x, int y, String my_color)
        {
            this.x = x;
            this.y = y;
            this.myColor = my_color;
        }

        public int getX()
        {
            return x;
        }

        public int getY(int y)
        {
            return y;
        }

        public String getMyColor()
        {
            return myColor;
        }

        public void setX(int x)
        {
            this.x = x;
        }

        public void setY(int y)
        {
            this.y = y;
        }

        public void setMyColor(String myColor)
        {
            this.myColor = myColor;
        }

        public abstract void draw();
        public abstract double getArea();
        public abstract double getPerimeter();

        public void resize(double s)
        {

        }

        public int compareTo(Shape other) {
            double thisArea = this.getArea();
            double otherArea = other.getArea();

            if (thisArea > otherArea)
            {
                return 1;
            }
            else if (thisArea < otherArea)
            {
                return -1;
            }
            return 0;
        }
    }

}
