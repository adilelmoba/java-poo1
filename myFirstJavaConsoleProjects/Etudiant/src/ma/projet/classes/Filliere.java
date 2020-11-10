package ma.projet.classes;

public class Filliere {
    // Les Attributs
    private int id;
    private String code;
    private String libelle;
    private static int countId  = 0; // Variable static = Variable de Classe

    // Constructeur
    public Filliere(String code, String libelle) {
        this.id = ++countId;
        this.code = code;
        this.libelle = libelle;
    }

    // Getters&Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public static int getCountId() {
        return countId;
    }

    public static void setCountId(int countId) {
        Filliere.countId = countId;
    }

    // La méthode toString
    @Override
    public String toString() {
        return "Code Filière :" + id + ' ' + libelle;
    }
}
