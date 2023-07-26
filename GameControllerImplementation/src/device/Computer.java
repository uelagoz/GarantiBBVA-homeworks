package device;

import controller.GameController;

public class Computer extends Device {
    GameController gameController;

    public Computer(String deviceName) {
        super(deviceName);
    }

    //Computer için iki controller da uygun olduğundan GameController interface'ini implemente etmiş herhangi bir controller alabiliyor.
    @Override
    public boolean addController(GameController gameController) {
        this.gameController = gameController;
        System.out.println("Controller başarıyla bağlandı.");
        return true;
    }

}
