package es.upm.miw.iwvg.adoo.utils;

public enum GameConfiguration {
    DEFAULT_PLAY_MODE(1),
    NUMBER_OF_PLAYERS(2),
    NUMBER_OF_PLAY_MODES(2),
    NUMBER_OF_PLAYS(10);

    private int value;

    private GameConfiguration(int value) {
        this.value = value;
    }

    public int getIntValue(){
        return value;
    }
}
