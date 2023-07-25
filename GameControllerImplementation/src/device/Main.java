package device;

public class Main {
    public static void main(String[] args) {

        //DeviceService nesnesi oluşturularak, gerekli fonksiyonlar çağırılır.
        DeviceService deviceService = new DeviceService();
        deviceService.choosingDevice();
        deviceService.startDevice();
        deviceService.choosingController();
        deviceService.playGame();

    }

}