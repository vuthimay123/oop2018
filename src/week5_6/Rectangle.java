package week5_6;

public class Rectangle extends Shape{
    private toado x1,x2,x3,x4;
    public Rectangle(toado x1,toado x2,toado x3,toado x4){
        setX1(x1);
        setX2(x2);
        setX3(x3);
        setX4(x4);
    }
    private double width,length;

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

    public toado getX1() {
        return x1;
    }

    public void setX1(toado x1) {
        this.x1 = x1;
    }

    public toado getX2() {
        return x2;
    }

    public void setX2(toado x2) {
        this.x2 = x2;
    }

    public toado getX3() {
        return x3;
    }

    public void setX3(toado x3) {
        this.x3 = x3;
    }

    public toado getX4() {
        return x4;
    }

    public void setX4(toado x4) {
        this.x4 = x4;
    }
    public double getArea(double w,double l)
    {
        return l*w;
    }
}
