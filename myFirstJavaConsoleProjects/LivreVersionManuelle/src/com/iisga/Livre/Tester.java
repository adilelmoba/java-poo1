package com.iisga.Livre;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        // Saisie d'Informations
        Scanner sc = new Scanner(System.in); // Initialisation du Scanner
        Livre l1 = new Livre();
        System.out.println("Donnez le titre du livre n° " + Livre.getCountId() + " :");
        String titre = sc.nextLine();
        l1.setTitre(titre);

        System.out.println("Donnez l'auteur du livre n° " + Livre.getCountId() +  " :");
        String auteur = sc.nextLine();
        l1.setAuteur(auteur);

        System.out.println("Donnez le prix du livre n° " + Livre.getCountId() + " :");
        Float prix = sc.nextFloat();
        l1.setPrix(prix);

        Livre l2 = new Livre("Langage JAVA","John",600);
        Livre l3 = new Livre("Langage C#","Steven",300);

        // Affichage d'Informations
        System.out.println(l1.toString()+"\n");
        System.out.println(l2.toString()+"\n");
        System.out.println(l3.toString()+"\n");
        System.out.println("Nombre de livres :" + Livre.getNombreCompte());

        sc.close(); // to Close the Scanner
    }
}
