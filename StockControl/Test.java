package StockControl;

public class Test {
    public static void main(String[] args) {
        Material x = new Material("Chocolate", 5.99, 20);
        x.printInfo();
        x.reduceStock(22);
        System.out.println(x.getStock());
        System.out.println("----");
        x.printInfo();
    }
}


