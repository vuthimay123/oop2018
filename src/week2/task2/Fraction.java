package week2.task2;

import sun.net.ftp.FtpClient;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator, denominator;


    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Ph&#x1b0;&#x1a1;ng th&#x1ee9;c c&#x1ed9;ng hai ph&acirc;n s&#x1ed1; (this v&agrave; other), tr&#x1ea3; v&#x1ec1; &#x111;&#x1ed1;i t&#x1b0;&#x1ee3;ng Fraction m&#x1edb;i
        Fraction sum1 = new Fraction(0, 0);
        sum1.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        sum1.denominator = this.denominator * other.denominator;


        return sum1;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction hieu = new Fraction(0, 0);

        hieu.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        hieu.denominator = this.denominator * other.denominator;

        return hieu;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction tich = new Fraction(0, 0);
        tich.numerator = this.numerator * other.numerator;
        tich.denominator = this.denominator * other.denominator;

        return tich;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction thuong = new Fraction(0, 0);
        thuong.numerator = this.numerator * other.denominator;
        thuong.denominator = this.denominator * other.numerator;

        return thuong;
    }

    public boolean equals(Fraction other) {
        return (this.numerator * other.denominator) == (this.denominator * other.numerator);
    }
}
//may