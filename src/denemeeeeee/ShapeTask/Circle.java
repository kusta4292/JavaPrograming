package denemeeeeee.ShapeTask;

public class Circle extends Shape{

    private int r;
    public final double pi= 3.14;

    public Circle(String name, int area, int perimeter,int r) {
        super(name, area, perimeter);
    }


    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }


    @Override
    public void area() {

        System.out.println("circle area="+r*r*pi);

    }

    @Override
    public void perimeter() {

        System.out.println("circle perimeter = "+2*r*pi);

    }
}
