package hello;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }

public static class Test {
    static String testValue;
    static boolean bsaisie = false;

    public static void entier() {
        Scanner sc = new Scanner(System.in); // saisie par l’utilisateur + déclaration du scanner

        System.out.println(" Veuillez saisir un chiffre : ");

        do {


            try { // aucune erreur

                String nombre = sc.nextLine(); // la variable prend le chiffre saisi
                int testValue = Integer.parseInt(nombre);
                bsaisie = true; // bsaisie passe a l’état true, ce qui permettra de sortir de la boucle

            } catch (java.util.InputMismatchException e) { // erreur du type java.util.InputMismatchException (ce n’est pas un int qui est saisi)
                System.out.println(" Un chiffre!!! Essaye encore : ");

            }

        } while (bsaisie == false); //fin de boucle si bsaisie = true

        System.out.println(" Vous avez saisi :" + testValue);

    }
}

}
