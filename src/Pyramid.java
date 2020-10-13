public class Pyramid extends Shape3d {
    public double Lenght;
    public double Width;
    public double Height;
    public double Area;
    public double Volume;

    public Pyramid(double Length, double Width, double Height) {
        // x is for first square root
        double x = (Math.pow((Width / 2), 2)) + Math.pow(Height, 2);
        //y is for second square root
        double y = (Math.pow((Length / 2), 2)) + Math.pow(Height, 2);
        //area
        this.Area = (Length * Width) + Length * Math.sqrt(x) + Width * Math.sqrt(y);
        //volume
        this.Volume = (Length * Width * Height) / 3;
    }

    @Override
    public double getVolume() {
        return Volume;
    }

    @Override
    public String getName() {
        return "pyramid";
    }

    @Override
    public double getArea() {
        return Area;
    }
}