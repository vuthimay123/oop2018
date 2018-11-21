package week11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task2 {
    public static <T extends Comparable> T max(ArrayList<T> array)
    {
        T max=array.get(0);
        for(int i=1;i<array.size();i++)
        {
            if(max.compareTo(array.get(i))<0)
                max=array.get(i);
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> array =new ArrayList<Integer>();
        array.add(2);
        array.add(3);
        array.add(3);
        array.add(-1);
        System.out.println("so lon nhat trong mnang a la:"+max(array));
        ArrayList<Character> arrayList= new ArrayList<Character>();
        arrayList.add('a');
        arrayList.add('h');
        arrayList.add('m');
        System.out.println("gia tri mã trong day la: "+max(arrayList));
    }
}
