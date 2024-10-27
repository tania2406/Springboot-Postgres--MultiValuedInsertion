package com.example.Springboot_crud_keyvaluepair;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="Employee")
public class Employee
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	String city;
	int age;
	@Column(name="phone_number",columnDefinition="text[]")
	String[] phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getPhone() {
		return phone;
	}
	public void setPhone(String[] phone) {
		this.phone = phone;
	}
	
	

}
