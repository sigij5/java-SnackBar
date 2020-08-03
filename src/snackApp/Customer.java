package snackApp;


public class Customer {
    private static int maxId = 0;

    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand){
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getCashOnHand(){
        return cashOnHand;
    }

    public void setName(String name){
        this.name = name;
    }
    public void addCash(double amount){
        this.cashOnHand = cashOnHand + amount;
    }
    public void buySnack(double cost){
        this.cashOnHand = cashOnHand - cost;
    }

    public String cusCash(){
        return "Customer " + id + " " + "cash on hand " + cashOnHand;
    }
}