package es.upm.miw.iwvg.adoo.models;

import java.util.ArrayList;

import java.util.List;

import es.upm.miw.iwvg.adoo.utils.Color;

import es.upm.miw.iwvg.adoo.utils.Constants;

public class ColorBallSet {

    protected List<Color> colors = new ArrayList<Color>();

    public ColorBallSet( List<Color> colors) {
        this.colors = new ArrayList<Color>(colors);
    }

    public void setCombination(Color... colors) {
        for (Color color : colors) {
            this.colors.add(color);
        }
    }

    public boolean equalsColorAtPosition(Color color, int position) {
        assert color != null;
        assert position > 0 && position <= Constants.NUMBER_BALL_GUESS;
        return getColorAtPosition(position) == color;
    }

    public Color getColorAtPosition(int position) {
        assert position > 0 && position <= Constants.NUMBER_BALL_GUESS;
        return colors.get(position);
    }

    public boolean containsColor(Color color) {
        assert color != null;
        return colors.contains(color);
    }


}
