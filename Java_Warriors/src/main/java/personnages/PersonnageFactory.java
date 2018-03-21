package personnages;

import java.util.*;

public abstract class PersonnageFactory {
    public static Personnage createPersonnage(Scanner sc1) {
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
            return new Guerrier(nom, image, i, j, createArme(sc1));
        } else {

        }

        return new Magicien(nom, image, i, j, createSort(sc1));
    }

    

    private static Arme createArme(Scanner sc1) {
        String arme = "arme";
        sc1.nextLine();
        System.out.println("le nom de votre arme : ");
        String nomArme = sc1.nextLine();

        System.out.println("Sa Puisssance : ");
        int forceArme = sc1.nextInt();
        System.out.println("1-Arc, 2-Epée, 3-Gourdin");
        int type = sc1.nextInt();
        sc1.nextLine();
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

        return new Arme(arme, nomArme, forceArme, typeOfW);
    }

    private static Sort createSort(Scanner sc1) {
        String sort = "sort";
        sc1.nextLine();

        System.out.println("le nom de votre sort : ");
        String nomSort = sc1.nextLine();

        System.out.println("Sa Puisssance : ");
        int forceSort = sc1.nextInt();

        System.out.println("Element associé : 1-Feu, 2-Glace, 3-Foudre");
        int type = sc1.nextInt();
        sc1.nextLine();
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
        return new Sort(sort, nomSort, forceSort, assocElement);
    }
}