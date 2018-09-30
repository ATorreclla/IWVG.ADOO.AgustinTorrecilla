package es.upm.miw.iwvg.adoo.controllers;

public abstract class RepetitionController {

    public abstract boolean keepRunning();

    protected IOController ioController;

    public RepetitionController(IOController ioController) {
        assert ioController != null;
        this.ioController = ioController;
    }
}