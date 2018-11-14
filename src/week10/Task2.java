package week10;

import java.util.Random;

public class Task2 {
    private static void swap(float a,float b)
    {
        float tam=a;
        a=b;
        b=tam;
    }
    private static void sort(float[]a)
    {
        for(int i=0;i<1000;i++)
        {
            for(int j=0;j<999;j++)
                if(a[j]>a[j+1])
                {
                    float tam=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tam;
                }

        }
    }

    public static void main(String[] args) {
        float[]a=new float[1000];
        Random rd=new Random();
        for(int i=0;i<1000;i++)
        {
            a[i]=  rd.nextFloat();
        }
        sort(a);
        for(int i=0;i<1000;i++)
            System.out.println(i+":" +a[i]+"  ");
    }
}
