package livrables;

import java.util.Scanner;

public class Test {
    static int testValue;
    static boolean bsaisie = false;

    public static void entier() {

        System.out.println(" Veuillez saisir un chiffre : ");

        do {

            Scanner sc = new Scanner(System.in); // saisie par l’utilisateur + déclaration du scanner

            try { // aucune erreur

                String nombre = sc.nextLine(); // la variable prend le chiffre saisi
                testValue = Integer.parseInt(nombre);
                bsaisie = true; // bsaisie passe a l’état true, ce qui permettra de sortir de la boucle

            } catch (NumberFormatException e) { // erreur du type toutes Exception (s) (ce n’est pas un int qui est saisi)
                System.out.println(" Un chiffre!!! Essaye encore : ");

            }

        } while (bsaisie == false); //fin de boucle si bsaisie = true

        System.out.println(" Vous avez saisi :" + testValue);

    }
}
