package models;

public class Villa extends Services {
    private String typeOfRoom;
    private String otherFacility;
    private int floor;
    private double areaPool;

    public Villa(String nameService, double area, double cost, int amountPeople, String typeRent, String typeOfRoom, String otherFacility, int floor, double areaPool) {
        super(nameService, area, cost, amountPeople, typeRent);
        this.typeOfRoom = typeOfRoom;
        this.otherFacility = otherFacility;
        this.floor = floor;
        this.areaPool = areaPool;
    }

    public Villa(String id, String nameService, double area, double cost, int amountPeople, String typeRent, String typeOfRoom, String otherFacility, int floor, double areaPool) {
        super(id, nameService, area, cost, amountPeople, typeRent);
        this.typeOfRoom = typeOfRoom;
        this.otherFacility = otherFacility;
        this.floor = floor;
        this.areaPool = areaPool;
    }

    public Villa() {
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public String getOtherFacility() {
        return otherFacility;
    }

    public void setOtherFacility(String otherFacility) {
        this.otherFacility = otherFacility;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public Villa(String id, String nameService, double area, double cost, int amountPeople, String typeRent, String typeOfRoom, String otherFacility, int floor, String typeOfRoom1, String otherFacility1, int floor1, double areaPool) {
        super(id, nameService, area, cost, amountPeople, typeRent);
        this.typeOfRoom = typeOfRoom1;
        this.otherFacility = otherFacility1;
        this.floor = floor1;
        this.areaPool = areaPool;
    }

    @Override
    public String showInfor() {
        return "Villa{" +
                "Id : " + super.getId()+
                "Name Service :" + super.getNameService()+
                "Area :" + super.getArea()+"m2"+
                "Cost :" + super.getCost()+ "USD"+
                "Amount of People :" +super.getAmountPeople()+
                "Type of Rent :"+super.getTypeRent()+
                "Type of Room :"+getTypeOfRoom()+
                "Other Facility :"+getOtherFacility()+
                "Floor :"+getFloor()+
                "Area of Pool : "+getAreaPool()+
                '}';

    }


}
