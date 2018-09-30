package es.upm.miw.iwvg.adoo.controllers;

import java.util.ArrayList;

import java.util.List;

import es.upm.miw.iwvg.adoo.utils.Color;

import es.upm.miw.iwvg.adoo.models.ColorBallSet;

import es.upm.miw.iwvg.adoo.utils.Constants;

public class RandomSecretColorSetGenerator extends ColorSetGeneratorController {

    public RandomSecretColorSetGenerator( IOController ioController, String patternShow) {
        super( ioController, patternShow);
    }

    @Override
    public ColorBallSet generateColorBallSet() {
        List<Color> colors = new ArrayList<Color>();
        for (int i = 0; i < Constants.NUMBER_BALL_GUESS; i++) {
            colors.add(Color.getRandom());
        }
        ColorBallSet colorBallSet = new ColorBallSet(colors);
        return colorBallSet;
    }
}
