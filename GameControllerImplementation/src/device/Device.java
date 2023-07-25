package device;

import controller.GameController;

public abstract class Device {
    String deviceName;
    boolean isOpen = false;

    public abstract void addController(GameController gameController);

    public void playGame(){
        if(!isOpen){
            System.out.println("Cihaz açık değil.");
            return;
        }
        System.out.println("Oyun başladı.");
    }

    public Device(String deviceName) {
        this.deviceName = deviceName;
    }

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

