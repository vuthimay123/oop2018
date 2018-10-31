package week7.task2;

public class Task2 {

    public static void main(String[] args) {
        //(NullPointerException
        try{
            String test = null;
            test.charAt(0);
        } catch (NullPointerException e) {
            System.out.println("Error NULL pointer");
        }
        //ArrayIndexOutOfBoundsException
        try{
            int[] a=new int[3];
            a[4]=10;

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error ArrayIndexOutOfBoundsException");
        }


    }


}
