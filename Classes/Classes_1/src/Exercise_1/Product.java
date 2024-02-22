package Exercise_1;

public class Product {

    private double price;
    private int amount;
    private String name;

    public Product(String name, double price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public double getPrice(){
        return this.price;
    }

    public int getAmount(){
        return this.amount;
    }

    public String name(){
        return this.name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public void setName(String name){
        this.name = name;
    }

    public void printProduct(){
        System.out.println(this.name + ", price " + String.format("%.2f", this.price)  + ", amount " + this.amount);
    }

}
