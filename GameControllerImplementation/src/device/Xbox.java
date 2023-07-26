package device;

import controller.GameController;
import controller.XboxController;

public class Xbox extends Device {
    XboxController xboxController;

    //Xbox için sadece XboxController tipinde olan bir Controller kabul edilir.
    @Override
    public boolean addController(GameController gameController) {
        //instanceof yardımı ile verilmiş gameController'ın tipinin XboxController olup olmadığı kontrol edilir.
        if (!(gameController instanceof XboxController)) {
            System.out.println("Xbox'a sadece Xbox Controller bağlanabilir.");
            return false;
        }
        System.out.println("Controller başarıyla bağlandı.");
        xboxController = (XboxController) gameController;
        return true;
    }

    public Xbox(String deviceName) {
        super(deviceName);

    }

}
