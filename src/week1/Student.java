package week1;

public class Student {

    private String name;
    private String email;
    private String id;
    private String group;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    // TODO: khai báo các thuộc tính cho Student

    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        this.name=name;
        this.id=id;
        this.email=email;
        this.group=group;
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        this.name=n;
        this.id=sid;
        this.email=em;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.name=s.name;
        this.id=s.id;
        this.group=s.group;
        this.email=s.email;
    }

    void  getInfo() {
        // TODO:
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println(getId());
        System.out.println(getGroup());

        //return null; // xóa dòng này sau khi cài đặt
    }
}
