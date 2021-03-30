package com.tyss.ess.service;

import com.tyss.ess.dto.EmployeePersonalDetailsDto;
import com.tyss.ess.requestdto.EmployeePersonalDetailsRequestDto;

public interface EmployeeDetailsService {

 public	EmployeePersonalDetailsRequestDto employeeDetails(EmployeePersonalDetailsRequestDto employeePersonalDetailsRequestDto);

public EmployeePersonalDetailsDto updateEmpDetails(String employeeId);

}
