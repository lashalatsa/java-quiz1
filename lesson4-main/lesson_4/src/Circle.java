public class Circle implements  IFigure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return  "Circle{"+"radius"+radius+"}";
    }

    @Override
    public double getPerimeter(){
        return Math.PI *2*radius;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

