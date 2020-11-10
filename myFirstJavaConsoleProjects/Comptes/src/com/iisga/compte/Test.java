package com.iisga.compte;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Compte cp1 = new Compte(5000.0F);
        Compte cp2 = new Compte(8000.0F);
        Compte cp3 = new Compte(1000.0F);
        cp1.verser(2000.0F);
        cp2.retirer(1000.0F);
        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cp3);
        System.out.println("Nombre de comptes :" + Compte.getNombreCompte());
    }
}