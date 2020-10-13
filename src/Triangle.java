public class Triangle extends Shape2d {
    public double Base;
    public double Height;
    public double Area;

    public Triangle(double Base, double Height){
        //area
        this.Area = (Base*Height)/2.00;

    }

    @Override
    public double getArea() {
        return Area;
    }

    @Override
    public String getName() {
        return "triangle";
    }
}

