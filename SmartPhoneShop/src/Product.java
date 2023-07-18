public class Product {
    String name;
    int id;
    double price;

//  noArgsConstructor
    public Product() {
    }

//  allArgsConstructor
    Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;

    }
}
