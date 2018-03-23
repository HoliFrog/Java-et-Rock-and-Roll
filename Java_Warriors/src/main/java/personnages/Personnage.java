package personnages;



public abstract class Personnage {
    private String nom;
    private String image;
    private int lifeLevel;
    private int atkLevel;
    protected abstract String getTypePerso();
    private int persoNumber;
    private static int compteur = 0;

    public Personnage(){
        compteur++;
        this.persoNumber=compteur;
    }

	public int getPersonumber()
	{
		return this.persoNumber;
	}

	public void setPersonumber(int persoNumber)
	{
		this.persoNumber = persoNumber;
	}


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
    
    public String toString() {
        return "Nom de votre "+ getTypePerso() +" :  " + getNom() +
        "\nTu veux ma Photo :  " + getImage() +
        "\nNiveau de vie :  "+ getLifeLevel() +
        "\nForce :  " + getAtkLevel();
    }
}
                                // public static void createPerso(){
                                //     Scanner sc1 = new Scanner(System.in);
                                //         System.out.println("Saisissez la catégorie de votre perso :1- Guerrier, 2- Magicien ");
                                //         int choice = sc1.nextInt();
                                //         sc1.nextLine();
                                //         System.out.println("Saisissez le nom de votre perso : ");
                                //         String nom = sc1.nextLine();
                            
                                //         System.out.println("Votre Photo : ");
                                //         String image = sc1.nextLine();
                            
                                //         System.out.println("Niveau de vie : ");
                                //         int i = sc1.nextInt();
                            
                                //         System.out.println("Votre force: ");
                                //         int j = sc1.nextInt();
                                // }
                            
                                // public void affichePerso() {
                            
                                //     System.out.println(this.toString());
                                //     // System.out.println("-"+getNom());
                                //     // System.out.println("Tu veux ma Photo : ");       
                                //     // System.out.println("->"+getImage());
                                //     // System.out.println("Niveau de vie : ");
                                //     // System.out.println("->"+getLifeLevel());
                                //     // System.out.println("Force : ");
                                //     // System.out.println("->"+getAtkLevel());
                            
                                // }