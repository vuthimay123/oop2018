package week2.task2;

//import sun.net.ftp.FtpClient;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator, denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
// ham khoi tao co tham so
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }
//phuong thuc tinh tong hai phan so tra ve ket qua la mot phan so
    public Fraction add(Fraction other) {
        // TODO: Ph&#x1b0;&#x1a1;ng th&#x1ee9;c c&#x1ed9;ng hai ph&acirc;n s&#x1ed1; (this v&agrave; other), tr&#x1ea3; v&#x1ec1; &#x111;&#x1ed1;i t&#x1b0;&#x1ee3;ng Fraction m&#x1edb;i
        Fraction sum1 = new Fraction(0, 0);
        sum1.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        sum1.denominator = this.denominator * other.denominator;


        return sum1;
    }
//phuong  tinh hieu hai phan so va tra ve kat qua la mot phan so
    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction hieu = new Fraction(0, 0);

        hieu.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        hieu.denominator = this.denominator * other.denominator;

        return hieu;
    }
//phuong thuc tinh tich hai phan so tra ve la mot phan so
    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction tich = new Fraction(0, 0);
        tich.numerator = this.numerator * other.numerator;
        tich.denominator = this.denominator * other.denominator;

        return tich;
    }
//phuong thuc chia hai phan so tra ve ket qua  la mot phan so
    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction thuong = new Fraction(0, 0);
        thuong.numerator = this.numerator * other.denominator;
        thuong.denominator = this.denominator * other.numerator;

        return thuong;
    }
//phuong thuc so sanh hai phan so xem co bang nhau hay khong
    public boolean equals(Object obj) {
        Fraction fraction = (Fraction) obj;
        return (this.numerator * fraction.denominator) == (this.denominator * fraction.numerator);
    }

    public static void main(String[] args) {
        Fraction ps1 = new Fraction(1,2);
        Fraction ps2 = new Fraction(3,4);
        Fraction p1 = ps1.add(ps2);
        System.out.println(p1.numerator+"/"+p1.denominator);
        Fraction p2=ps1.subtract(ps2);
        System.out.println(p2.numerator+"/"+p2.denominator);
        Fraction p3=ps1.multiply(ps2);
        System.out.println(p3.numerator+"/"+p3.denominator);
        Fraction p4=ps1.divide(ps2);
        System.out.println(p4.numerator+"/"+p4.denominator);
        System.out.println(ps1.equals(ps2));
    }

}
//may