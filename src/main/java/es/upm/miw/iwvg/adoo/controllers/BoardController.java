package es.upm.miw.iwvg.adoo.controllers;

import es.upm.miw.iwvg.adoo.models.Board;

import es.upm.miw.iwvg.adoo.models.ColorBallSet;

public class BoardController {

    public Board board;

    public BoardController( IOController ioController, String COLORBALLSET_MASTER) {
        this.board = new Board(new RandomSecretColorSetGenerator( ioController, COLORBALLSET_MASTER));
    }

    public boolean isWinner(ColorBallSet colorBallSet) {
        return board.matchesWithSecretColorBallSet(colorBallSet);
    }

    public void setSecretBoardColorBallSet() {
        board.setSecretBoardColorBallSet();
    }

    public String getPlainSecretBoardColorBallSet() {
        return board.getSecretBoardColorBallSet().toString();
    }

    public int getDamaged(ColorBallSet colorBallSet) {
        assert (colorBallSet != null);
        return board.getDamaged(colorBallSet);
    }

    public int getKilled(ColorBallSet colorBallSet) {
        assert (colorBallSet != null);
        return board.getKilled(colorBallSet);
    }
}
