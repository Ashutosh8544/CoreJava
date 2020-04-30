package com.as.collection;

public class Employee {
	private int eno;
	private String ename;
	private String dept;
	private double salary;
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee (" + eno + ", " + ename + ", " + dept + ", " + salary + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj instanceof Employee) {
			Employee emp = (Employee) obj;
			return this.dept.equals(emp.dept) && this.eno==emp.eno;
		}
		return false;
	}
}
