package POO;

public abstract class Individu {
    protected String nom;
    protected String prenom;
    protected int identifiant;

    // Initialisation du constructeur à 3 arguments
    public Individu(String nom, String prenom, int identifiant) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
    }

    // Initialisation des getters/setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public int getIdentifiant(){
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    // Initialisation de la méthode abstraite
    public abstract void montrerDetails();
}
