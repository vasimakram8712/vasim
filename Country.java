package Collection3;

public class Country {
	
	String name;
	long populaction;
	String capital;
	String lanuage;
	long squMeter;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPopulaction() {
		return populaction;
	}
	public void setPopulaction(int populaction) {
		this.populaction = populaction;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getLanuage() {
		return lanuage;
	}
	public void setLanuage(String lanuage) {
		this.lanuage = lanuage;
	}
	public long getSquMeter() {
		return squMeter;
	}
	public void setSquMeter(long squMeter) {
		this.squMeter = squMeter;
	}
	public Country(String name, int populaction, String capital, String lanuage, int squMeter) {
		super();
		this.name = name;
		this.populaction = populaction;
		this.capital = capital;
		this.lanuage = lanuage;
		this.squMeter = squMeter;
	}
	
	public String toString() {
		return "Country [name=" + name + ", populaction=" + populaction + ", capital=" + capital + ", lanuage="
				+ lanuage + ", squMeter=" + squMeter + ", getName()=" + getName() + ", getPopulaction()="
				+ getPopulaction() + ", getCapital()=" + getCapital() + ", getLanuage()=" + getLanuage()
				+ ", getSquMeter()=" + getSquMeter() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
