public class Phone extends Product {
    String phoneNumber;

//  noArgsConstructor
    public Phone() {
    }

//  allArgsConstructor
    Phone(String name, int id, double price, String phoneNumber) {
        super(name, id, price);
        this.phoneNumber = phoneNumber;
    }
}
