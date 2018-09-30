package es.upm.miw.iwvg.adoo.models;

import es.upm.miw.iwvg.adoo.controllers.ColorController;

public class Board {

    private ColorBallSet colorBallSet;

    private int[] killedDamaged = new int[2];

    public Board(ColorController colorSetGeneratorController) {
        assert colorSetGeneratorController != null;
        this.colorBallSet = null;
    }

    public void setSecretBoardColorBallSet() {
    }

    public ColorBallSet getSecretBoardColorBallSet() {
        return this.colorBallSet;
    }

    public boolean matchesWithSecretColorBallSet(ColorBallSet colorBallSet) {
        assert (colorBallSet != null);
        return colorBallSet.equals(colorBallSet);
    }

    public int getKilled(ColorBallSet combination) {
        calculateResultCombination(combination);
        return killedDamaged[0];
    }

    public int getDamaged(ColorBallSet combination) {
        calculateResultCombination(combination);
        return killedDamaged[1];
    }

    public int getNumRound(int numRound){
        return numRound;
    }

    private void calculateResultCombination(ColorBallSet colorBallSet) {
        assert (colorBallSet != null);

        int damaged = 0;
        int killed = 0;

        this.killedDamaged[0] = killed;
        this.killedDamaged[1] = damaged;
    }
}
