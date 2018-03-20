package personnages;

public class Guerrier extends Personnage {

    Arme myWeapon;

    public void setMyWeapon(Arme myWeapon) {
        this.myWeapon = myWeapon;
    }

    public Arme getMyWeapon() {
        return myWeapon;
    }

    public Guerrier(String nom, String image, int lifeLevel, int atkLevel, Arme monArme) {
        this.setNom(nom);
        this.setImage(image);
        this.setLifeLevel(lifeLevel);
        this.setAtkLevel(atkLevel);
        this.setMyWeapon(monArme);

    }

    // public void displayWarrior() {

    //     System.out.println("Vous avez choisi un Guerrier" + this.toString());
    // }

    public String toString() {
        return "Vous avez choisi un Guerrier \n"
        + super.toString()+ "\n"
        +myWeapon.toString();
    }
}