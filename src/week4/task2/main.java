package week4.task2;

public class main {

    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape shape1=new Shape("red",true);
        Circle circle = new Circle("green",false,3);
        Rectangle rectangle=new Rectangle(4,5,"brown",false);
        Square squaqre=new Square(1,"yellow",true);
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());
        System.out.println(shape1.toString());
        System.out.println(shape1.getColor());
        

    }


}
