import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ShapeTest {

    @Test
    public void testSquareName(){
        Shape shape = new Square(10);
        assertEquals("square", shape.getName());
    }

    @Test
    public void testSquareArea(){
        Shape2d shape = new Square(10);
        assertEquals(100, shape.getArea());
    }

    @Test

    public void testSquareArea2(){
        Shape2d shape = new Square(.5);
        assertEquals(.25, shape.getArea());
    }

    @Test
    public void testTriangleName(){
        Shape shape = new Triangle(100,100);
        assertEquals("triangle", shape.getName());
    }

    @Test
    public void testTriangleArea(){
        Shape2d shape = new Triangle(10,10);
        assertEquals(50, shape.getArea());
    }

    @Test
    public void testTriangleArea2(){
        Shape2d shape = new Triangle(0.5,0.25);
        assertEquals(0.063, shape.getArea(),0.001 );
    }

    @Test
    public void testCircleName(){
        Shape shape = new Circle(10);
        assertEquals("circle", shape.getName());
    }

    @Test
    public void testCircleArea(){
        Shape2d shape = new Circle(10);
        assertEquals(314.16, shape.getArea(),0.01 );
    }

    @Test
    public void testCircleArea2(){
        Shape2d shape = new Circle(0.5);
        assertEquals(0.79, shape.getArea(),0.01 );
    }
    @Test
    public void testCubeName(){
        Shape shape = new Cube(100);
        assertEquals("cube", shape.getName());
    }

    @Test
    public void testCubeArea(){
        Shape3d shape = new Cube(10);
        assertEquals(600, shape.getArea());
    }

    @Test
    public void testCubeArea2(){
        Shape shape = new Cube(0.5);
        assertEquals(1.5, shape.getArea(),0.01 );
    }
    @Test
    public void testCubeVolume(){
        Shape3d shape = new Cube(10);
        assertEquals(1000, shape.getVolume());
    }
    @Test
    public void testCubeVolume2(){
        Shape3d shape = new Cube(0.5);
        assertEquals(0.13, shape.getVolume(),0.01);
    }
    @Test
    public void pyramidName(){
        Shape shape = new Pyramid(10,10,10);
        assertEquals("pyramid", shape.getName());
    }
    @Test
    public void testPyramidArea(){
        Shape3d shape = new Pyramid(10,10,10);
        assertEquals(323.61, shape.getArea(),0.01);
    }
    @Test
    public void testPyramidArea2(){
        Shape3d shape = new Pyramid(5,10,15);
        assertEquals(281.13, shape.getArea(),0.01);
    }
    @Test
    public void testPyramidVolume(){
        Shape3d shape = new Pyramid(10,10,10);
        assertEquals(333.33, shape.getVolume(),0.01);
    }
    @Test
    public void testPyramidVolume2(){
        Shape3d shape = new Pyramid(1.5,.5,2.5);
        assertEquals(0.63, shape.getVolume(),0.01);
    }
    @Test
    public void testSphereName(){
        Shape shape = new Sphere(10);
        assertEquals("sphere", shape.getName());
    }
    @Test
    public void sphereArea(){
        Shape shape = new Sphere(10);
        assertEquals(1256.64, shape.getArea(),0.01);
    }
    @Test
    public void sphereArea2(){
        Shape3d shape = new Sphere(0.75);
        assertEquals(7.07, shape.getArea(),0.01);
    }
    @Test
    public void sphereVolume(){
        Shape3d shape = new Sphere(10);
        assertEquals(4188.79, shape.getVolume(),0.01);
    }
    @Test
    public void sphereVolume2(){
        Shape3d shape = new Sphere(0.6);
        assertEquals(.9, shape.getVolume(),0.01);
    }


}
