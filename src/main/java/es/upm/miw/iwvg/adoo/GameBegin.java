package es.upm.miw.iwvg.adoo;

import es.upm.miw.iwvg.adoo.controllers.Game;

public class GameBegin {
    private Game game;

    public GameBegin() {
        init();
        starting();
    }

    private void init(){
        this.game = new Game();
    }

    private void starting() {
        game.play();
        while(game.keepRunning()){
            game.play();
        }
        System.exit(1);
    }
}