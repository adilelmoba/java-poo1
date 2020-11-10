package ma.projet.test;

import ma.projet.classes.Etudiant;
import ma.projet.classes.Filliere;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String [] args)
    {

        Scanner sc = new Scanner(System.in); // Initialiser Scanner

        // Déclarer et Remplir les filières sur l'Array Filliere
        Filliere[] filieres = new Filliere[4];
        filieres[0] = new Filliere ("TSDI","Dévéloppement Informatique");
        filieres[1] = new Filliere ("TSRI","Réseaux");
        filieres[2] = new Filliere ("GI","Gestion Informatisé");
        filieres[3] = new Filliere ("AC","Assistant Comptable");

        // Affichage des Filieres
        System.out.println("\nLa liste des filières de notre école :");
        for (Filliere f : filieres)
            System.out.println("\t" + f);

        // Déclarations des Atrributs
        String nom,prenom,dateDenaissance;
        char reponseDeContinuation = 'o';
        int nombreFiliere ,nombreEtudiant = 0;

        // ArrayList des étudiants
        ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();

        // Saisie d'informations
        do {
            System.out.println("\t -----Saisie des infos de l'etudiant :" + ++nombreEtudiant + " -----" );
            System.out.println("Nom :");
            nom = sc.nextLine();
            System.out.println("Prénom :");
            prenom = sc.nextLine();
            System.out.println("Date de naissance :");
            dateDenaissance = sc.nextLine();

                do {
                        System.out.println("\t Choisissez une Filère :");
                        nombreFiliere = sc.nextInt();
                        sc.nextLine(); // Problème de de int et String ==> \n
                    } while (nombreFiliere < 1 || nombreFiliere > 4);

            etudiants.add(new Etudiant(nom,prenom,dateDenaissance,filieres[nombreFiliere - 1]));
            System.out.println("\t Continuez ? O/N");
            reponseDeContinuation = sc.nextLine().charAt(0);
        } while (reponseDeContinuation == 'O' || reponseDeContinuation == 'o');

        // Affichage des Etudiants
        System.out.println("Liste des " + Etudiant.getNombreEtudiant() + " étudiants par filiére :");
        for (Filliere filiere : filieres) {
            System.out.println(filiere);
            for (Etudiant etudiant : etudiants) {
                if (etudiant.getFiliere().getId() == filiere.getId()) {
                    System.out.println("\t\t" + etudiant);
                }
            }
        }

        sc.close(); // to Close the Scanner
    }
}
