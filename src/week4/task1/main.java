package week4.task1;

public class main {
    public static void main(String[] args){
 //  doi tuong kieu Hoaqua
        HoaQua a=new HoaQua();
        System.out.println("ten loai qua la:");
        a.setSpecies("thanh long ");
        System.out.println(a.getSpecies());
        a.price=25000;
        a.mass=100;
        System.out.println("gia cua thanh long la:"+a.price+" dong/kg");
        System.out.println("Tog khoi luong nhap vao la:"+a.mass+" Kg");
//doi tuong kieu Cam
        Cam cam=new Cam();
        cam.setSpecies("cam Sanh");// truy cap vao phuong thuc setSpecies cua lop Hoa Qua
        cam.mass=150;//bien mass la bien public trong lop cha hoa qua
        System.out.println("Loai qua la:"+cam.getSpecies()+", khoi luong nhap vao la:"+cam.mass+"Kg");
//doi tuong kieu tao
        Tao tao=new Tao();
        tao.mass=200;
        tao.price=30000;
        tao.printtotal(tao.mass,tao.price);




    }
}
