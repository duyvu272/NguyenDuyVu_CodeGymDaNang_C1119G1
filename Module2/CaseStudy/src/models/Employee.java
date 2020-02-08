package models;

public class Employee {
    private String id;
    private String nameEmp;
    private int age;
    private String address;

    public Employee(String id, String nameEmp, int age, String address) {
        this.id = id;
        this.nameEmp = nameEmp;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getNameEmp() {
        return nameEmp;
    }

    public void setNameEmp(String nameEmp) {
        this.nameEmp = nameEmp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", nameEmp='" + nameEmp + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
