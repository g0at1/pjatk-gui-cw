package c03.e01;

public abstract class ShoppingCart {

    public abstract void addProduct(Product product);

    public abstract void removeProduct(Product product);
    public abstract double getTotalPrice();
}
