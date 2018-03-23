package personnages;

import java.util.*;

public abstract class PersonnageFactory {
    public static Personnage createPersonnage(Scanner sc1) {
        System.out.println("Saisissez la catégorie de votre perso :1- Guerrier, 2- Magicien ");
        String choice = sc1.nextLine();

        if (!choice.equals("1") && !choice.equals("2")) {
            return createPersonnage(sc1);
        }

        System.out.println("Saisissez le nom de votre perso : ");
        String nom = sc1.nextLine();

        System.out.println("Votre Photo : ");
        String image = sc1.nextLine();

        int lifeValue = TestInt.ConvertStringToInt("Niveau de vie : ", sc1);

        int forceValue = TestInt.ConvertStringToInt("Votre force: ", sc1);

        if (choice.equals("1")) {
            return new Guerrier(nom, image, lifeValue, forceValue, createArmes(sc1));
        } else {
            return new Magicien(nom, image, lifeValue, forceValue, createSorts(sc1));
        }
    }

    public static ArrayList<Arme> createArmes(Scanner sc1) {
        int nbArmesChoice = 2;
        ArrayList<Arme> mesArmes = new ArrayList<Arme>();
        do {
            mesArmes.add(createArme(sc1));

            nbArmesChoice = TestInt.ConvertStringToInt("Voulez-vous en créer une autre? 1-oui, 2-non", sc1);

        } while (mesArmes.size() < 4 && nbArmesChoice == 1);
        return mesArmes;
    }

    public static Arme createArme(Scanner sc1) {

        String arme = "arme";
        System.out.println("Maintenant créer votre " + arme);

        int type = TestInt.ConvertStringToInt("1-Arc, 2-Epée, 3-Gourdin", sc1);
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

        System.out.println("le nom de votre arme : ");
        String nomArme = sc1.nextLine();

        int forceArme = TestInt.ConvertStringToInt("Sa Puisssance : ", sc1);
        return new Arme(arme, nomArme, forceArme, typeOfW);
    }

    public static ArrayList<Sort> createSorts(Scanner sc1)

    {
        int newSortsChoice = 2;
        ArrayList<Sort> mesSorts = new ArrayList<Sort>();
        do {
            mesSorts.add(createSort(sc1));

            newSortsChoice = TestInt.ConvertStringToInt("Voulez-vous en créer un autre sort? 1-oui, 2-non", sc1);

        } while (mesSorts.size() < 4 && newSortsChoice == 1);
        return mesSorts;
    }

    public static Sort createSort(Scanner sc1) {

        String sort = "sort";
        System.out.println("Maintenant créer votre " + sort);

        System.out.println("Element associé : 1-Feu, 2-Glace, 3-Foudre");
        String type = sc1.nextLine();

        String assocElement = "";
        switch (type) {
        case "1":
            assocElement = "Feu";
            break;
        case "2":
            assocElement = "Glace";
            break;
        case "3":
            assocElement = "Foudre";
            break;
        }

        System.out.println("le nom de votre sort : ");
        String nomSort = sc1.nextLine();

        int forceSort = TestInt.ConvertStringToInt("Sa Puisssance : ", sc1);

        return new Sort(sort, nomSort, forceSort, assocElement);
    }

    public static String afficheTableau(ArrayList<Personnage> objectToDisplay) {

        String display = "";
        for (int x = 0; x < objectToDisplay.size(); x++) {
            display += objectToDisplay.get(x).toString() + System.lineSeparator();
        }

        return display;
    }

    // public void persoUpdate(Scanner sc1, int index, Personnage newValues) {

    //             createPersonnage(sc1).setNom(index,newValues);
}
