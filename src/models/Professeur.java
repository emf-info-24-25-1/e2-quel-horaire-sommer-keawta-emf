package models;

public class Professeur {
    public final String nom;
    public final String prenom;
    private ModuleInfo[] modulesEnseignes;

    public Professeur(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
        modulesEnseignes = null;
    }

    public boolean enseigneCeModule(String nomDuModule) {
        boolean enseigneCeModule = false;
        for (int i = 0; i < modulesEnseignes.length; i++) {
            if (modulesEnseignes[i].getNom().equals(nomDuModule)) {
                enseigneCeModule = true;
                break;
            } else {
                enseigneCeModule = false;
            }
        }

        return enseigneCeModule;
    }

    public void ajouterModuleEnseignes(ModuleInfo module) {
        int tailleTableau = 0;

        ModuleInfo[] modulesEnseignes = new ModuleInfo[tailleTableau];
        ModuleInfo[] nouveauTableau = new ModuleInfo[tailleTableau++];

        for (int i = 0; i < modulesEnseignes.length; i++) {
            nouveauTableau[i] = modulesEnseignes[i];
        }

        for (int i = 0; i < nouveauTableau.length; i++) {
            if (nouveauTableau[i] == null) {
                nouveauTableau[i] = module;
            }
        }

        modulesEnseignes = nouveauTableau;
    }

    public void videModules() {
        for (int i = 0; i < modulesEnseignes.length; i++) {
            modulesEnseignes[i] = null;
        }
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public ModuleInfo[] getModulesEnseignes() {
        return modulesEnseignes;
    }

    @Override
    public String toString() {
        return prenom + " " + nom.toUpperCase();
    }

}
