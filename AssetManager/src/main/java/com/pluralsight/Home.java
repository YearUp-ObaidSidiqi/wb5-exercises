package com.pluralsight;

public class Home extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public Home(){
    }
    public Home(String description, String dataAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dataAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getCondition() {
        return condition;
    }
    public void setCondition(int condition) {
        this.condition = condition;
    }
    public int getSquareFoot() {
        return squareFoot;
    }
    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }
    public int getLotSize() {
        return lotSize;
    }
    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        /*switch (condition){
            case 1 -> System.out.println("Excellent condition");
            case 2 -> System.out.println("Good condition");
            case 3 -> System.out.println("Fair condition");
            case 4 -> System.out.println("Poor condition");
            default -> System.out.println("-ERROR!-");
        }*/
        double value =0;
        switch (condition){
            case 1 -> value =squareFoot*180;
            case 2 -> value =squareFoot*130;
            case 3 -> value =squareFoot*90;
            case 4 -> value =squareFoot*80;
            default -> System.out.println("-ERROR!-");
        }
        double lotValue = getLotSize()*.25;
        return (value +lotValue);
    }
    @Override
    public String toString() {
        return "Home         {" +
                "Description = '" + getDescription() + '\'' +
                ", Date Acquired = '" + getDateAcquired() + '\'' +
                ", Original Cost = $" + getOriginalCost() +
                ", Address = '" + address + '\'' +
                ", Square Footage = " + squareFoot + " sqft" +
                ", Lot Size = " + lotSize + " sqft" +
                ", Current Value = $" + getValue() +
                '}';
    }

    }

