package com.constructorbase_secondaryType_corejava;

public class Address {
private String city;
private String area;
private int pincode;
public Address(String city, String area, int pincode) {
	super();
	this.city = city;
	this.area = area;
	this.pincode = pincode;
}
public String getCity() {
	return city;
}
public String getArea() {
	return area;
}
public int getPincode() {
	return pincode;
}
@Override
public String toString() {
	return "Address [city=" + city + ", area=" + area + ", pincode=" + pincode + "]";
}


}
