package es.upm.miw.iwvg.adoo.views;

import es.upm.miw.iwvg.adoo.controllers.IOController;

import es.upm.miw.iwvg.adoo.utils.Constants;

public class GameViewComentary {

    private IOController ioController;

    public GameViewComentary(IOController ioController){
        this.ioController = ioController;
    }

    public void writeNoMoreRoundsConstants() {
        ioController.writeln(Constants.CONTINUE.toString());
    }

    public void writeWellcomeConstants() {
        ioController.writeln(Constants.TITTLE.toString());
        ioController.writeln(Constants.PLAY_HUMAN.toString());
        ioController.writeln(Constants.PLAY_COMPUTER.toString());
    }

    public void writeWinner() {
        ioController.writeln(String.format(Constants.WINNER.toString(),
                Constants.NUMBER_BALL_GUESS));
    }
}
