package week4.task2;

public class Square extends Rectangle  {
    double Side;
    public Square (){}
    public Square (double size,String color,boolean filled){}

    public double getSide() {
        return Side;
    }

    public void setSide(double side) {
        Side = side;
    }
    public void setWidth(double Side)
    {
        System.out.println(Side);
    }
    public void setLength(double Side)
    {
        System.out.println(Side);
    }
    public String toString() {
        String s;
        s=super.toString()+','+"Side:"+Side;
        return s;
    }
}
