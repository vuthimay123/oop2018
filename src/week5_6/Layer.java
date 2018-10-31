package week5_6;

import java.util.ArrayList;

public class Layer {
    private ArrayList<Shape> shapes;

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }


    protected void addShape(Shape shape)
    {
        shapes.add(shape);
    }
    //xoa cac doi tuong thuoc lop triangle
    public void detriangle() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle) {

                shapes.remove(shapes.get(i));
            }
            i--;
        }
    }
    public void deCircle() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {

                shapes.remove(shapes.get(i));
            }
            i--;
        }
    }

}
