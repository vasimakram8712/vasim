package Collection3;

public class Developer {
	
	String name;
	int age;
	int salary;
	int id;
	String gender;
	int noOfexperince;
	long monileNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getNoOfexperince() {
		return noOfexperince;
	}
	public void setNoOfexperince(int noOfexperince) {
		this.noOfexperince = noOfexperince;
	}
	public long getMonileNo() {
		return monileNo;
	}
	public void setMonileNo(long monileNo) {
		this.monileNo = monileNo;
	}
	public Developer(String name, int age, int salary, int id, String gender, int noOfexperince, long monileNo) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.id = id;
		this.gender = gender;
		this.noOfexperince = noOfexperince;
		this.monileNo = monileNo;
	}
	@Override
	public String toString() {
		return "Developer [name=" + name + ", age=" + age + ", salary=" + salary + ", id=" + id + ", gender=" + gender
				+ ", noOfexperince=" + noOfexperince + ", monileNo=" + monileNo + "]";
	}
	
	

}
