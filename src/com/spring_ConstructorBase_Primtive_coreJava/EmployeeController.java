package com.spring_ConstructorBase_Primtive_coreJava;

public class EmployeeController {
public static void main(String[] args) {
	Employee e =new Employee(101,"rahul","pune");
	System.out.println(e.toString());
	System.out.println(e.getEmpid());
	System.out.println(e.getName());
	System.out.println(e.getAddress());
}
}
