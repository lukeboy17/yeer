public class Square extends Shape2d {

    public double thisSide;
    public Square(double thisSide){
        //area
        this.thisSide = thisSide;

    }

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public double getArea() {
        return thisSide*thisSide;
    }
}
