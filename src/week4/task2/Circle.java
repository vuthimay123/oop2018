package week4.task2;

public class Circle extends Shape {
    private double radius=1.0;
    private double PI=3.14;
    public Circle(){}
    public Circle(double radius){

    }
    public Circle(String color,boolean filled,double radius){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getArea(){
        return(getPI()*getRadius()*getRadius());
    }
    public double  getPerimeter(){
        return(getPI()*2*getRadius());
    }

    @Override
    public String toString() {
       String s;
       s=super.toString()+','+radius;
       return s;
    }
}
