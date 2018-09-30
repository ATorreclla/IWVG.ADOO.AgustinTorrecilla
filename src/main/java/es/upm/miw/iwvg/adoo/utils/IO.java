package es.upm.miw.iwvg.adoo.utils;

import es.upm.miw.iwvg.adoo.views.IOView;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class IO implements IOView{

    private BufferedReader bufferedReader = new BufferedReader
            (new InputStreamReader(System.in));

    @Override
    public String readString(String title) {
        String input = null;
        boolean ok = false;
        do {
            this.write(title);
            try {
                input = bufferedReader.readLine();
                ok = true;
            } catch (Exception ex) {
                this.writeError(Constants.STRINGCHAIN);
            }
        } while (!ok);
        return input;
    }
    @Override
    public String readStringContinue(String title) {
        String input = null;
        boolean ok = false;
        do {
            this.write(title);
            try {
                input = bufferedReader.readLine();
                ok = isYesNo(input);
            } catch (Exception ex) {
                this.writeError(Constants.STRINGCHAIN);
            }
        } while (!ok);
        return input;
    }

    @Override
    public void writeln() {
        System.out.println();
    }

    @Override
    public void write(String title) {
        System.out.print(title);
    }

    @Override
    public void writeln(String title) {
        System.out.println(title);
    }

    private void writeError(String formato) {
        System.out.println(Constants.WRITEFORMATERROR + formato );
    }

    private boolean isYesNo(String option) {
        assert (option != null);
        Pattern pattern = Pattern.compile(Constants.PATTERN_YES_NO);
        Matcher matcher = pattern.matcher(option);
        return matcher.matches();
    }

    @Override
    public int readInt(String title) {
        int input = 0;
        boolean ok = false;
        do {
            try {
                input = Integer.parseInt(this.readString(title));
                ok = true;
            } catch (Exception ex) {
                this.writeError(Constants.INTEGER);
            }
        } while (!ok);
        return input;
    }
}
