package models;

public class Bloc {
    public static final int NBRE_DEMI_JOURS_SEMAINE = 10;
    private final String nom;
    private ModuleInfo[] modules;

    public Bloc(String nom) {
        this.nom = nom;
        modules = new ModuleInfo[NBRE_DEMI_JOURS_SEMAINE];

        ModuleInfo Matu = new ModuleInfo("Matu");
        for (int i = 0; i < modules.length; i++) {
            for (int j = 0; j < 5; j++) {
                modules[i] = Matu;
            }
        }
    }

    public boolean planifierModule(ModuleInfo module) {
        boolean estPlanifie = false;
        int compteur = 0;

        for (int i = 0; i < modules.length; i++) {
            if (modules[i] == null) {
                compteur++;
                if (compteur == 3) {
                    estPlanifie = true;
                    break;
                }
            } else {
                estPlanifie = false;
            }
        }

        return estPlanifie;

    }

    public void afficherHoraire() {
        
    }

    public boolean estTotalementPlanifie() {
        boolean estTotalementPlanifie = false;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] == null) {
                estTotalementPlanifie = false;
                break;
            } else {
                estTotalementPlanifie = true;
            }
        }

        return estTotalementPlanifie;
    }

    public boolean contientModule(ModuleInfo module) {
        boolean estDansModule = false;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i].getNom() == module.getNom()) {
                estDansModule = true;
            } else {
                estDansModule = false;
            }
        }

        return estDansModule;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }

}
