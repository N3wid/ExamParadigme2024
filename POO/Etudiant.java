package POO;

import java.util.Date;

public class Etudiant extends Individu {
    private Date dateInscription;
    private String niveauEtude;

    // Initialisation du constructeur
    public Etudiant(String nom, String prenom, int identifiant, Date dateInscription, String niveauEtude) {
        super(nom, prenom, identifiant);
        this.dateInscription = dateInscription;
        this.niveauEtude = niveauEtude;
    }

        // Initialisation des getters/setters
    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public String getNiveauEtude() {
        return niveauEtude;
    }

    public void setNiveauEtude(String niveauEtude) {
        this.niveauEtude = niveauEtude;
    }

    // Initialisation de la méthode abstraite

    public void montrerDetails() {

        System.out.println("\n=== ETUDIANT ===\n");
        System.out.println("| Nom : " + getNom());
        System.out.println("| Prénom : " + getPrenom());
        System.out.println("| Identifiant : " + getIdentifiant());
        System.out.println("| Date d'inscription : " + getDateInscription());
        System.out.println("| Niveau d'étude : " + getNiveauEtude());
    }
}
