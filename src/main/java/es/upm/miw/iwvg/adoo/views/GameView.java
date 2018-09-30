package es.upm.miw.iwvg.adoo.views;

import es.upm.miw.iwvg.adoo.controllers.IOController;

import es.upm.miw.iwvg.adoo.utils.Constants;

public class GameView {

    private IOController ioController;

    public GameView(IOController ioController) {

        this.ioController = ioController;
    }

    public void writeResultConstants(int killed, int damaged) {
        ioController.writeln(this.getKilledConstants(killed) + this.getDamagedConstants(damaged));
    }

    private String getKilledConstants(int killed) {
        return String.format(Constants.DEAD.toString(), killed);
    }

    private String getDamagedConstants(int damaged) {
        return String.format(Constants.DAMAGED.toString(), damaged);
    }





}
