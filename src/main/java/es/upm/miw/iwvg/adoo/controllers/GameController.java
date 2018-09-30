package es.upm.miw.iwvg.adoo.controllers;

import es.upm.miw.iwvg.adoo.views.GameView;

import es.upm.miw.iwvg.adoo.models.ColorBallSet;

import es.upm.miw.iwvg.adoo.utils.Constants;

public class GameController {

    private IOController ioController;
    private BoardController boardController;
    private GameView gameView;
    private RepetitionController repetitionController;

    public GameController(IOController ioController, BoardController boardController) {
        this.ioController = ioController;
        this.boardController = boardController;
        this.gameView = new GameView(ioController);
    }

    public void writeResultColorBallSet(ColorBallSet colorBallSet) {
        assert (colorBallSet != null);
        gameView.writeResultConstants(boardController.getKilled(),
                boardController.getDamaged());
    }

    public void writeHiddenComputerPlayerSecretColorBallSet() {
        for (int i = 0; i < boardController.getPlainSecretBoardColorBallSet().length(); i++) {
            ioController.write(Constants.SECRET_CHAR.toString());
        }
        ioController.writeln();
    }

    public void writePlainComputerPlayerSecretColorBallSet() {
        ioController.writeln(
                String.format(Constants.SECRET_ANSWER.toString(),
                        boardController.getPlainSecretBoardColorBallSet()));
    }

    public boolean keepPlaying() {
        return this.repetitionController.keepRunning();
    }

    public boolean isWinner(ColorBallSet colorBallSet) {
        return boardController.isWinner(colorBallSet);
    }
}
