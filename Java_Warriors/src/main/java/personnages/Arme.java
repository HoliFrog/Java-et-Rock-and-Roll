package personnages;

public class Arme extends DeviceToKill {
	private String typeOfWeapon;
	private static int compteur = 0;

	public String getTypeofweapon() {
		return this.typeOfWeapon;
	}

	public void setTypeofweapon(String typeOfWeapon) {
		this.typeOfWeapon = typeOfWeapon;
	}

	public Arme(String arme, String weaponName, int weaponAtk,String typeOfW) {
		compteur++;
		this.setDevicetype(arme);
		this.setTypeofweapon(typeOfW);
		this.setDevicename(weaponName);
		this.setDeviceatk(weaponAtk);
		this.setDevicenumber(compteur);
	}
	public String toString(){
		return super.toString()+ "Type d'"+getDevicetype()+" : "+getTypeofweapon()+"\n";
	}
}

// 	private String typeOfWeapon;

// 	public String getTypeofweapon() {
// 		return this.typeOfWeapon;
// 	}

// 	public void setTypeofweapon(String typeOfWeapon) {
// 		this.typeOfWeapon = typeOfWeapon;
// 	}

// 	public Arme(String sortName, int sortAtk, String typeOfW) {
// 		this.setDevicename(sortName);
// 		this.setDeviceatk(sortAtk);
// 		this.setTypeofweapon(typeOfW);

// 	}
// 