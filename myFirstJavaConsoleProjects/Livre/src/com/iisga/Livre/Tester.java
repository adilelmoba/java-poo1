package com.iisga.Livre;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Initialiser Scanner
        int i = 0;
        int nombreLivres;
        System.out.println("Donnez combien de livres voulez-vous saisir? :");
        nombreLivres = sc.nextInt();
        Livre[] livres = new Livre[nombreLivres]; // For the array Objects

        // Saisie d'Informations
        for (i=0;i<nombreLivres;i++) {
            livres[i] = new Livre();

            sc.nextLine(); // fflush(stdin) - problem of \n
            System.out.println("Donnez le titre du livre n° " + Livre.getCountId() + " :");
            livres[i].setTitre(sc.nextLine());
            //String titre = sc.next(); to solve the problem of reading only the first word
            //livres[i].setTitre(titre);

            System.out.println("Donnez l'auteur du livre n° " + Livre.getCountId() +  " :");
            livres[i].setAuteur(sc.nextLine());

            System.out.println("Donnez le prix du livre n° " + Livre.getCountId() + " :");
            livres[i].setPrix(sc.nextInt());
        }

        // Affichage d'Informations
        for (i=0;i<nombreLivres;i++) {
            System.out.println(livres[i].toString()+"\n");
        }
        System.out.println("Nombre de livres :" + Livre.getNombreCompte());

        sc.close(); // to Close the Scanner
    }
}
