package denemeeeeee.ShapeTask;



public class Square extends Shape{

    private int s;

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public Square(String name, int area, int perimeter, int s) {
        super(name, area, perimeter);
        this.s = s;
    }

    @Override
    public void area() {

        System.out.println("Square area:"+s*s);

    }

    @Override
    public void perimeter() {

        System.out.println("Square perimeter:"+4*s);

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + getName() + '\'' +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                ",s=" + s +
                '}';
    }
}
