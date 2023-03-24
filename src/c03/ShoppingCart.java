package c03;

public abstract class ShoppingCart {

    public abstract void addProduct(Product product);

    public abstract void removeProduct(Product product);
    public abstract double getTotalPrice();
}
