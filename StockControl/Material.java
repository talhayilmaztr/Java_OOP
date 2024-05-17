package StockControl;

public class Material {
    
    private int productionNo;
    private String name;
    private Double price;
    private int stock;

    public Material(String name, Double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void reduceStock (int amount){
        if (stock - amount > 0) {
            stock -= amount;
        }else
              System.out.println("Insufficient stock");
        
    }public void printInfo(){
          
        System.out.println("Material Production No:" + this.productionNo + "\n" +
                            "Material Name:" + this.name + "\n" +
                            "Material Price:" + this.price + "\n" +
                            "Material Stock:" + this.stock);
    }

}
