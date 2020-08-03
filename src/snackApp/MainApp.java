package snackApp;

public class MainApp {
    private static void workWithData(){
        System.out.println("Welcome to the Snack Bar App!");

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");


        //String name, int quantity, double cost, int vendingId
        Snack s1 = new Snack("Chips", 36, 1.75, v1.id);
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.id);
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.id);
        Snack s4 = new Snack("Soda", 24, 2.50, v2.id);
        Snack s5 = new Snack("Water", 20, 2.75, v2.id);

        c1.buySnack(s4.getTotalCost(3));
        s4.buySnack(3);
        System.out.println(c1.cusCash());
        System.out.println(s4.snackQuantity());

        System.out.println(" ");

        c1.buySnack(s3.getTotalCost(1));
        s3.buySnack(1);
        System.out.println(c1.cusCash());
        System.out.println(s3.snackQuantity());

        System.out.println(" ");

        c2.buySnack(s4.getTotalCost(2));
        s4.buySnack(2);
        System.out.println(c2.cusCash());
        System.out.println(s4.snackQuantity());

        System.out.println(" ");

        c1.addCash(10.00);
        System.out.println(c1.cusCash());

        System.out.println(" ");

        c1.buySnack(s2.getTotalCost(1));
        s2.buySnack(1);
        System.out.println(c1.cusCash());
        System.out.println(s2.snackQuantity());

        System.out.println(" ");

        s3.addQuantity(12);
        System.out.println(s3.snackQuantity());

        System.out.println(" ");

        c2.buySnack(s3.getTotalCost(3));
        s3.buySnack(3);
        System.out.println(c2.cusCash());
        System.out.println(s3.snackQuantity());

    }

    public static void main(String[] args){
        workWithData();
    }
}