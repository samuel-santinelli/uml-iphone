package samuel_santinelli.demo.controller;

import samuel_santinelli.demo.model.MediaPlayer;
import samuel_santinelli.demo.model.Phone;
import samuel_santinelli.demo.model.WebBrowser;
import samuel_santinelli.demo.view.IphoneView;

// Classe iPhone que implementa todas as interfaces
public class IphoneController implements MediaPlayer, Phone, WebBrowser {
    private IphoneView view;

    public IphoneController(IphoneView view) {
        this.view = view;
    }

    // Implementação dos métodos da interface MediaPlayer
    @Override
    public void play() {
        view.displayMessage("Playing music...");
    }

    @Override
    public void pause() {
        view.displayMessage("Pausing music...");
    }

    @Override
    public void stop() {
        view.displayMessage("Stopping music...");
    }

    // Implementação dos métodos da interface Phone
    @Override
    public void makeCall(String number) {
        view.displayMessage("Calling " + number + "...");
    }

    @Override
    public void endCall() {
        view.displayMessage("Ending call...");
    }

    // Implementação dos métodos da interface WebBrowser
    @Override
    public void openPage(String url) {
        view.displayMessage("Opening page " + url + "...");
    }

    @Override
    public void refreshPage() {
        view.displayMessage("Refreshing page...");
    }

    @Override
    public void closePage() {
        view.displayMessage("Closing page...");
    }

    // Métodos adicionais específicos do iPhone
    public void showInfo() {
        view.displayMessage("This is an iPhone with multiple functionalities.");
    }
}