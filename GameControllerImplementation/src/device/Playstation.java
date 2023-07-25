package device;

import controller.GameController;
import controller.PlaystationController;

public class Playstation extends Device {
    PlaystationController playstationController;

    @Override
    public void addController(GameController gameController) {

        if (!(gameController instanceof PlaystationController)) {
            System.out.println("Playstation'a sadece Playstation Controller bağlanabilir.");
            return;
        }
        System.out.println("Controller başarıyla bağlandı.");
        playstationController = (PlaystationController) gameController;

    }

    public Playstation(String deviceName) {
        super(deviceName);
    }


}
