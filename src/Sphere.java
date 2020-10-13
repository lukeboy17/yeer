public class Sphere extends Shape3d {

    public double Area;
    public double Radius;
    public double Volume;

    public Sphere(double Radius){
        //area
        this.Area = 4*(Math.PI)*(Radius*Radius);
        //volume
        this.Volume = (4.00/3.00)*Math.PI*(Radius*Radius*Radius);
    }

    @Override
    public double getVolume() {
        return Volume;
    }

    @Override
    public String getName() {
        return "sphere";
    }

    @Override
    public double getArea() {
        return Area;
    }
}
