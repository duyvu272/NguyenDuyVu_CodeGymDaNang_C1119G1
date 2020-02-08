package models;

public class Room extends Services {
    private String otherFreeService;

    public Room(String id, String nameService, double area, double cost, int amountPeople, String typeRent, String otherFreeService) {
        super(id, nameService, area, cost, amountPeople, typeRent);
        this.otherFreeService = otherFreeService;
    }

    public Room() {
    }

    public String getOtherFreeService() {
        return otherFreeService;
    }

    public void setOtherFreeService(String otherFreeService) {
        this.otherFreeService = otherFreeService;
    }

    @Override
    public String showInfor() {
        return "Room{" +
                "Name Service :" + getNameService() +
                "Area :" + getArea() + "m2" +
                "Cost :" + getCost() + "USD" +
                "Amount of People :" + getAmountPeople() +
                "Type of Rent :" + getTypeRent() +
                "Other free Service :" + getOtherFreeService() +
                '}';
    }

}

