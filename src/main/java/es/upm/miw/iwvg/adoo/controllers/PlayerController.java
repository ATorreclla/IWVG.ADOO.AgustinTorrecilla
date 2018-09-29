package es.upm.miw.iwvg.adoo.controllers;

public class PlayerController {

    protected ColorSetGeneratorController colorSetGeneratorController;

    public PlayerController( ColorSetGeneratorController colorSetGeneratorController) {
        assert colorSetGeneratorController != null;
        this.colorSetGeneratorController = colorSetGeneratorController;
    }

}
