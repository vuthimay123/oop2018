package week4.task2;

public class Rectangle extends Shape{
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
    public double getArea(){
        return(getLength()*getWidth());
    }
    public double getPerimeter(){
        return ((getLength()+getWidth())*2);
    }
    public String toString() {
        String s;
        s=super.toString()+','+"width:"+width+','+"length:"+length;
        return s;
    }
}
