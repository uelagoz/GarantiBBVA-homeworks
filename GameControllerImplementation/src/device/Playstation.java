package device;

import controller.GameController;
import controller.PlaystationController;

public class Playstation extends Device {
    PlaystationController playstationController;

    //Playstation için sadece PlaystationController tipinde olan bir Controller kabul edilir.
    @Override
    public void addController(GameController gameController) {
        //instanceof yardımı ile verilmiş gameController'ın tipinin PlaystationController olup olmadığı kontrol edilir.
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
