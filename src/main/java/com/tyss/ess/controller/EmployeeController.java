package com.tyss.ess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.ess.dto.EmployeePersonalDetailsDto;
import com.tyss.ess.requestdto.EmployeePersonalDetailsRequestDto;
import com.tyss.ess.service.EmployeeDetailsService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

	@Autowired
	EmployeeDetailsService employeeDetailsService;

	@PostMapping("/employeedetails")
	public ResponseEntity<EmployeePersonalDetailsRequestDto> employeeDetails(
			@RequestBody EmployeePersonalDetailsRequestDto employeePersonalDetailsRequestDto){
		log.info("inside controller");

		employeePersonalDetailsRequestDto = employeeDetailsService.employeeDetails(employeePersonalDetailsRequestDto);

		if (employeePersonalDetailsRequestDto.getEmployeeId() != null) {
			return ResponseEntity.accepted().body(employeePersonalDetailsRequestDto);
		}
		return ResponseEntity.notFound().build();

	}
	
	public EmployeePersonalDetailsDto updateEmployeeDetails(String employeeId){
		
		return	employeeDetailsService.updateEmpDetails(employeeId);
		
		 
		
	}

}
