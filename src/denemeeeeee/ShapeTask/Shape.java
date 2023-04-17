package denemeeeeee.ShapeTask;

public abstract class Shape {
    private String name;
    private int area;
    private int perimeter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if (area <= 0) {
            throw new RuntimeException("Invalid area:" + area);
        }
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        if (perimeter <= 0) {
            throw new RuntimeException("Invalid area:" + perimeter);
        }
        this.perimeter = perimeter;

    }

    public Shape(String name, int area, int perimeter) {
       setName(name);
       setArea(area);
       setPerimeter(perimeter);
    }
    public abstract void area();
    public abstract void perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}