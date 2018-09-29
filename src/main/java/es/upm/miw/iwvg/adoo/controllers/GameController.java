package es.upm.miw.iwvg.adoo.controllers;

public class GameController {

    private IOController ioController;
    private BoardController boardController;

    public GameController(IOController ioController ){
        this.ioController = ioController;
        this.boardController = boardController;
    }

    public void writeResultCombination() {

    }

    public void writeHiddenComputerPlayerSecretCombination() {

    }

    public void writePlainComputerPlayerSecretCombination() {

    }

    public boolean keepPlaying() {
       return true;
    }

    public boolean isVictory() {
        return true;
    }
}
