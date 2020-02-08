package models;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Customer implements Comparable<Customer> {
    private String name;
    private Date birthOfDay;
    private String gender;
    private String id;
    private String phone;
    private String email;
    private String memberShip;
    private String address;
    private Services services;
    private String idService;

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public Customer(String name, Date birthOfDay, String gender, String id, String phone, String email, String memberShip, String address, Services services) {
        this.name = name;
        this.birthOfDay = birthOfDay;
        this.gender = gender;
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.memberShip = memberShip;
        this.address = address;
        this.services = services;
    }


    public Customer(String name, Date birthOfDay, String gender, String id, String phone, String email, String memberShip, String address, String idService) {
        this.name = name;
        this.birthOfDay = birthOfDay;
        this.gender = gender;
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.memberShip = memberShip;
        this.address = address;
        this.idService = idService;
    }

    public Customer(String name, Date birthOfDay, String gender, String id, String phone, String email, String memberShip, String address) {
        this.name = name;
        this.birthOfDay = birthOfDay;
        this.gender = gender;
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.memberShip = memberShip;
        this.address = address;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthOfDay() {
        return birthOfDay;
    }

    public void setBirthOfDay(Date birthOfDay) {
        this.birthOfDay = birthOfDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMemberShip() {
        return memberShip;
    }

    public void setMemberShip(String memberShip) {
        this.memberShip = memberShip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }


    public String showInfo() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(birthOfDay);
        return "Customer{" +
                "name='" + name + '\'' +
                ", birthOfDay=" + strDate +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", memberShip='" + memberShip + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String showInfoBook() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(birthOfDay);
        return "Customer{" +
                "name='" + name + '\'' +
                ", birthOfDay=" + strDate +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", memberShip='" + memberShip + '\'' +
                ", address='" + address + '\'' +
                ", id services=" + idService +
                '}';
    }


    @Override
    public int compareTo(Customer customer) {
        LocalDate date1 = birthOfDay.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate date2 = customer.getBirthOfDay().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        if (name.compareTo(customer.getName()) == 0) {
            if (date1.getYear() == date2.getYear())
                return 0;
            else if (date1.getYear() > date2.getYear())
                return 1;
            else
                return -1;
        } else
            return name.compareTo(customer.getName());

    }
}
