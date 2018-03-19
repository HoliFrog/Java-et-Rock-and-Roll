package personnages;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
            sc1.nextLine();
            System.out.println("le nom de votre arme : ");
            String nomArme = sc1.nextLine();

            System.out.println("Sa Puisssance : ");
            int forceArme = sc1.nextInt();

            Arme newWeapon = new Arme(nomArme, forceArme);

            Personnage gPersonnage = new Guerrier(nom, image, i, j, newWeapon);
            gPersonnage.affichePerso();
            newWeapon.afficheArme();
        } else if (choice == 2) {
            sc1.nextLine();
            System.out.println("le nom de votre sort : ");
            String nomSort = sc1.nextLine();

            System.out.println("Sa Puisssance : ");
            int forceSort = sc1.nextInt();

            Sort newSort = new Sort(nomSort, forceSort);

            Personnage mPersonnage = new Magicien(nom, image, i, j, newSort);
            mPersonnage.affichePerso();
            newSort.toString();
        }

    }
}
// System.out.println(gPersonnage.toString());
// System.out.println(gPersonnage.getImage());
// System.out.println(gPersonnage.getLifeLevel());
// System.out.println(gPersonnage.getAtkLevel());
// System.out.println(gPersonnage.WeaponName);
// System.out.println(gPersonnage.WeaponAtk);