package device;

import controller.GameController;

public class Computer extends Device {
    GameController gameController;

    public Computer(String deviceName) {
        super(deviceName);
    }

    @Override
    public void addController(GameController gameController) {
        this.gameController = gameController;
        System.out.println("Controller başarıyla bağlandı.");
    }

}
