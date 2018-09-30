package es.upm.miw.iwvg.adoo.controllers;

import es.upm.miw.iwvg.adoo.views.IOView;

public abstract class IOController implements IOView {

    protected IOView ioView;

    public IOController(IOView ioView) {
        assert ioView != null;
        this.ioView = ioView;
    }

    public abstract String readString(String title);

    public abstract String readStringContinue(String title);

    public abstract int readInt(String title);

    public abstract void writeln();

    public abstract void write(String title);

    public abstract void writeln(String title);

}
