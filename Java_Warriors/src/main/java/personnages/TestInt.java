package personnages;

import java.util.Scanner;

public class TestInt {
    //Cette méthode converti en String pour éviter les sc1.nextInt() et vérifie si l'entrée utilisateurs est un int!!!
// en paramètre je passe le message dédié à l'utilisateur et le Scanner dont à besoi n la fonction.
//Ensuite j'utilise TestInt.ConvertStringToInt("Votre niveau de vie", sc1) au coeur de la classe main:-)
    public static int ConvertStringToInt(String message,Scanner sc1){

        System.out.println(message);
        boolean bsaisie = false;
        int result = 0;

        do {

            
            try { // aucune erreur

                String nombre = sc1.nextLine(); // la variable prend le chiffre saisi
                result = Integer.parseInt(nombre);
                bsaisie = true; // bsaisie passe a l’état true, ce qui permettra de sortir de la boucle

            } catch (NumberFormatException e) { // erreur du type toutes Exception (s) (ce n’est pas un int qui est saisi)
                System.out.println(" Un chiffre!!! Essaye encore : ");

            }

        } while (bsaisie == false); //fin de boucle si bsaisie = true

        return result;
    }
}
