public class MainClass {

    public static void main(String[] args) {
        // ein Parlament
        Parlament meinParlament = new Parlament("Schülerparlament", "Mustergasse 24, 1234 Musterhausen");

        // 5 Abgeordnete
        Abgeordneter a1 = new Abgeordneter(1, "Schlaumeier", "Hans", 5000);
        Abgeordneter a2 = new Abgeordneter(2, "Wunderbar", "Walter", 3500);
        Abgeordneter a3 = new Abgeordneter(3, "Lustig", "Paul", 2700);
        Abgeordneter a4 = new Abgeordneter(4, "Jung", "Janine", 6000);
        Abgeordneter a5 = new Abgeordneter(5, "Fleissig", "Frieda", 3400);

        // mit zwei Fraktionen
        Fraktion f1 = new Fraktion("AllesOderNichts", a5);
        Fraktion f2 = new Fraktion("ImmerDagegen", a1);

        meinParlament.neueFraktion(f2);
        meinParlament.neueFraktion(f1);

        // Abgeordneter einstellen

        meinParlament.abgeordnetenWaehlen(a2, 1);
        meinParlament.abgeordnetenWaehlen(a3, 2);
        meinParlament.abgeordnetenWaehlen(a4, 1);

        // Abgeordneter wechselt die Fraktion
        meinParlament.fraktionWechseln(2, 1, 2);

        // Test Ausgabe

        System.out.println("Das Parlament hat folgende Struktur:");

        Fraktion fra1 = meinParlament.getFraktion(1);

        System.out.println("Fraktion: " + fra1.getName());
        System.out.println("Fraktionsvorsitz: " + fra1.getVorsitz().getName());
        System.out.println("Abgeordnete: ");

        for (int i = 0; i < fra1.getIndex() + 1; i++) {
            if (fra1.abgeordneterExistiert(i)) {
                System.out.println(fra1.getAbgeordneterNachIndex(i).getName());
            }
        }

        Fraktion fra2 = meinParlament.getFraktion(2);
        System.out.println("Fraktion: " + fra2.getName());
        System.out.println("Fraktionsvorsitz: " + fra2.getVorsitz().getName());
        System.out.println("Abgeordnete: ");

        for (int i = 0; i < fra2.getIndex() + 1; i++) {
            if (fra2.abgeordneterExistiert(i)) {
                System.out.println(fra2.getAbgeordneterNachIndex(i).getName());
            }
        }
    }
}
