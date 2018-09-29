package es.upm.miw.iwvg.adoo.views;

public interface IOView {

    public int readInt(String title);

    public String readString(String title);

    public String readStringContinue(String title);

    public void write(String title);

    public void writeln();

    public void writeln(String title);
}
