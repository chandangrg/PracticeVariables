package practiceVariable;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void calculateDiscount(double discountPercent) {
        double discountAmount = (price * discountPercent) / 100; // local variable
        double discountedPrice = price - discountAmount;          // local variable
        System.out.println(name + " original price: $" + price);
        System.out.println("Discounted price: $" + discountedPrice);
    }

    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 1000);
        p1.calculateDiscount(10);
    }
}