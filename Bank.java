package Collection3;

public class Bank {

	private String name;
	private int accNo;
	private  int saving;
	 private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getSaving() {
		return saving;
	}
	public void setSaving(int saving) {
		this.saving = saving;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Bank(String name, int accNo, int saving, String gender) {
		super();
		this.name = name;
		this.accNo = accNo;
		this.saving = saving;
		this.gender = gender;
	}
     
	public String toString() {
		return "Bank [name=" + name + ", accNo=" + accNo + ", saving=" + saving + ", gender=" + gender + "]";
	}
	
	
}
