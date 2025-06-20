package services;

import models.ModuleInfo;
import models.Professeur;

public class ServiceFormationMaitres {
    public static void attribuerModules(Professeur[] professeurs, ModuleInfo[] modules) {
        for (int i = 0; i < professeurs.length; i++) {

            int nbre = (int) (Math.random() * (modules.length - 0 + 1)) + 0;
            ModuleInfo module = modules[nbre];
            //MR Il manque un if pour savoir si le professeur n'enseign pas déjà ce module
            String moduleChoisis = modules[nbre].getNom();

            professeurs[i].ajouterModuleEnseignes(module);
            }
        }
    

    public static boolean tousModulesCouverts(Professeur[] professeurs, ModuleInfo[] modules) {
        boolean tousModulesSontCouverts  = false;
        for (int i = 0; i < modules.length; i++) {
            //MR Ici il faut utiliser enseigneCeModule()
            if(modules[i].getProfesseur() == null){
                tousModulesSontCouverts = false;
            } else {
                tousModulesSontCouverts = true;
            }
        }
        
        return tousModulesSontCouverts;
    }
}
