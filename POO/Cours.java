package POO;

public class Cours implements Participable{

    protected String titre;
    protected String formateur;
    protected int duree;
    protected int placesRestantes;

    // Initialisation du constructeur à 4 arguments
    public Cours(String titre, String formateur, int duree, int placesRestantes) {
        this.titre = titre;
        this.formateur = formateur;
        this.duree = duree;
        this.placesRestantes = placesRestantes;
    }

    // Initialisation des getters/setters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getFormateur() {
        return formateur;
    }

    public void setFormateur(String formateur) {
        this.formateur = formateur;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getPlacesRestantes() {
        return placesRestantes;
    }

        public void setPlacesRestantes(int placesRestantes) {
        this.placesRestantes = placesRestantes;
    }

    // Initialisation de la méthode pour afficher les détails du cours
    public void montrerDetails() {

        System.out.println("\n=== COURS ===\n");
        System.out.println("| Titre du cours : " + getTitre());
        System.out.println("| Nom du ormateur : " + getFormateur());
        System.out.println("| Durée : " + getDuree() + " heures");
        System.out.println("| Nombre de places restantes : " + getPlacesRestantes());
    }

    // Initialialisation de la méthode participer
    public void participer() {
        if (placesRestantes > 0) {
            placesRestantes-=1;
            System.out.println("Vous avez participé maintenant au cours de : " + titre);
        } else {
            System.out.println("Plus aucune place n'est disponible pour le cours de : " + titre);
        }
    }

    // Initialisation de la méthode quitter
    public void quitter() {
        placesRestantes+=1;
        System.out.println("Vous avez quitté le cours de : " + titre);
    }

}
