package models;

public class Horaire {
    public static final int NBRE_DE_BLOCS = 6;
    //MR doit être mi en final
    private Bloc[] blocs;

    public Horaire() {
        blocs = new Bloc[NBRE_DE_BLOCS];
        blocs[0] = new Bloc("B1S1");
        blocs[1] = new Bloc("B2S1");
        blocs[2] = new Bloc("B3S1");
        blocs[3] = new Bloc("B4S2");
        blocs[4] = new Bloc("B5S2");
        blocs[4] = new Bloc("B6S2");

    }

    public boolean planifier(ModuleInfo[] modules, Professeur[] profs) {
        return false;
    }

    public static void afficherHoraire() {
        
    }

    public Bloc moduleDansQuelBloc(ModuleInfo module) {
        return null;
    }

}
