
public class Circle extends Shape2d{
    public double Radius;
    public double Area;

    public Circle(double Radius){
        //area
        this.Area = (Math.pow(Radius,2))*Math.PI;

    }

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public double getArea() {
        return Area;
    }
}
