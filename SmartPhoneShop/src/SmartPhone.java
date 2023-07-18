public class SmartPhone extends Phone {
    int storage;
    int ram;
    String camera;

//  noArgsConstructor
    SmartPhone() {

    }

//  allArgsConstructor
    SmartPhone(String name, int id, double price, String phoneNumber, int storage, int ram, String camera) {
        super(name, id, price, phoneNumber);
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }
}
