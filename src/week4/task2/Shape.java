package week4.task2;

public class Shape {
    private String color="red";
    private boolean filled=true;
    public  Shape(){

    }
    public Shape(String color,boolean filled){}
    public void setColor(String color)
    {
         this.color=color;
    }
    public String getColor()
    {
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFill(boolean filled){
        this.filled=filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
