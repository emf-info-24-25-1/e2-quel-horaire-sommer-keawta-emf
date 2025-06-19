import models.*;
import services.ServiceFormationMaitres;

public class App {

    public static final String[] NOMS_MODULES = { "G300", "187", "162", "123", "293", "117", "164", "216", "106", "231",
            "122", "431" };

    public static void main(String[] args) {
        Horaire horaire = new Horaire();
        ModuleInfo[] modules1ere = new ModuleInfo[12];
        for (int i = 0; i < modules1ere.length; i++) {
            modules1ere[i] = new ModuleInfo(NOMS_MODULES[i]);
        }

        Professeur[] profs = new Professeur[5];
        profs[0] = new Professeur("Pedro", "Pascal");
        profs[1] = new Professeur("Jensen", "Ackles");
        profs[2] = new Professeur("Misha", "Collins");
        profs[3] = new Professeur("Sebastian", "Stan");
        profs[4] = new Professeur("Robert", "Downey Jr.");

        boolean tousModulesSontCouverts = true;

        do {
            ServiceFormationMaitres.attribuerModules(profs, modules1ere);
            tousModulesSontCouverts = ServiceFormationMaitres.tousModulesCouverts(profs, modules1ere);
        } while (!tousModulesSontCouverts);

        System.out.println("l'école a engagé les professeurs suivants :");

        for (int i = 0; i < profs.length; i++) {
            System.out.println("- " + profs[i] + " peut enseigner les modules :");

            for (int j = 0; j < modules1ere.length; j++) {
                profs[i].getModulesEnseignes();
            }
        }

        System.out.println();

        System.out.println("\nIl est temps de préparer l'horaire.\n");
    }
}
