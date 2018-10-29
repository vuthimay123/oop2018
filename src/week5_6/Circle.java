package week5_6;

public class Circle extends Shape {
    private double radius;
    final double  PI=3.14;
    public Circle(double radius,toado td_tam,String mau)
    {
        this.radius=radius;
        setTd(td_tam);
        setMau(mau);
    }
    public double area()
    {
        return (radius*radius*PI);
    }

}
