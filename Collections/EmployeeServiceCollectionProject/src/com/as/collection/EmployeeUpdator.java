package com.as.collection;

import java.util.ArrayList;

public class EmployeeUpdator {
	public static void increaseSalByDept(ArrayList<Employee> al, String dept) {

		for (int index = 0; index < al.size(); index++) {
			Employee e = al.get(index);
			System.out.println(al.get(index));
			if (e.getDept().equals(dept)) {
				e.setSalary(e.getSalary() * 2);
			}
		}
	}

	public static void increaseSalByEmployee(ArrayList<Employee> al, Employee e, String dept)
			throws EmployeeNotFoundException {

		int index = al.indexOf(e);
		if (index != -1) {
			Employee emp = al.get(index);
			emp.setSalary(emp.getSalary() * 3);
			return;
		}
		throw new EmployeeNotFoundException("with the given details employee is not find");
	}
	
	public static void increaseSalByDept(ArrayList<Employee> al, double sal){
			
			for(int index=0;index<al.size();index++) {
				Employee emp = al.get(index);
				if((emp.getSalary()*12)>10000){
					al.remove(index);
				}
			}
		}
	}
