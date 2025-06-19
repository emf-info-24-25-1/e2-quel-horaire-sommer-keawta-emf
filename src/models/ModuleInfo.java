package models;

public class ModuleInfo {
    private final String nom;
    private Professeur professeur;

    public ModuleInfo(String nom) {
        this.nom = nom;
        professeur = null;
    }

    public String getNom() {
        return nom;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    @Override
    public String toString() {
        String resutat = "";
        //MR La on regarde si l'objet est null donc on peut utiliser == null
        if (getProfesseur().equals(null)) {
            resutat += nom;
        } else {
            resutat += nom + professeur;
        }

        return resutat;
    }
}
