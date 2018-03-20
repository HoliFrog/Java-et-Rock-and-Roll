package personnages;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Personnage[] persos = new Personnage[10];
        int indexPerso = 0;
        int userChoice = 0;
        do {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Saisissez la catégorie de votre perso :1- Guerrier, 2- Magicien ");
            int choice = sc1.nextInt();
            sc1.nextLine();
            System.out.println("Saisissez le nom de votre perso : ");
            String nom = sc1.nextLine();

            System.out.println("Votre Photo : ");
            String image = sc1.nextLine();

            System.out.println("Niveau de vie : ");
            int i = sc1.nextInt();

            System.out.println("Votre force: ");
            int j = sc1.nextInt();

            if (choice == 1) {
                String arme = "arme";
                sc1.nextLine();
                System.out.println("le nom de votre arme : ");
                String nomArme = sc1.nextLine();

                System.out.println("Sa Puisssance : ");
                int forceArme = sc1.nextInt();
                System.out.println("1-Arc, 2-Epée, 3-Gourdin");
                int type = sc1.nextInt();
                String typeOfW = "";
                switch (type) {
                case 1:
                    typeOfW = "Arc";
                    break;
                case 2:
                    typeOfW = "Epée";
                    break;
                case 3:
                    typeOfW = "Gourdin";
                    break;

                }

                Arme newWeapon = new Arme(arme, nomArme, forceArme, typeOfW);

                Personnage gPersonnage = new Guerrier(nom, image, i, j, newWeapon);
                // gPersonnage.affichePerso();

                persos[indexPerso] = gPersonnage;
                indexPerso++;

            } else if (choice == 2) {
                String sort = "sort";
                sc1.nextLine();

                System.out.println("le nom de votre sort : ");
                String nomSort = sc1.nextLine();

                System.out.println("Sa Puisssance : ");
                int forceSort = sc1.nextInt();

                System.out.println("Element associé : 1-Feu, 2-Glace, 3-Foudre");
                int type = sc1.nextInt();
                String assocElement = "";
                switch (type) {
                case 1:
                    assocElement = "Feu";
                    break;
                case 2:
                    assocElement = "Glace";
                    break;
                case 3:
                    assocElement = "Foudre";
                    break;

                }

                Sort newSort = new Sort(sort, nomSort, forceSort, assocElement);

                Personnage mPersonnage = new Magicien(nom, image, i, j, newSort);
                // mPersonnage.affichePerso();

                persos[indexPerso] = mPersonnage;
                indexPerso++;

            }
            System.out.println("Voulez-vous créer un autre personnages oui:'1', non: '2'");

            userChoice = sc1.nextInt();

        } while (userChoice == 1);

        for (int x = 0; x < persos.length; x++) {
            if (persos[x] != null) {
                System.out.println(persos[x].toString());

            }
        }

    }

}
// System.out.println(gPersonnage.toString());
// System.out.println(gPersonnage.getImage());
// System.out.println(gPersonnage.getLifeLevel());
// System.out.println(gPersonnage.getAtkLevel());
// System.out.println(gPersonnage.WeaponName);
// System.out.println(gPersonnage.WeaponAtk);