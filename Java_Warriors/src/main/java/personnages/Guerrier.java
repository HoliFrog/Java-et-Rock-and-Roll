package personnages;

public class Guerrier extends Personnage {

    Arme myWeapon;

    public void setMyWeapon(Arme myWeapon){
        this.myWeapon = myWeapon;
    }
    public Arme getMyWeapon(){
        return myWeapon;
    }

    // public String weaponName;
    public Guerrier(String nom, String image, int lifeLevel, int atkLevel, Arme monArme){
        this.setNom(nom);
        this.setImage(image);
        this.setLifeLevel(lifeLevel);
        this.setAtkLevel(atkLevel);
        this.setMyWeapon(monArme);
        

    }

    
}