package com.example.Springboot_crud_keyvaluepair;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
    @Query(value="select * From Employee where ?1 =any(phone_number)",nativeQuery=true)
	List<Employee> findByPhoneNumber(@Param("phone")String phone);

}
