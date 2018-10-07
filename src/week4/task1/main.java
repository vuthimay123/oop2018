package week4.task1;

public class main {
    public static void main(String[] args){
 //  doi tuong kieu Hoaqua
        System.out.println("doi tuong kieu Hoa Qua");
        HoaQua a=new HoaQua();
        System.out.println("ten loai qua la:");
        a.setSpecies("thanh long ");
        System.out.println(a.getSpecies());
        a.price=25000;
        a.mass=100;
        System.out.println("gia cua thanh long la:"+a.price+" dong/kg");
        System.out.println("Tog khoi luong nhap vao la:"+a.mass+" Kg");
//doi tuong kieu Cam
        System.out.println("Doi tuong cam");
        Cam cam=new Cam();
        cam.setSpecies("cam Sanh");// truy cap vao phuong thuc setSpecies cua lop Hoa Qua
        cam.mass=150;//bien mass la bien public trong lop cha hoa qua
        System.out.println("Loai qua la:"+cam.getSpecies()+", khoi luong nhap vao la:"+cam.mass+"Kg");
//doi tuong kieu tao
        System.out.println("doi tuong kieu TAo");
        Tao tao=new Tao();
        tao.mass=200;
        tao.price=30000;
        tao.printtotal(tao.mass,tao.price);
//doi tuong kieu cam Sanh
        System.out.println("Doi tuong kieu CamSAnh ");
        CamSanh sanh=new CamSanh();
        sanh.price=50000;
        sanh.mass=100;
        String id="CS123483";
        System.out.println("gia cam sanh la:"+sanh.price+"Dong/Kg");
        System.out.println("so luong nhap vao la:"+sanh.mass+" Kg");
        System.out.println("chat luong cam la cam chinh hang: "+sanh.test1(id));
//doi tuong cam thanh phong
        System.out.println("Doi tuong kieu Cam Thanh Phong");
        CamThanhPhong thanhphong=new CamThanhPhong();
        thanhphong.mass=120;
        System.out.println("khoi luong nhap ve la:"+thanhphong.mass);
        thanhphong.print1('A');




    }
}
