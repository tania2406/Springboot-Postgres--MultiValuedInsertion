package com.example.Springboot_crud_keyvaluepair;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
	@Autowired
	EmployeeRepository erepo;
	
	@RequestMapping("/test")
	public String test()
	{
		return "test for key pair";
	}
	@RequestMapping("/save")
	public String savedata(@RequestBody Employee emp)
	{
		erepo.save(emp);
		return "data has been saved";
		
	}
	@RequestMapping("/all")
	public List<Employee> alldata()
	{
		return erepo.findAll();
	}
	@RequestMapping("/by/{phone}")
	public List<Employee> alldata(@PathVariable String phone)
	{
		return erepo.findByPhoneNumber(phone);
	}
}
