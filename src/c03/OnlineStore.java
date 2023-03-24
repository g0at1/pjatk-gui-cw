package c03;

public class OnlineStore extends ShoppingCart {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();

        Product book = new Book("The Catcher in the Rye", 10.99);

        Product shirt = new Clothing("Blue Shirt", 25.99);

        Product phone = new Electronics("iPhone 12", 999.99);

        store.addProduct(book);
        store.addProduct(shirt);
        store.addProduct(phone);

        System.out.println("Total price: " + store.getTotalPrice());

        store.removeProduct(shirt);

        System.out.println("Total price: " + store.getTotalPrice());

    }

    private Product[] products = new Product[20];
    private int productCounter = 0;

    @Override
    public void addProduct(Product product) {
        if (productCounter < products.length)
            products[productCounter++] = product;
        else
            System.out.println("Pełny koszyk");

    }

    @Override
    public void removeProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == product) {
                products[i] = null;
            }
        }
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : products) {
            if (product != null)
                totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
