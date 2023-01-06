package com.constructorbase_secondaryType_corejava;

public class EmployeeController {
public static void main(String[] args) {
	Address ad=new Address("midc","pune",5634);
	
	
	Employee e=new Employee(190,"rahul",ad);
	
	System.out.println(e.getEmpid());
	System.out.println(e.getName());
	System.out.println(e.getAddress().getArea());
	System.out.println(e.getAddress().getCity());
	System.out.println(e.getAddress().getPincode());
	System.out.println(e.toString());
	
	
}
}
