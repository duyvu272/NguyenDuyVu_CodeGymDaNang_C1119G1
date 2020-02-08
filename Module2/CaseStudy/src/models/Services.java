package models;



public abstract class Services implements Comparable<Services> {
    private String id;
    private String nameService;
    private double area;
    private double cost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private int amountPeople;
    private String typeRent;


    public Services(String id, String nameService, double area, double cost, int amountPeople, String typeRent) {
        this.id = id;
        this.nameService = nameService;
        this.area = area;
        this.cost = cost;
        this.amountPeople = amountPeople;
        this.typeRent = typeRent;
    }

    public Services(String nameService, double area, double cost, int amountPeople, String typeRent) {
        this.nameService = nameService;
        this.area = area;
        this.cost = cost;
        this.amountPeople = amountPeople;
        this.typeRent = typeRent;
    }

    public Services() {
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAmountPeople() {
        return amountPeople;
    }

    public void setAmountPeople(int amountPeople) {
        this.amountPeople = amountPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public abstract String showInfor();

    @Override
    public int compareTo(Services services) {
        return nameService.compareTo(services.getNameService());
    }
}
