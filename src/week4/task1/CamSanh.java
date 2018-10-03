package week4.task1;

/**
 * Created by CCNE on 03/10/2018.
 */
public class CamSanh extends HoaQua{
    public String quality;
    boolean real(String id)
    {
            return id.substring(0,2).equals("CS");
    }

}
