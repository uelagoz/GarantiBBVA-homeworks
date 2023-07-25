package device;

import controller.GameController;
import controller.XboxController;

public class Xbox extends Device {
    XboxController xboxController;

    @Override
    public void addController(GameController gameController) {

        if (!(gameController instanceof XboxController)) {
            System.out.println("Xbox'a sadece Xbox Controller bağlanabilir.");
            return;
        }
        System.out.println("Controller başarıyla bağlandı.");
        xboxController = (XboxController) gameController;
    }

    public Xbox(String deviceName) {
        super(deviceName);

    }

}
