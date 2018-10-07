package week4.task2;

public class Rectangle {
    private double width=1.0;
    private double length=1.0;
    public Rectangle(){}
    public Rectangle(double width,double length){}
    public Rectangle(double width,double length,String color,boolean filled){}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
}
