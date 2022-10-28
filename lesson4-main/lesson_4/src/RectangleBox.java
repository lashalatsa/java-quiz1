public class RectangleBox extends Rectangle{

    private double length;

    public double getLength()
    {
        return length;
    }
    public RectangleBox(double width, double height, double length){
        super (width,height);
        this.length = length;
    }

    @Override
    public double getArea()
    {
        return 2*((width*height) + (height*length) + (width*length));
    }
    @Override

    public double getPerimeter()
    {
        return 4 * (width +height+length);
    }
    @Override
    public String toString()
    {
        return super.toString()+";"+length;
    }
}

