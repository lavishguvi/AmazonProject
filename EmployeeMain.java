package org.amazonemployee;

import java.util.Arrays;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		//Create a list of employee data 
		List<Employee> emp=Arrays.asList(
				new Employee("Lavish","Developer",10000),
				new Employee("Satish","Tester",8000),
				new Employee("Saidinesh","Manager",15000),
				new Employee("Arpita","Developer",5000)
				
				);
		
		
		//calculating salary
//		double totalsalary=emp.stream()
//				.mapToDouble(Employee::getSalary)
//				.sum();
//		
//		System.out.println("Total Salary of all Employees :"+totalsalary);
		
		
		
		//Find out all developer
//		List<Employee> developer=emp.stream()
//				.filter(e->e.getrole().equals("Developer"))
//				.collect(Collectors.toList());
//		
//		developer.forEach(dev->System.out.println(dev.getName()));
		
//        emp.stream().filter(e->e.getrole().equals("Developer"))
//		.forEach(dev->System.out.println("Name :"+dev.getName()));
        
//        emp.forEach(dev->System.out.println("Name :"+dev.getName()));
        
        
        //Java Stream
//        Scenario->We providing 10% bonus to all the developer
     
		//process the object data through stream.
        emp.stream()
           .filter(e->e.getrole().equals("Developer"))
           .forEach(dev->dev.setSalary((double) (dev.getSalary()*1.1)));
        
        
        //display the updated salary
        emp.forEach(employee->
        System.out.println(
        		"Name :"+employee.getName()+ 
        		",Role :"+employee.getrole()+
        		",Salary "+employee.getSalary())
                );
	}

}
