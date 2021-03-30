package com.tyss.ess.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tyss.ess.dto.EmployeePersonalDetailsDto;
import com.tyss.ess.requestdto.EmployeePersonalDetailsRequestDto;
import com.tyss.ess.utility.UtilityService;

@Repository

public class EmployeeDetailsDaoImpl implements EmployeeDetailsDao {

	@Autowired
	UtilityService utilityService;

	@PersistenceContext
	EntityManager em;

	@Transactional
	@Override
	public EmployeePersonalDetailsRequestDto  employeedetails(
			EmployeePersonalDetailsDto employeePersonalDetailsDto) {
		em = utilityService.dbConnector();
		
		em.persist(employeePersonalDetailsDto);

		EmployeePersonalDetailsRequestDto responseDto = new EmployeePersonalDetailsRequestDto();
		BeanUtils.copyProperties(employeePersonalDetailsDto, responseDto);

		em.close();
		return responseDto;
	}

	@Transactional
	@Override
	public EmployeePersonalDetailsDto updateEmpDetails(String employeeId) {
		em = utilityService.dbConnector();
		
		Query query=em.createQuery("from EmployeePersonalDetailsDto ");
		
		return null;
	}

}
