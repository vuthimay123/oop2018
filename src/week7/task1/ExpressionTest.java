package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {

        Expression s10 = new Numeral(10);
        Expression s2 = new Numeral(2);
        Expression s3 = new Numeral(3);
        Expression s1 = new Numeral(1);
        //tinh 10 mu hai
        Expression sq1 = new Square(s10);
        //10^2-1
        Expression st = new Subtraction(sq1, s1);
        //2*3
        Expression mu = new Multiplication(s2, s3);
        //10^2-1+2*3
        Expression ad = new Addition(st, mu);
        // ket qua
        Expression result = new Square(ad);
        System.out.println(result.evaluate());
        System.out.println(result.toString());
        //ngoai le  so 0 la mau
        Numeral numeral1=new Numeral(9);
        Numeral numeral2=new Numeral(0);
        try {
            Division di = new Division(numeral1,numeral2);
            System.out.println(di.evaluate());
        }catch (ArithmeticException e){
            System.err.println("Loi chia cho 0!");
        }
    }
}
