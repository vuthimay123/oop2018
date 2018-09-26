package week2.task1;

import java.util.Scanner;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        while(b!=0){
        int r = a % b;
        a = b;
        b = r;
    }

        return a;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
       // int fibonacci1=0;
        int a=0;
        int b=1;
        int fibonacci1=a+b;
        if(n==0)
            return 0;
        if(n==1) return 1;
        if(n>=2)
        while(b<n-2) {

            a=b;
            b=fibonacci1;
            fibonacci1 = a + b;
        }
        return fibonacci1;
    }
    public static void main(String[] args)
    {
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.println("nhap so thu nhat:");
        a=input.nextInt();
        System.out.println("nhap so thu hai ");
        b=input.nextInt();
        int ucln=gcd(a,b);
        System.out.println("uoc chung lon nhat cua hai so do la "+ucln);
        System.out.println("nhap so fibonacci can tim " );
        int n=input.nextInt();

        System.out.println("so fibonacci thu"+n+" = "+fibonacci(n));


    }
}


