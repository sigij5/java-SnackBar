package snackApp;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingId;

    public Snack(String name, int quantity, double cost, int vendingId){
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingId = vendingId;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getCost(){
        return cost;
    }
    public int getVendingId(){
        return vendingId;
    }
    public double getTotalCost(int amount){
        return cost * amount;
    }

    public void setName(String name){
        this.name = name;
    }
    public void addQuantity(int amount){
        this.quantity = quantity + amount;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public void setVendingId(int vendingId){
        this.vendingId = vendingId;
    }
    public void buySnack(int amount){
        this.quantity = quantity - amount;
    }
    // public void getTotalCost(int amount){
    //     totalCost
    // }
    public String snackQuantity(){
        return "Quantity " + "of snack " + id + " " + "is " + quantity;
    }
}