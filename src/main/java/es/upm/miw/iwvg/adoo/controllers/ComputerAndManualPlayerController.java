package es.upm.miw.iwvg.adoo.controllers;

import es.upm.miw.iwvg.adoo.models.ColorBallSet;

import es.upm.miw.iwvg.adoo.utils.RandomColorSetGenerator;

public class ComputerAndManualPlayerController extends PlayerController {

    public ComputerAndManualPlayerController ( IOController ioController, String patternShow) {
        super( new RandomColorSetGenerator( ioController, patternShow));
    }

    @Override
    public ColorBallSet generateColorBallSet() {
        return colorSetGeneratorController.generateColorBallSet();
    }
}