package denemeeeeee.ShapeTask;

public class Rectangle extends Shape {

    private int w;
    private int l;

    public Rectangle(String name, int area, int perimeter, int w, int l) {
        super(name, area, perimeter);
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    @Override
    public void area() {

        System.out.println("Area"+getArea()+"="+w*l);

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter"+getPerimeter()+"="+2*(w+l));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + getName() + '\'' +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                ",w=" + w +
                ", l=" + l +
                '}';
    }
}


