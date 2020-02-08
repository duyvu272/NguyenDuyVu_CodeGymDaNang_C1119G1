package models;

public class House extends Services {
    private String typeOfRoom;
    private String otherFacility;
    private int floor;

    public House(String id, String nameService, double area, double cost, int amountPeople, String typeRent, String typeOfRoom, String otherFacility, int floor) {
        super(id, nameService, area, cost, amountPeople, typeRent);
        this.typeOfRoom = typeOfRoom;
        this.otherFacility = otherFacility;
        this.floor = floor;
    }

    public House() {
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

    @Override
    public String showInfor() {
        return "House{" +
                "Name Service :" + getNameService()+
                "Area :" + getArea()+"m2"+
                "Cost :" + getCost()+"USD"+
                "Amount of People :" +getAmountPeople()+
                "Type of Rent :"+getTypeRent()+
                "Type of Room :"+getTypeOfRoom()+
                "Other Facility :"+getOtherFacility()+
                "Floor :"+getFloor()+
                '}';
    }

}
