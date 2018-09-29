package es.upm.miw.iwvg.adoo;

import es.upm.miw.iwvg.adoo.controllers.Game;
public class InitGame {

    private Game game;

    public InitGame(){
        init();
        starting();
    }

    private void init(){
        this.game = new Game();
    }

    private void starting(){
        game.play();
    }
}
