package personnages;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        ArrayList<Personnage> newPerso = new ArrayList<Personnage>();

        String userChoice;

        int choix = TestInt.ConvertStringToInt("Voulez-vous : \n" + "1- Créer un perso\n" + "2- affichez vos persos \n" + "3- Modifiez un perso\n"
        + "4- sortir", sc1);
        switch (choix) {
            case 1:
            do {

                newPerso.add(PersonnageFactory.createPersonnage(sc1));
    
                System.out.println("Voulez-vous créer un autre personnages oui:'1', non: '2'");
                userChoice = sc1.nextLine();
    
            } while (userChoice.equals("4"));
                
                break;
                case 2:
                
                break;
                case 3:
                
                break;
                case 4:
                
                break;
        
            default:
                break;
        }

       

        System.out.println("voulez vous afficher vos personnages : Y/N");
        String displayChoice = sc1.nextLine();
        if (displayChoice.toUpperCase().equals("Y")) {

            for (int x = 0; x < newPerso.size(); x++) {

                System.out.println(newPerso.get(x).toString());
            }

            // System.out.println(PersonnageFactory.afficheTableau(newPerso));
            System.out.println("Voulez-vous modifier un personnages: Y/N");
            displayChoice = sc1.nextLine();
            if (displayChoice.toUpperCase().equals("Y")) {

                for (Personnage perso : newPerso) {
                    System.out.println("perso n° " + perso.getPersonumber() + "tapez : " + perso.getPersonumber());

                }
                int persoChoice = TestInt.ConvertStringToInt("Lequel?", sc1);
                //Personnage updatedPerso = (Personnage))newPerso.stream().filter(p->p.getPersonumber() == persoChoice).toArray()[0];
                //Personnage updatedPerso = (Personnage))newPerso.stream().filter(p->p.getPersonumber() == persoChoice)

                // newPerso.stream().filter(p -> p.getPersonumber() == persoChoice).forEach(u -> {
                //     System.out.println("quoi modifer ?");
                // });

                Personnage updatedPerso = newPerso.stream().filter(p -> p.getPersonumber() == persoChoice)
                        .collect(Collectors.toList()).get(0);
                System.out.println("Voulez-vous modifier : \n" + "1- le nom\n" + "2- l'image\n" + "3- la vie\n"
                        + "4- la force" + "5- l'arme");
                String attributChoice = sc1.nextLine();
                switch (attributChoice) {
                case "1":
                    System.out.println("Votre changement : ");
                    updatedPerso.setNom(sc1.nextLine());
                    break;

                case "2":
                    System.out.println("Votre changement : ");
                    updatedPerso.setImage(sc1.nextLine());
                    break;

                case "3":
                    System.out.println("Votre changement : ");
                    updatedPerso.setLifeLevel(sc1.nextInt());
                    sc1.nextLine();
                    break;

                case "4":
                    System.out.println("Votre changement : ");
                    updatedPerso.setAtkLevel(sc1.nextInt());
                    sc1.nextLine();
                    break;

                }
                

            }
            for (int x = 0; x < newPerso.size(); x++) {

                System.out.println(newPerso.get(x).toString());
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
// public void armeUpdate(Scanner sc1, int index, Arme newValues) {

//     for (int i = 0; i < myWeapons.size(); i++) {
//         if (index == i) {
//             myWeapons.set(i, newValues);
//             myWeapons.toString();
//         }

//     }
