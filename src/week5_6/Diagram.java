package week5_6;

//import com.sun.tools.javac.util.JDK9Wrappers;

import java.util.ArrayList;

public class Diagram {
    ArrayList<Layer> arrLayer=new ArrayList<>();
    public void addLayer(Layer layer1)
    {
        arrLayer.add(layer1);
    }
    //xoa hinh trong trong diagram
    public void deCircle()
    {
        for(int i=0;i<arrLayer.size();i++)
        {
            arrLayer.get(i).deCircle();
        }
    }
}
