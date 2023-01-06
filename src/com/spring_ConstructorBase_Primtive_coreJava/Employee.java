package com.spring_ConstructorBase_Primtive_coreJava;

public class Employee {
private int empid;
private String name;
private String address;
@Override
public String toString() {
	return "empid=" + empid + ", name=" + name + ", address=" + address ;
}
public int getEmpid() {
	return empid;
}
public String getName() {
	return name;
}
public String getAddress() {
	return address;
}
public Employee(int empid, String name, String address) {
	super();
	this.empid = empid;
	this.name = name;
	this.address = address;
}

}
