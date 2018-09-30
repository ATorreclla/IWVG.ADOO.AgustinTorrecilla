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

    public boolean equals(ColorBallSet colorBallSet) {
        for (int i = 0; i < Constants.NUMBER_BALL_GUESS; i++) {
            if (!this.equalsColorAtPosition(colorBallSet.getColorAtPosition(i), i))
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String colorString = "";
        for (Color color : colors) {
            colorString = colorString + color.toString();
        }
        return colorString;
    }
}