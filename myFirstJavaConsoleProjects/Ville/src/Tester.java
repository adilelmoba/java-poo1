import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialiser Scanner

        // Déclaration des Attributs
        String nomVille;
        int nombreHabitants;

        char reponseDeContinuation = 'o';
        int i = 0;

        // ArrayList des villes
        ArrayList<Ville> villes = new ArrayList<Ville>();

        // Saisie d'informations
        do {
            System.out.println ("\t ----Saisie des infos de la ville :" + (i+1) + "----");
            System.out.println ("Donnez le nom de la ville : ");
            nomVille = sc.nextLine();

            System.out.println ("Donnez le nombre d'habitants de la ville : ");
            nombreHabitants = sc.nextInt();

            int [] precipitationMensuel = new int[12];
            int [] temperatureMensuel = new int[12];

            System.out.println("\t ----Donnez les précepitations de l'année 2020----");
            for ( int j = 0 ; j < 12 ; j++) {
                System.out.println ("Donnez les precipitations du mois : " + (j+1));
                precipitationMensuel[j] = sc.nextInt();
            }

            System.out.println("\t ----Donnez les températures de l'année 2020----");
            for ( int j = 0 ; j < 12 ; j++) {
                System.out.println ("Donnez les temperatures du mois : " + (j+1));
                temperatureMensuel[j] = sc.nextInt();
            }
            sc.nextLine(); // Probléme dyal Int o String \n

            villes.add(new Ville(nomVille,nombreHabitants,precipitationMensuel,temperatureMensuel));

            System.out.println ("\t Voulez-vous continuez ? O/N");
            reponseDeContinuation = sc.nextLine().charAt(0);
        } while ( reponseDeContinuation == 'O' || reponseDeContinuation == 'o' );

        sc.close(); // Closing Scanner

        // Affichage des Informations
        for (Ville v : villes) {
            System.out.println("\t\t" + v);
        }
    }

}