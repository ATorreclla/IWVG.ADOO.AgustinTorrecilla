package es.upm.miw.iwvg.adoo.controllers;

import es.upm.miw.iwvg.adoo.models.Board;
import es.upm.miw.iwvg.adoo.models.ColorBallSet;

public class BoardController {

    public Board board;

    public BoardController( IOController ioController) {

    }
    public boolean isWinner(ColorBallSet colorBallSet) {
        return true;
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
