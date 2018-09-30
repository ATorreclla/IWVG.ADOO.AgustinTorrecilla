package es.upm.miw.iwvg.adoo.controllers;

import es.upm.miw.iwvg.adoo.utils.IO;

import es.upm.miw.iwvg.adoo.views.IOView;

public class IOTerminalController extends IOController implements IOView{

    public IOTerminalController() {
        super(new IO());
    }

    @Override
    public String readString(String title) {

        return ioView.readString(title);
    }

    @Override
    public int readInt(String title) {

        return ioView.readInt(title);
    }

    @Override
    public void writeln() {

        ioView.writeln();
    }

    @Override
    public void write(String title) {

        ioView.write(title);
    }

    @Override
    public void writeln(String title) {

        ioView.writeln(title);
    }

    @Override
    public String readStringContinue(String title) {

        return ioView.readStringContinue(title);
    }
}
