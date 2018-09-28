package week3;
import static org.junit.Assert.*;
import static week3.Week3.calculateBMI;
import static week3.Week3.max;
import static week3.Week3.minOfArray;
import junit.framework.TestCase;
import java.lang.AssertionError;
import org.junit.Test;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testmax1(){
       // int max1=max(2,3);
      assertEquals(3, max(2, 3));
      assertEquals(6,max(5,6));
      assertEquals(0,max(0,-1));
      assertEquals(100,max(100,2));
      assertEquals(-6,max(-7,-6));
    }




    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public   void testarray(){
        int[] array1={2,6,4,1,-1};
        int[] array2={1,9,0,7,12,100};
        int[] array3={100,32,12,9,67};
        int[] array4={1,5};
        int[] array5={-1};

        assertEquals(-1, minOfArray(array1));
        assertEquals(0,minOfArray(array2));
        assertEquals(9,minOfArray(array3));
        assertEquals(1,minOfArray(array4));
        assertEquals(-1,minOfArray(array5));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI(
    @Test
    public void testbmi(){
        assertEquals("Bình thường",calculateBMI(53,1.63));
        assertEquals("Béo phì",calculateBMI(84,1.6));
         assertEquals("Thiếu cân",calculateBMI(40,1.65));
         assertEquals("Thừa cân",calculateBMI(63,1.63));
         assertEquals("Bình thường",calculateBMI(45,1.5));
     }

}
