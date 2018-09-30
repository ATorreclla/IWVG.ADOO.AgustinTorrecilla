package es.upm.miw.iwvg.adoo.controllers;

import es.upm.miw.iwvg.adoo.models.ColorBallSet;

import es.upm.miw.iwvg.adoo.utils.Constants;

import es.upm.miw.iwvg.adoo.views.GameViewCommentary;

import es.upm.miw.iwvg.adoo.views.GameViewReader;


public class Game {

    private IOController ioController;
    private BoardController boardController;
    private RepetitionController continueController;
    private PlayerController[] players;
    private String patternPlay;
    private GameController gameController;
    private GameViewCommentary gameViewComment;
    private GameViewReader gameViewReader;

    public Game(){
        this.ioController = new IOTerminalController();
        this.patternPlay = String.format(Constants.PATTERN_PLAY, Constants.NUMBER_BALL_GUESS);
        this.players = new PlayerController[Constants.NUMBER_OF_PLAYERS];
        this.gameController = new GameController(ioController, boardController);
        this.gameViewComment = new GameViewCommentary(ioController);
        this.gameViewReader = new GameViewReader(ioController);
    }

    public void play() {
        gameViewComment.writeWellcomeConstants();
        setPlayers(gameViewReader.readPlayMode());
        setContinueController();
        setSecretBoardColorBallSet();
        gameController.writeHiddenComputerPlayerSecretColorBallSet();
        int numberOfRounds = 0;
        boolean winner = false;
        ColorBallSet playerColorBallSet = null;
        do {
            playerColorBallSet = players[1].generateColorBallSet();
            winner = isWinner(playerColorBallSet);
            if (!winner) {
                numberOfRounds++;
                gameController.writeResultColorBallSet(playerColorBallSet);
            } else {
                gameViewComment.writeWinner();
            }
        } while (numberOfRounds < Constants.NUMBER_OF_PLAYS && !winner);

        if (numberOfRounds == Constants.NUMBER_OF_PLAYS) {
            gameViewComment.writeNoMoreRoundsConstants();
            gameController.writePlainComputerPlayerSecretColorBallSet();
        }
    }

    private void setPlayers(int playMode) {
    }

    public boolean isWinner(ColorBallSet colorBallSet) {
        return boardController.isWinner(colorBallSet);
    }

    public boolean keepRunning() {
        return this.continueController.keepRunning();
    }

    private void setSecretBoardColorBallSet () {
        boardController.setSecretBoardColorBallSet();
    }

    private void setContinueController() {
        this.continueController = new GenericContinueController(this.ioController);
    }
}