package es.upm.miw.iwvg.adoo.models;

import java.util.ArrayList;

import java.util.List;

import es.upm.miw.iwvg.adoo.utils.Color;

import es.upm.miw.iwvg.adoo.controllers.ColorSetGeneratorController;

import es.upm.miw.iwvg.adoo.utils.Constants;

public class Board {

    private ColorSetGeneratorController colorSetGeneratorController;

    private ColorBallSet colorBallSet;

    private int[] killedDamaged = new int[2];

    public Board(ColorSetGeneratorController colorSetGeneratorController) {
        assert colorSetGeneratorController != null;
        this.colorBallSet = null;
        this.colorSetGeneratorController = colorSetGeneratorController;
    }

    public void setSecretBoardColorBallSet() {
        this.colorBallSet = colorSetGeneratorController.generateColorBallSet();
    }

    public ColorBallSet getSecretBoardColorBallSet() {
        return this.colorBallSet;
    }

    public boolean matchesWithSecretColorBallSet(ColorBallSet colorBallSetCompare) {
        assert (colorBallSetCompare != null);
        return colorBallSet.equals(colorBallSetCompare);
    }

    public int getKilled(ColorBallSet colorBallSet) {
        calculateResultColorBallSet(colorBallSet);
        return killedDamaged[0];
    }

    public int getDamaged(ColorBallSet colorBallSet) {
        calculateResultColorBallSet(colorBallSet);
        return killedDamaged[1];
    }

    public int getNumRound(int numRound){
        return numRound;
    }

    private void calculateResultColorBallSet(ColorBallSet colorBallSet) {
        assert (colorBallSet != null);
        int damaged = 0;
        int killed = 0;
        List<Color> colorTested = new ArrayList<Color>();
        for (int i = 0; i < Constants.NUMBER_BALL_GUESS; i++) {
            Color color = colorBallSet.getColorAtPosition(i);
            if (this.colorBallSet .equalsColorAtPosition(color, i)) {
                killed++;
            } else {
                if (colorBallSet.containsColor(color) && !colorTested.contains(color)) {
                    damaged++;
                }
                colorTested.add(color);
            }
        }
        this.killedDamaged[0] = killed;
        this.killedDamaged[1] = damaged;
    }

    @Override
    public String toString() {
        if (this.colorBallSet  != null) {
            return this.colorBallSet.toString();
        } else {
            return super.toString();
        }
    }
}