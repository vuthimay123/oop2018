package week5_6;

public class main {
    public static void main(String[] args) {
        toado p=new toado(1,3);
        Circle c2 = new Circle(4,p,"vang");
        toado p1 =  new toado(0,2);
        toado p2 = new toado(1,5);
        toado p3 = new toado(2,4);
        Triangle t1 = new Triangle(p1,p2,p3);

        Layer layer = new Layer();
        layer.addShape(c2);
        layer.addShape(t1);

       // layer.deTriangle();
       // System.out.println(layer.kiemtraTriangle());
        toado x1=new toado(2,3);
        toado x2=new toado(4,5);
        toado x3=new toado(6,1);
        toado x4=new toado(3,4);
        toado x5=new toado(8 ,4 );
        toado x6=new toado(1,0);
        Rectangle r1 = new Rectangle(x1,x2,x3,x4);
        Triangle t3 = new Triangle(x4,x5,x6);
        Circle c = new Circle(1,x1,"tim");

        Layer layer1 = new Layer();
        layer1.addShape(r1);
        layer1.addShape(t3);
        layer1.addShape(c);

        Diagram diagram = new Diagram();
        diagram.addLayer(layer);
        diagram.addLayer(layer1);

        System.out.println("diagram hien tai: ");
        for(int i=0;i<diagram.arrLayer.size();i++)
        {
            System.out.println("cac hinh trong layer thu"+ i+1);
            diagram.arrLayer.get(i).getShapes();
        }

    }
}
