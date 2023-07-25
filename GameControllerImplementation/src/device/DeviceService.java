package device;

import controller.PlaystationController;
import controller.XboxController;

import java.util.Scanner;

public class DeviceService {
    Scanner scanner = new Scanner(System.in);
    int input;
    Device device;

    //Cihaz seçimi fonksiyonu tanımlandı. Seçime göre Divice türündeki nesneler oluşturuldu.
    public void choosingDevice() {
        System.out.println("Cihaz Seçiniz \n 1-Computer \n 2-Playstation \n 3-Xbox");
        int input = scanner.nextInt();
        while (true) if (input == 1) {
            System.out.println("Computer seçildi.");
            device = new Computer("Computer");
            break;
        } else if (input == 2) {
            System.out.println("Playstation seçildi.");
            device = new Playstation("Playstation");
            break;
        } else if (input == 3) {
            System.out.println("Xbox seçildi.");
            device = new Xbox("Xbox");
            break;
        } else {
            System.out.println("Hatalı giriş yaptınız.");
        }
    }

    //Kullanıcıdan alınan inputa göre önceden seçmiş olduğu Device açılır veya kapanır.
    public void startDevice() {
        while (true) {
            System.out.println("1-Cihazı Aç \n2-Cihazı Kapat");
            input = scanner.nextInt();
            if (input == 1) {
                device.startDevice();
                break;
            } else if (input == 2) {
                device.shutdownDevice();
                break;
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        }
    }

    //Kullanıcı seçtiği Device'ta kullanmak üzere bir Controller seçer.
    public void choosingController() {
        while(true){
            System.out.println("Controller seçiniz: \n1-Playstation Controller \n2-Xbox Controller");
            input = scanner.nextInt();
            if(input == 1){
                device.addController(new PlaystationController());
                break;
            }else if(input == 2){
                device.addController(new XboxController());
                break;
            }else{
                System.out.println("Hatalı giriş yaptınız.");
            }
        }
    }

    //Oyun başlatılır.
    public void playGame(){
        device.playGame();
    }

}
