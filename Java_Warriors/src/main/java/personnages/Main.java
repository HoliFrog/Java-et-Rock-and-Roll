package personnages;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        ArrayList<Personnage> newPerso = new ArrayList<Personnage>();

        String userChoice;
        
        do {

            newPerso.add(PersonnageFactory.createPersonnage(sc1));

            System.out.println("Voulez-vous créer un autre personnages oui:'1', non: '2'");
            userChoice = sc1.nextLine();

        } while (userChoice.equals("1"));

        for (int x = 0; x < newPerso.size(); x++) {

            System.out.println(newPerso.get(x).toString());

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