package es.upm.miw.iwvg.adoo.controllers;

import es.upm.miw.iwvg.adoo.models.Board;

public class BoardController {

    public Board board;

    public BoardController( IOController ioController) {

    }

    public String getPlainSecretBoardColorBallSet() {
       return "";
    }

    public void setSecretBoardColorBallSet() {
    }

    public boolean isWinner() {
        return true;
    }

    public int getKilled() {
       return 1;
    }

    public int getDamaged() {

        return 1;
    }
}
