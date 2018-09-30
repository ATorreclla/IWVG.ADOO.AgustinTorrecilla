package es.upm.miw.iwvg.adoo.controllers;

import es.upm.miw.iwvg.adoo.utils.RandomColorSetGenerator;

import es.upm.miw.iwvg.adoo.models.ColorBallSet;

public class ComputerPlayerController extends PlayerController {

    public ComputerPlayerController( IOController ioController, String patternShow) {
        super( new RandomColorSetGenerator( ioController, patternShow));
    }

    @Override
    public ColorBallSet generateColorBallSet() {
        return colorSetGeneratorController.generateColorBallSet();
    }
}