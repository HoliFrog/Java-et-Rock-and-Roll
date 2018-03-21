package personnages;

public class Magicien extends Personnage {

    Sort mySpell;

    public void setMySpell(Sort mSort) {
        this.mySpell = mSort;
    }

    public Sort getMySpell() {
        return mySpell;
    }

    protected String getTypePerso(){
        return "Magicien";
    }

    public Magicien(String nom, String image, int lifeLevel, int atkLevel, Sort monSort) {
        this.setNom(nom);
        this.setImage(image);
        this.setLifeLevel(lifeLevel);
        this.setAtkLevel(atkLevel);
        this.setMySpell(monSort);

    }

    public String toString() {
        return "Vous avez choisi un "+ getTypePerso() +" \n"
        + super.toString() + "\n" 
        + mySpell.toString();
    }
}