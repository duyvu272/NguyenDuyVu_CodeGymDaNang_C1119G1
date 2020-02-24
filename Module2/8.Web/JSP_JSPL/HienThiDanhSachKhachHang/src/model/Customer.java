package model;


import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String ten ;
    private String ngaysinh;
    private String diachi;
    private String image ;
    private static List<Customer> list;
    static {
        list = new ArrayList<>();
        list.add(new Customer("GoKu","25/10/1998","Ho Chi Minh","/image/goku.jpg"));
        list.add(new Customer("GoHan","13/10/1998","Ho Chi Minh","/image/goku.jpg"));
        list.add(new Customer("Cadic","25/06/1998","Ho Chi Minh","/image/goku.jpg"));
        list.add(new Customer("GoTen","25/05/1995","Ho Chi Minh","/image/goku.jpg"));
    }

    public static List<Customer> getList() {
        return list;
    }

    public static void setList(List<Customer> list) {
        Customer.list = list;
    }

    public Customer(String ten, String ngaysinh, String diachi, String image) {
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.image = image;
    }

    public Customer() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

