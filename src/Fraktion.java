import java.util.HashMap;

public class Fraktion {

    private String name;
    private Abgeordneter vorsitzender;
    private int index = 0;
    private HashMap<Integer, Abgeordneter> abgeordneterListe = new HashMap<>();

    Fraktion(String name, Abgeordneter vorsitz) {

        this.name = name;
        this.vorsitzender = vorsitz;

    }

    String getName() {
        return this.name;
    }

    Abgeordneter getVorsitz() {
        return this.vorsitzender;
    }

    void zuordnenAbgeordneter(Abgeordneter a) {
        abgeordneterListe.put(++index, a);
    }

    int getAnzahlMitglieder() {
        return abgeordneterListe.size();
    }

    boolean abgeordneterExistiert(int i) {
        return abgeordneterListe.containsKey(i);
    }

    Abgeordneter getAbgeordneterNachIndex(int index) {
        return abgeordneterListe.get(index);
    }

    Abgeordneter getAbgeordneter(int verwNr) {
        for (int i = 0; i < abgeordneterListe.size(); i++) {
            if (abgeordneterListe.containsKey(i)) {
                if (abgeordneterListe.get(i).getVerwaltungsNr() == verwNr) {
                    return abgeordneterListe.get(i);
                }
            }
        }
        return null;
    }

    void entferneAbgeordneter(int verwNr) {
        for (int i = 0; i < abgeordneterListe.size(); i++) {
            if (abgeordneterListe.containsKey(i)) {
                if (abgeordneterListe.get(i).getVerwaltungsNr() == verwNr) {
                    abgeordneterListe.remove(i);
                    break;
                }
            }
        }
    }

    public int ermittleStimmen() {
        return abgeordneterListe.size();
    }

    int getIndex() {
        return index;
    }

}
