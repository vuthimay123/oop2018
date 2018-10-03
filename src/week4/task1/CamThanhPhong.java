package week4.task1;

/**
 * Created by CCNE on 03/10/2018.
 */
//tao lop camthanhphong ke thua lop cam
public class CamThanhPhong extends Cam{
    private char type;
    public void print1(char type)
    {
        if(type=='A'){
            System.out.println("chat luong cao ");
        }
        else{
            System.out.println("Loai trung binh");
        }
    }
}
