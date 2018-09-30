package es.upm.miw.iwvg.adoo.controllers;

import es.upm.miw.iwvg.adoo.utils.Constants;

public class GenericContinueController extends RepetitionController  {

    public GenericContinueController(IOController ioController) {
        super(ioController);
    }

    @Override
    public boolean keepRunning() {
        String playerYesNo;
        boolean ok = false;
        do {
            playerYesNo = ioController.readString(Constants.PLAY_AGAIN.toString()).toUpperCase();
            ok = (Constants.AFIRMATION.equals(playerYesNo) || Constants.NEGATION.equals(playerYesNo));
        } while (!ok);

        return Constants.AFIRMATION.equals(playerYesNo);
    }
}
