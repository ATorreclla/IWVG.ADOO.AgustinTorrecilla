package es.upm.miw.iwvg.adoo.utils;

public enum Color {
    YELLOW("A"),
    RED("R"),
    GREEN("V"),
    BLUE("Z"),
    WHITE("B"),
    BLACK("N");

    private String value;

    private Color(String value) {
        this.value = value;
    }

    public static Color getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }

    public static Color getByStringCode(String code) {
        for (Color color : Color.values()) {
            if (code.equals(color.value)) {
                return Color.valueOf(color.name());
            }
        }
        return null;
    }
}