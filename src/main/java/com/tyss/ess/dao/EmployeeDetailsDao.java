package com.tyss.ess.dao;

import com.tyss.ess.dto.EmployeePersonalDetailsDto;
import com.tyss.ess.requestdto.EmployeePersonalDetailsRequestDto;

public interface EmployeeDetailsDao {

	public EmployeePersonalDetailsRequestDto employeedetails(EmployeePersonalDetailsDto employeePersonalDetailsRequestDto);

	public EmployeePersonalDetailsDto updateEmpDetails(String employeeId);

}
