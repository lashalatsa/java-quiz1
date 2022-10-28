public class Rectangle implements IFigure{
    protected double width;
    protected double height;

    public Rectangle(double width, double heigh) {
        this.width = width;
        this.height = heigh;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeigh()
    {
        return height;
    }

    @Override
    public double getPerimeter()
    {
        return (width + height) * 2;
    }

    @Override
    public double getArea()
    {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + "heighttt=" + height + '}';
    }
}
