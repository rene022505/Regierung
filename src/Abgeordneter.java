public class Abgeordneter {

    private String name;
    private String vorname;
    private int verwaltungsNr;
    private int stimmen;

    public Abgeordneter(int verwNr, String name, String vorname, int stimmen) {
        this.name = name;
        this.vorname = vorname;
        this.verwaltungsNr = verwNr;
        this.stimmen = stimmen;
    }

    public String getName() {
        return name + ", " + vorname;
    }

    public int getVerwaltungsNr() {
        return verwaltungsNr;
    }

    public int getStimmen() {
        return stimmen;
    }

}
