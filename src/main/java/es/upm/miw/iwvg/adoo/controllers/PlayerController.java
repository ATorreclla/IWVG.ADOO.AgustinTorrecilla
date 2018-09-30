package es.upm.miw.iwvg.adoo.controllers;

import es.upm.miw.iwvg.adoo.models.ColorBallSet;

public abstract class PlayerController {

    protected ColorSetGeneratorController colorSetGeneratorController;

    public abstract ColorBallSet generateColorBallSet();

    public PlayerController( ColorSetGeneratorController colorSetGeneratorController) {
        assert colorSetGeneratorController != null;
        this.colorSetGeneratorController = colorSetGeneratorController;
    }

}
