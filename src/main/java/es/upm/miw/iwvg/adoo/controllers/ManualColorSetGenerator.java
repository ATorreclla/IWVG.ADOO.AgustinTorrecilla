package es.upm.miw.iwvg.adoo.controllers;

import java.util.List;

import java.util.ArrayList;

import es.upm.miw.iwvg.adoo.models.ColorBallSet;

import es.upm.miw.iwvg.adoo.utils.Constants;

import es.upm.miw.iwvg.adoo.utils.Color;

public class ManualColorSetGenerator extends ColorSetGeneratorController {

    public ManualColorSetGenerator(IOController ioController, String patternShow) {
        super(ioController, patternShow);
    }

    @Override
    public ColorBallSet generateColorBallSet() {
        String colorBallSet = "";
        boolean ok = false;
        do {
            colorBallSet = ioController
                    .readString(String.format(Constants.READ_PLAY.toString(), Constants.NUMBER_BALL_GUESS))
                    .toUpperCase();
            ok = isCorrectPlayerPlaySet(colorBallSet);
        } while (!ok);
        return new ColorBallSet(getListOfColors(colorBallSet));
    }

    private List<Color> getListOfColors(String colorBallSet) {
        List<Color> colors = new ArrayList<Color>();
        colors.clear();
        for (int i = 0; i < colorBallSet.length(); i++) {
            Color color = Color.getByStringCode(colorBallSet.substring(i, i + 1));
            colors.add(color);
        }
        return colors;
    }
}
