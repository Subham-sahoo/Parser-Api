package com_parase_Employee;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Employee")
public class Employee {
String name,gender,Address;
int empid,sal;
public Employee(String name, String gender, String address, int empid, int sal) {
	super();
	this.name = name;
	this.gender = gender;
	Address = address;
	this.empid = empid;
	this.sal = sal;
}
Employee(){
	
}
@XmlElement
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@XmlElement
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@XmlElement
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
@XmlElement
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
@XmlElement
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", gender=" + gender + ", Address=" + Address + ", empid=" + empid + ", sal="
			+ sal + "]";
}

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

