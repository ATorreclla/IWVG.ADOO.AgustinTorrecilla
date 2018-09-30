package es.upm.miw.iwvg.adoo.utils;

public class IO {



    public void writeln() {
        System.out.println();
    }

    public void write(String title) {
        System.out.print(title);
    }

    public void writeln(String title) {
        System.out.println(title);
    }

    private void writeError(String formato) {
        System.out.println(Constants.WRITEFORMATERROR + formato );
    }
}
