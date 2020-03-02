package jatin;

import java.util.Arrays;
public class Department {
	String dname;
	Employee[] emp=new Employee[6];

	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Employee[] getEmp() {
		return emp;
	}

	public void setEmp(Employee[] emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Department [dname=" + dname + ","
				+ "  emp=" + Arrays.toString(emp) + "]";
	}
			
	
	
	     }

