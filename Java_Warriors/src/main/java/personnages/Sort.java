package personnages;

public class Sort extends DeviceToKill {
	private String element;
	private static int compteur = 0;

	public String getElement()
	{
		return this.element;
	}

	public void setElement(String element)
	{
		this.element = element;
	}

	public Sort(String sort, String sortName, int sortAtk, String associateElement) {
		compteur++;
		this.setDevicetype(sort);
		this.setDevicename(sortName);
		this.setDeviceatk(sortAtk);
		this.setElement(associateElement);
		this.setDevicenumber(compteur);

	}
	public String toString(){
		return super.toString()+ "Element associé à votre "+getDevicetype()+" : "+getElement();
	}

}

// 	private String element;

// 	public String getElement() {
// 		return this.element;
// 	}

// 	public void setElement(String element) {
// 		this.element = element;
// 	}

// 	public Sort(String sortName, int sortAtk, String associateElement) {
// 		this.setDevicename(sortName);
// 		this.setDeviceatk(sortAtk);
// 		this.setElement(associateElement);

// 	}
// 