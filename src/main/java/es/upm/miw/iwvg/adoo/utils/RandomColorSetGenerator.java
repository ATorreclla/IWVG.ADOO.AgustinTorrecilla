package es.upm.miw.iwvg.adoo.utils;

import java.util.List;

import java.util.ArrayList;

import es.upm.miw.iwvg.adoo.controllers.ColorSetGeneratorController;

import es.upm.miw.iwvg.adoo.controllers.IOController;

import es.upm.miw.iwvg.adoo.models.ColorBallSet;

public class RandomColorSetGenerator extends ColorSetGeneratorController {

    public RandomColorSetGenerator( IOController ioController, String patternShow) {
        super( ioController, patternShow);
    }

    @Override
    public ColorBallSet generateColorBallSet() {
        List<Color> colors = new ArrayList<Color>();
        for (int i = 0; i < Constants.NUMBER_BALL_GUESS; i++) {
            colors.add(Color.getRandom());
        }
        ColorBallSet colorBallSet = new ColorBallSet(colors);
        ioController.writeln(String.format(Constants.READ_PLAY.toString(),
                Constants.NUMBER_BALL_GUESS) + colorBallSet.toString());
        return colorBallSet;
    }
}