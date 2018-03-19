package personnages;
public class Arme {
    private String weaponName = "";
    private int weaponAtk = 0;

	public String getWeaponname()
	{
		return this.weaponName;
	}

	public void setWeaponname(String weaponName)
	{
		this.weaponName = weaponName;
	}

	public int getWeaponatk()
	{
		return this.weaponAtk;
	}

	public void setWeaponatk(int weaponAtk)
	{
		this.weaponAtk = weaponAtk;
	}


    public void afficheArme()
    {
		System.out.println("Nom de son Arme-"+getWeaponname()+
		"\nPuissance de l'arme : "+"->"+getWeaponatk());
        // System.out.println("-"+getWeaponname());
        // System.out.println("Puissance de l'arme");
        // System.out.println("->"+getWeaponatk());
    }

    public Arme(String nom, int atk){
        this.setWeaponname(nom);
        this.setWeaponatk(atk);

    }
}