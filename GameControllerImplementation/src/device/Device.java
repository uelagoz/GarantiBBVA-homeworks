package device;

import controller.GameController;

/*Abstract class ile Xbox, Playstation ve Computer deviceları polymorphic hale getirildi. Implementasyonu aynı olan fonksiyonlar bu class içinde tanımlandı.
Implementasyonu farklı olanlar ise @Override edildi.*/

public abstract class Device {
    String deviceName;
    boolean isOpen = false; //Device'ın açık olup olmama durumunu tutar.

    public abstract boolean addController(GameController gameController);

    //Oyunu başlatma fonksiyonu burada tanımlandı. Device'ın açık olup olmadığı kontrol edildi.
    public void playGame(){
        if(!isOpen){
            System.out.println("Cihaz açık değil.");
            return;
        }
        System.out.println("Oyun başladı.");
    }

    //Constructor
    public Device(String deviceName) {
        this.deviceName = deviceName;
    }

    //Cihaz'ı başlatma fonksiyonu tanımlandı. Eğer cihaz zaten açık ise Exception fırlatıldı.
    public void startDevice() {
        if (isOpen) {
            try {
                throw new Exception(deviceName + " şu anda zaten açık!");
            }catch (Exception e){
                e.printStackTrace();
                System.exit(1);
            }
        } else {
            isOpen = true;
            System.out.println(deviceName + " açıldı.");
        }
    }

    //Cihaz'ı kapatma fonksiyonu tanımlandı. Eğer cihaz zaten kapalı ise Exception fırlatıldı.
    public void shutdownDevice() {
        if (!isOpen) {
            try {
                throw new Exception(deviceName + " şu anda zaten kapalı!");
            }catch (Exception e){
                e.printStackTrace();
                System.exit(1);
            }
        } else {
            isOpen = false;
            System.out.println(deviceName + " kapandı.");
        }
    }

}

