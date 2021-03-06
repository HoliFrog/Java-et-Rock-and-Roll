package personnages;
import java.util.*;
public class Magicien extends Personnage {
    private static int compteur = 0;
    ArrayList<Sort> mySpells;

    public void setMySpells(ArrayList<Sort> mSorts) {
        this.mySpells = mSorts;
    }

    public ArrayList<Sort> getMySpell() {
        return mySpells;
    }

    protected String getTypePerso(){
        return "Magicien";
    }

    public Magicien(String nom, String image, int lifeLevel, int atkLevel, ArrayList<Sort> mesSorts) {
        
        this.setNom(nom);
        this.setImage(image);
        this.setLifeLevel(lifeLevel);
        this.setAtkLevel(atkLevel);
        this.setMySpells(mesSorts);
       


    }

    public String toString() {
        return "Perso n° "+getPersonumber()+
        "\nVous avez choisi un "+ getTypePerso() +" \n"
        + super.toString() + "\n" 
        + mySpells.toString();
    }
}