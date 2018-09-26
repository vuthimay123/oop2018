package week2.task3;

public class Task3 {
}
//class bieu dien doi tuong hoc sinh
    class student{
    private String lop;
    private String name;
    private int diemtb;

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(int diemtb) {
        this.diemtb = diemtb;
    }

    //diem co bang nhau  khong
    public boolean sosanh(student other)
    {
        return (this.diemtb==(other.diemtb));
    }
    //xep hang sinh vien
    public void xeploai()
    {
        if(this.diemtb>=8)
            System.out.println("xep loai gioi");
        if(this.diemtb<8&&this.diemtb>=6.5)
            System.out.println("xep loai kha");
        if(this.diemtb<6.5&&this.diemtb>=4)
            System.out.println("xep loai trung binh");
        if(this.diemtb<4)
            System.out.println("hoc lai");
    }
    //cung lop hay khong
    public boolean sosanhlop(student other )
    {
        return (this.lop.equals(other.lop));
    }

}

// lop bieu dien do tuong con heo
    class conheo{
    private String color;
    private float weight;
    private int age;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // tieng keu cua con heo
    public void tiengkeu()
    {
        System.out.println("un innnn ");
    }
    // heo bi benh hay khong
    public boolean sick()
    {
        return (this.color.equals("mau tim ")) ;

    }
    //so sanh can nang cua hai con heo
    boolean compare(conheo a)
    {
        return (this.weight==(a.weight));
    }

}
//class bieu dien doi tuong lop hoc
    class classroom{
    private int student ;
    private String name;
    private int table ;

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }
    //in ra ten lop
    public void print()
    {
        System.out.println(this.name);
    }
    //co du cho ngoi hay khong
    public boolean enough()
    {
        return ((this.table)*2>=this.student);
    }
    //in ra so sinh vien trong lop
    public void sv()
    {
        System.out.println(this.student);
    }
}