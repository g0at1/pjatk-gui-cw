package c07.e02;

public
    class Purchase {

    private String name;
    private double price;

    public Purchase(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
