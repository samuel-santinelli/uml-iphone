package samuel_santinelli.demo.main;

import samuel_santinelli.demo.controller.IphoneController;
import samuel_santinelli.demo.view.IphoneView;

public class IphoneApp {
    public static void main(String[] args) {
        IphoneView view = new IphoneView();
        IphoneController controller = new IphoneController(view);

        // Usando o MediaPlayer
        controller.play();
        controller.pause();
        controller.stop();

        // Usando o Phone
        controller.makeCall("123-456-7890");
        controller.endCall();

        // Usando o WebBrowser
        controller.openPage("www.example.com");
        controller.refreshPage();
        controller.closePage();

        // Informações adicionais
        controller.showInfo();
    }
}
