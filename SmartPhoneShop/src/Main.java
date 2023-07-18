public class Main {
    public static void main(String[] args) {

//      PhoneApp türünde nesne oluşturulması ve fonksiyonun çağırılması
        PhoneApp phoneApp = new PhoneApp();
        double result = phoneApp.calculateTotalPrice(phoneApp.smartPhones);

        System.out.println("Toplam fiyat: " + result);

    }
}