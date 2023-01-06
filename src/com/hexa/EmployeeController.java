package com.hexa;

public class EmployeeController {
public static void main(String[] args) {
	Employee e =new Employee();
	e.setEmpid(102);
	e.setName("rahul");
	e.setAddress("pune");
	System.out.println(e.getcity());
	System.out.println(e.getEmpid());
	System.out.println(e.getName());
	System.out.println(e.getAddress());
}
}
