package main.java.hello;
public class Ville {
    //Stocke le nom de notre ville
    private String nomVille;
    //Stocke le nom du pays de notre ville
    private String nomPays;
    //Stocke le nombre d'habitants de notre ville
    private int nbreHabitants;
    //Stocke la catégorie de la ville
    private char catVille;

    //Constructeur par défaut
    public Ville(String ville, String nomPays, int NbH) {
        this.nomVille = ville;
        this.nomPays = nomPays;
        this.nbreHabitants = NbH;
        this.catVille = 'A';
        if (0 < this.nbreHabitants && this.nbreHabitants < 1000) {
            this.catVille = 'A';
        } else if (1001 < this.nbreHabitants && this.nbreHabitants < 10000) {
            this.catVille = 'B';
        } else if (10001 < this.nbreHabitants && this.nbreHabitants < 100000) {
            this.catVille = 'C';
        }
    }

    public void PrintVilleInfo() {
        System.out.println(" v1 = " + this.nomVille + " ville de  " + this.nbreHabitants + " habitants se situant en " + this.nomPays
                + "categorie :" + this.catVille);
    }
}