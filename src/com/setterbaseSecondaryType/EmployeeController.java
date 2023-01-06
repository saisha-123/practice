package com.setterbaseSecondaryType;

public class EmployeeController {
public static void main(String[] args) {
	Address ad=new Address();
	ad.setCity("pune");
	ad.setArea("midc");
	ad.setPincode(3024787);
	
	Employee e=new Employee();
	e.setEmpid(101);
	e.setName("rahul");
	e.setAddress(ad);
	
	System.out.println(e.getEmpid());
	System.out.println(e.getName());
	System.out.println(e.getAddress().getArea());
	System.out.println(e.getAddress().getCity());
	System.out.println(e.getAddress().getPincode());
	
	
	
}
}
