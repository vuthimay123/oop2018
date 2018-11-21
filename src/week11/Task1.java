package week11;

public class Task1 {

    public static <T extends Comparable> void sort ( T [] a  ){
        for(int i=0;i<a.length-1;i++ )

            for(int j=i+1;j<a.length;j++){
                if(a[i].compareTo(a[j])>0)
                {
                    T x=a[i];
                    a[i]=a[j];
                    a[j]=x;
                }
            }

    }

    public static void main(String[] args) {
        Byte []a={2,5,4,1,0};
        System.out.println("mang a khi da sap xep la:");
        sort(a);
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
        Character [] characters={'a','f','g'};
        sort(characters);
        System.out.println("mang charater sau khi duoc sap xep la:");
        for(int i=00;i<characters.length;i++){
            System.out.println(characters[i]);
        }
        Integer[] integer={3,43,45,1200};
        System.out.println("mang integers sau khi duoc sap xep la:");
        sort(integer);
        for(int i=0;i<integer.length;i++)
        {
            System.out.println(integer[i]);
        }
        Double[] b={22.6,4.3,6.543};
        System.out.println("mang cac so thuc sau khi duoc sap xep la:");
        sort(b);
        for(int i=0;i<b.length;i++)
            System.out.println(b[i]);
        Float[] f={2.2f,6.789f,0.31f};
        System.out.println("mang cac so thuc sau khi duoc sap xep la:");
        sort(f);
        for(int i=0;i<f.length;i++)
            System.out.println(f[i]);
    }
}
//package week11;

//public class Task1 {
//    public static <T extends Comparable> void sort(T []a){
//        for(int i = 0 ;i<a.length-1;i++){
//            {
//                for(int j=0;j<a.length-1-i;j++){
//                    if(a[j].compareTo(a[j+1])>0)
//                    {
//                        T tmp = a[j];
//                        a[j] = a[j+1];
//                        a[j+1] = tmp;
//                    }
//                }
//
//            }
//
//        }
//    }
//    public static void main(String []a){
//        Character [] b = {'c','a','b','d'};
//        Double [] c = {1.2, 0.0, 3.6, 2.1, 4.1};
//        Float[] d ={2.2f,1f,0.9f,1.1f,4.6f};
//        Byte[] e ={1,2,4,0,6,3,9};
//        Integer [] f = {2,4444,0,5,10};
//        sort(b);
//        for(int i = 0 ;i<b.length;i++)
//        {
//            System.out.println(b[i]);
//        }
//    }
//}