package POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Création d'une liste d'Individu contenant avec les étudiants et les enseignants
        List<Individu> individus = new ArrayList<>();

        // Ajout des étudiants
        individus.add(new Etudiant("Ferrari", "Enzo", 304, new Date(), "Licence"));
        individus.add(new Etudiant("Petit", "Nicolas", 972, new Date(), "Bac Pro"));

        // Ajout du cours
        //cours.add(new Cours("Sport", "Smith", 60, 4));

        // Ajout des enseignants
        individus.add(new Enseignant("Smith", "Will", 111, "Sport", 4000.0));
        individus.add(new Enseignant("Dupuis", "Sophie", 958, "Chimie", 5500.0));

        // Utilisation du polymorphisme pour appeler la méthode montrerDetails sur chaque objet de la liste
        for (Individu individu : individus) {
            individu.montrerDetails();
            System.out.println();
        }
    }
}
