import java.util.HashMap;

class Parlament {

    private String name;
    private String adresse;
    private int index = 0;
    private HashMap<Integer, Fraktion> fraktionsListe = new HashMap<>();

    Parlament(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    void neueFraktion(Fraktion f) {
        fraktionsListe.put(++index, f);
    }

    Fraktion getFraktion(int i) {
        return fraktionsListe.get(i);
    }

    void abgeordnetenWaehlen(Abgeordneter abg, int i) {
        fraktionsListe.get(i).zuordnenAbgeordneter(abg);
    }

    void fraktionWechseln(int verwNr, int von, int nach) {
        Abgeordneter temp = fraktionsListe.get(von).getAbgeordneter(verwNr);
        fraktionsListe.get(von).entferneAbgeordneter(verwNr);
        fraktionsListe.get(nach).zuordnenAbgeordneter(temp);
    }

}
