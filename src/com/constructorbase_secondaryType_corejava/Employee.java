package com.constructorbase_secondaryType_corejava;

public class Employee {
private int empid;
private String name;
private Address address;
public int getEmpid() {
	return empid;
}
public String getName() {
	return name;
}
public Address getAddress() {
	return address;
}
public Employee(int empid, String name, Address address) {
	super();
	this.empid = empid;
	this.name = name;
	this.address = address;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", address=" + address + "]";
}

}
