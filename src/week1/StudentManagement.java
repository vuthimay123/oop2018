package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student [] students= new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
//        if(s1.getGroup().equals(s2.getGroup()))
//            return true;
        return (s1.getGroup().equals(s2.getGroup())) ; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        // TODO:
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
        Student m=new Student();
        m.setName("Vu Thi May");
        m.setId("17020886");
        m.setEmail("vumay01@gmail.com");
        m.setGroup("nhom 2");
        System.out.println(m.getName());
        System.out.println(m.getEmail());
        System.out.println(m.getId());
        System.out.println(m.getGroup());
        m.getInfo();
        Student a= new Student();
        a.getInfo();
        Student b=new Student("May","1702","vumay01");
        b.getInfo();
        Student c=new Student(b);
        c.getInfo();
        Student s1=new Student();
        s1.setGroup("INT22041");
        Student s2=new Student();
        s2.setGroup("INT22041");
        Student s3=new Student();
        s3.setGroup("INT22042");
        StudentManagement may=new StudentManagement();
        System.out.println( may.sameGroup(s1, s2));
        System.out.println(may.sameGroup(s2,s3));

    }
}
