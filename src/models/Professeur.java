package models;

public class Professeur {
    public final String nom;
    public final String prenom;
    private ModuleInfo[] modulesEnseignes;

    public Professeur(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
        //MR Il faut créer un tableau de ModuleInfo mais de taille 0
        modulesEnseignes = null;
    }

    public boolean enseigneCeModule(String nomDuModule) {
        boolean enseigneCeModule = false;
        for (int i = 0; i < modulesEnseignes.length; i++) {
            if (modulesEnseignes[i].getNom().equals(nomDuModule)) {
                enseigneCeModule = true;
                break;
            } else {
                //MR Le else n'aurait pas été nécessaire que enseigneCeModule est déjà à false
                enseigneCeModule = false;
            }
        }

        return enseigneCeModule;
    }

    public void ajouterModuleEnseignes(ModuleInfo module) {
        //MR Regarde à nouveau l'ajout dans un tableau dynamique
        int tailleTableau = 0;

        //MR Attention du réinitiliser les valeur du modulesEnseignés
        ModuleInfo[] modulesEnseignes = new ModuleInfo[tailleTableau];
        ModuleInfo[] nouveauTableau = new ModuleInfo[tailleTableau++];

        for (int i = 0; i < modulesEnseignes.length; i++) {
            nouveauTableau[i] = modulesEnseignes[i];
        }

        //MR Tu n'as pas besoin de refaire une boucle tu peux directement pointé sur la dernière cellule du tableau
        for (int i = 0; i < nouveauTableau.length; i++) {
            if (nouveauTableau[i] == null) {
                nouveauTableau[i] = module;
            }
        }

        modulesEnseignes = nouveauTableau;
    }

    public void videModules() {
        //MR Il faut remettre le tableau à 0
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
