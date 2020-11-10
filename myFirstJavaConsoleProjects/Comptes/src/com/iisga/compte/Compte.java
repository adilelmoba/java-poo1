package com.iisga.compte;

public class Compte {
    // Les Attributs
    private int code;
    private float solde;
    private static int vCode;
    float sommeRetirer;
    float sommeVerser;

    // Le Constructeur

    public Compte(float solde) {
        this.code = ++vCode;
        this.solde = solde;
    }

    // Getters&Setters

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public float getSolde() {
        return this.solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    // Les Méthodes

    public void retirer(float sommeRetirer) {
        this.solde -= sommeRetirer;
    }

    public void verser(float sommeVerser) {
        this.solde += sommeVerser;
    }

    // toString Méthode

    public String toString() {
        return "Compte [code=" + this.code + ", solde=" + this.solde + "]";
    }

    // GetNombreCompte Méthode

    public static int getNombreCompte() {
        return vCode;
    }
}