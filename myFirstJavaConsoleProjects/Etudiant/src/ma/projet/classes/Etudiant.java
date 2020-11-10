package ma.projet.classes;

public class Etudiant {
    // Les Attributs
    private int id;
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private Filliere filiere; // type Filliere de chaque filiere pour connecter les classes
    private static int countFil = 0;

    // Constructeur
    public Etudiant(String nom, String prenom, String dateDeNaissance,Filliere filiere) {
        this.id = ++countFil;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.filiere = filiere;
    }

    //Getters&Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public Filliere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filliere filiere) {
        this.filiere = filiere;
    }

    public static int getCountFil() {
        return countFil;
    }

    public static void setCountFil(int countFil) {
        Etudiant.countFil = countFil;
    }

    // La  méthode toString

    @Override
    public String toString() {
       return "Je suis l'étudiant " +  nom + ' ' + prenom + " ma date de naissance est : " + dateDeNaissance ;
    }

    // GetNombreEtudiant Méthode
    public static int getNombreEtudiant() {
        return countFil;
    }
}
