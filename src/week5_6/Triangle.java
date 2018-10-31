package week5_6;

public class Triangle extends Shape{
    private toado x1,x2,x3;

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
    public Triangle(toado x1,toado x2,toado x3)
    {
        setX1(x1);
        setX2(x2);
        setX3(x3);

    }
}
