package com.iisga.Livre;

public class Livre {
    // Les Attributs
    private int id;
    private String titre;
    private String auteur;
    private float prix;

    private static int countId;

    // Constructeur
    public Livre () {
       this.id = ++countId;
    }

    public Livre(String titre,String auteur,float prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.id = ++countId;
    }

    // Getters&Setters
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public float getPrix() {
        return prix;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public static int getCountId() {
        return countId;
    }

    public static void setCountId(int countId) {
        Livre.countId = countId++;
    }

    // la Méthode toString
    @Override
    public String toString() {
        return "Le prix du livre " + titre +
                " de l'auteur " + auteur +
                " est :" + prix + " DH";
    }

    // GetNombreCompte Méthode
    public static int getNombreCompte() {
        return countId;
    }
}
