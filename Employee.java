package org.amazonemployee;

//created a class employee
public class Employee {
	//create a data members private 
	private String name;
	private String role;
	private double salary;
	
	//0-arg constructor
	public Employee() {
		
	}
	
	
	//create a constructor and initialize the data member
	public Employee(String name,String role,double salary) {
		//set the data 
		this.name=name;
		this.role=role;
		this.salary=salary;
	}
	
	
	//create a getter method 
	public String getName() {
		return name;
	}
	
	public String getrole() {
		return role;
	}
	
	public double getSalary() {
		return salary;
	}

	
	public void setSalary(double salary) {
		this.salary=salary;
	}

}
