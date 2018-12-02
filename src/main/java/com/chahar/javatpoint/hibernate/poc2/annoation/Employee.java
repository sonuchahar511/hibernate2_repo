package com.chahar.javatpoint.hibernate.poc2.annoation;

import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
  
@Entity  
@Table(name= "jt_employee_anno")   
public class Employee {
	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	
	public Employee() {	}
	/*public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}*/
	public Employee(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}