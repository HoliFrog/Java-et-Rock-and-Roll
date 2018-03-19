package personnages;

public class Sort {
    private String spellName = "";
    private int spellForce = 0;
    private String element = "";

	public String getElement()
	{
		return this.element;
	}

	public void setElement(String element)
	{
		this.element = element;
	}

	public int getSpellforce()
	{
		return this.spellForce;
	}

	public void setSpellforce(int spellForce)
	{
		this.spellForce = spellForce;
	}


	public String getSpellname()
	{
		return this.spellName;
	}

	public void setSpellname(String spellName)
	{
		this.spellName = spellName;
    }
    public String toString(){
        return " Nom du sort : "+ getSpellname() + 
        "\nforce du sort : "+getSpellforce() ;

    }
public Sort(String nom, int force){
    this.setSpellname(nom);
    this.setSpellforce(force);
}
    // public Integer spellAtk = 0;

}