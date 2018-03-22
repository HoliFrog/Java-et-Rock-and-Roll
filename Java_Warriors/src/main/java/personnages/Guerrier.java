package personnages;
import java.util.*;

public class Guerrier extends Personnage {

    ArrayList<Arme> myWeapons;

    public void setMyWeapons(ArrayList<Arme> myWeapons) {
        this.myWeapons = myWeapons;
    }

    public ArrayList<Arme> getMyWeapons() {
        return myWeapons;
    }

    protected String getTypePerso(){
        return "Guerrier";
    }

    /** TOTO */
    public Guerrier(String nom, String image, int lifeLevel, int atkLevel, ArrayList<Arme> mesArmes) {
        this.setNom(nom);
        this.setImage(image);
        this.setLifeLevel(lifeLevel);
        this.setAtkLevel(atkLevel);
        this.setMyWeapons(mesArmes);

    }

    // public void displayWarrior() {

    //     System.out.println("Vous avez choisi un Guerrier" + this.toString());
    // }

    public String toString() {
        return "Vous avez choisi un "+ getTypePerso() +" \n"
        + super.toString()+ "\n"
        +myWeapons.toString();
    }
}