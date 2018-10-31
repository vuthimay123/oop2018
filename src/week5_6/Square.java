package week5_6;

public class Square extends Rectangle {

    public Square(toado x1, toado x2, toado x3, toado x4) {
        super(x1, x2, x3, x4);
    }
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double setArea(){
        return side*side;
    }
}
