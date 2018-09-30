package es.upm.miw.iwvg.adoo.views;

import es.upm.miw.iwvg.adoo.controllers.IOController;

import es.upm.miw.iwvg.adoo.utils.Constants;

public class GameViewReader {

    private IOController ioController;

    public GameViewReader (IOController ioController) {
        this.ioController = ioController;
    }

    public int readPlayMode() {
        int option = Constants.DEFAULT_PLAY_MODE;
        boolean ok = false;
        do {
            option = ioController.readInt(Constants.OPTION.toString());
            ok = (option > 0 && option <= Constants.NUMBER_OF_PLAY_MODES);
            System.out.println("ok es: " +  ok);
        } while (!ok);
        return option;
    }
}
