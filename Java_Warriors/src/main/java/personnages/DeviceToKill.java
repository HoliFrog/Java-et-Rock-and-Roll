package personnages;

public abstract class DeviceToKill {

    private String deviceName;
    private int deviceAtk;
    private String deviceType;

	public String getDevicetype()
	{
		return this.deviceType;
	}

	public void setDevicetype(String deviceType)
	{
		this.deviceType = deviceType;
	}


	public String getDevicename()
	{
		return this.deviceName;
	}

	public void setDevicename(String deviceName)
	{
		this.deviceName = deviceName;
	}

	public int getDeviceatk()
	{
		return this.deviceAtk;
	}

	public void setDeviceatk(int deviceAtk)
	{
		this.deviceAtk = deviceAtk;
	}
	public String toString(){
		return "Dispositif d'attaque : "+ getDevicetype()+
		"\nNom de votre "+getDevicetype()+" :  " +getDevicename()+
		"\nNiveau d'atk :  "+getDeviceatk()+"\n";
        
	}
}