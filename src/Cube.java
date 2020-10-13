import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Cube extends Shape3d {
    public double Side;
    public double Area;
    public double Volume;

    public Cube(double Side){
        //area
        this.Area = (Side*Side)*6;
        //volume
        this.Volume = (Side*Side*Side);
    }

    @Override
    public double getVolume() {
        return Volume;
    }

    @Override
    public String getName() {
        return "cube";
    }

    @Override
    public double getArea() {
        return Area;
    }
}
