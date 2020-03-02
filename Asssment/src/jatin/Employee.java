package jatin;


public class Employee {
	String name;
	int age;
	String gender;
	Address ad;
	int doj;
	
	int salary;
	public Employee(String name,int age,String gender,Address ad,int salary,int doj)
	{  this.name=name;
	   this.age=age;
	   this.gender=gender;
	   this.ad=ad;
	   this.salary=salary;	
	   this.doj=doj;
	}
	
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}

	public int getDoj() {
		return doj;
	}

	public void setDoj(int doj) {
		this.doj = doj;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", ad=" + ad + ", doj=" + doj+"]";
	}

	
	
	

}
