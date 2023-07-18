public class PhoneApp {
    double totalPrice = 0.0;

//  SmartPhone türündeki arrayin oluşturulması ve elemanlarının diziye eklenmesi
    SmartPhone[] smartPhones = new SmartPhone[]{
            new SmartPhone("iPhone X", 1, 20000, "IMEI1", 64, 2, "Geniş"),
            new SmartPhone("iPhone 11", 2, 30000, "IMEI2", 128, 2, "Geniş"),
            new SmartPhone("iPhone 12", 3, 35000, "IMEI3", 64, 2, "Ultra Geniş"),
            new SmartPhone("iPhone 13", 4, 40000, "IMEI4", 256, 2, "Ultra Geniş"),
            new SmartPhone("iPhone 14", 5, 50000, "IMEI5", 512, 2, "Ultra Geniş")};

//  Telefonların toplam fiyatını hesaplayan fonksiyonun oluşturulması
    double calculateTotalPrice(SmartPhone[] smartPhones) {
        for (SmartPhone smartPhone : smartPhones) {
            totalPrice += smartPhone.price;

        }
        return totalPrice;
    }

}

