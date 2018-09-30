package es.upm.miw.iwvg.adoo.controllers;

import es.upm.miw.iwvg.adoo.models.ColorBallSet;

public class ManualPlayerController extends PlayerController  {

    public ManualPlayerController( IOController ioController, String patternShow) {
        super( new ManualColorSetGenerator( ioController, patternShow));
    }

    @Override
    public ColorBallSet generateColorBallSet() {
        return colorSetGeneratorController.generateColorBallSet();
    }
}
