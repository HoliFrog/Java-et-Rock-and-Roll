package personnages;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Personnage[] persos = new Personnage[10];
        int indexPerso = 0;
        String userChoice;
        do {           
                persos[indexPerso] = PersonnageFactory.createPersonnage(sc1);
                indexPerso++;

            System.out.println("Voulez-vous créer un autre personnages oui:'1', non: '2'");
            userChoice = sc1.nextLine();

        } while (userChoice.equals("1"));

        for (int x = 0; x < persos.length; x++) {
            if (persos[x] != null) {
                System.out.println(persos[x].toString());
            }
        }

        sc1.close();
    }

}
// System.out.println(gPersonnage.toString());
// System.out.println(gPersonnage.getImage());
// System.out.println(gPersonnage.getLifeLevel());
// System.out.println(gPersonnage.getAtkLevel());
// System.out.println(gPersonnage.WeaponName);
// System.out.println(gPersonnage.WeaponAtk);