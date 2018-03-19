package personnages;

public abstract class Personnage {
    private String nom;
    private String image;
    private int lifeLevel;
    private int atkLevel;

    public void setNom(String Nom) {
        this.nom = Nom;
    }

    public void setImage(String Image) {
        this.image = Image;
    }

    public void setLifeLevel(int LifeLevel) {
        this.lifeLevel = LifeLevel;
    }

    public void setAtkLevel(int AtkLevel) {
        this.atkLevel = AtkLevel;
    }

    public String getNom() {
        return nom;
    }

    public String getImage() {
        return image;
    }

    public int getLifeLevel() {
        return lifeLevel;
    }

    public int getAtkLevel() {
        return atkLevel;
    }

    public void affichePerso()
    {

        System.out.println("Nom de votre perso : -"+getNom()+
        "\n Tu veux ma Photo : ->"+getImage()+
        "\nNiveau de vie : ->"+getLifeLevel()+
        "\nForce : ->"+getAtkLevel());
        // System.out.println("-"+getNom());
        // System.out.println("Tu veux ma Photo : ");       
        // System.out.println("->"+getImage());
        // System.out.println("Niveau de vie : ");
        // System.out.println("->"+getLifeLevel());
        // System.out.println("Force : ");
        // System.out.println("->"+getAtkLevel());
        


    }
}