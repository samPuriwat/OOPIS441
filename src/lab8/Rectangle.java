package lab8;

public class Rectangle extends GraphicObject {
    private double width, high;

    @Override
    void draw() {
        System.out.println("Drawing Rectangle...");
    }

    @Override
    double findArea() {
        return this.high * this.width;
    }

    public Rectangle(double width, double high) {
        this.width = width;
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
