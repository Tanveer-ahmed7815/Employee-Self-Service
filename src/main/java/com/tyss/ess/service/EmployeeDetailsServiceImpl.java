package com.tyss.ess.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.ess.dao.EmployeeDetailsDao;
import com.tyss.ess.dto.BackEndTechDetailsDto;
import com.tyss.ess.dto.DatabaseTechDetailsDto;
import com.tyss.ess.dto.EducationalDetailsDto;
import com.tyss.ess.dto.EmployeePersonalDetailsDto;
import com.tyss.ess.dto.ExperienceDetailsDto;
import com.tyss.ess.dto.FrontEndTechDetailsDto;
import com.tyss.ess.dto.ProjectDetailsDto;
import com.tyss.ess.dto.TechnicalDetailsDto;
import com.tyss.ess.dto.TechnologyProjectDetailsDto;
import com.tyss.ess.dto.ToolsTechDetailsDto;
import com.tyss.ess.requestdto.BackEndTechDetailsRequestDto;
import com.tyss.ess.requestdto.DatabaseTechDetailsRequestDto;
import com.tyss.ess.requestdto.EducationalDetailsRequestDto;
import com.tyss.ess.requestdto.EmployeePersonalDetailsRequestDto;
import com.tyss.ess.requestdto.ExperienceDetailsRequestDto;
import com.tyss.ess.requestdto.FrontEndTechDetailsRequestDto;
import com.tyss.ess.requestdto.ProjectDetailsRequestDto;
import com.tyss.ess.requestdto.TechnicalDetailsRequestDto;
import com.tyss.ess.requestdto.TechnologyProjectDetailsRequestDto;
import com.tyss.ess.requestdto.ToolsTechDetailsRequestDto;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {

	@Autowired
	EmployeeDetailsDao employeeDetailsDao;

	@Override
	public EmployeePersonalDetailsRequestDto employeeDetails(
			EmployeePersonalDetailsRequestDto employeePersonalDetailsRequestDto) {

		EmployeePersonalDetailsDto employeePersonalDetailsDto = new EmployeePersonalDetailsDto();
		BeanUtils.copyProperties(employeePersonalDetailsRequestDto, employeePersonalDetailsDto);

		setEducationDetails(employeePersonalDetailsRequestDto.getEducationalDetails(), employeePersonalDetailsDto);
		setExperienceDetails(employeePersonalDetailsRequestDto.getExperienceDetails(), employeePersonalDetailsDto);
		setProjectDetails(employeePersonalDetailsRequestDto.getProjectDetails(), employeePersonalDetailsDto);
		setTechnicalDetailsDto(employeePersonalDetailsRequestDto.getTechnicalDetails(), employeePersonalDetailsDto);

		return employeeDetailsDao.employeedetails(employeePersonalDetailsDto);
	}

	private void setTechnicalDetailsDto(List<TechnicalDetailsRequestDto> technicalDetails,
			EmployeePersonalDetailsDto employeePersonalDetailsDto) {

		List<TechnicalDetailsDto> technicalDetailsList = new ArrayList<>();

		for (TechnicalDetailsRequestDto technicalDetailsRequestDto : technicalDetails) {

			TechnicalDetailsDto technicalDetailsDto = new TechnicalDetailsDto();
			List<FrontEndTechDetailsDto> frontEndTechDetailsDtoList = new ArrayList<>();

			for (FrontEndTechDetailsRequestDto frontEndTechDetailsRequestDtoList : technicalDetailsRequestDto
					.getFrontEndTechDetails()) {
				FrontEndTechDetailsDto frontEndTechDetailsDto = new FrontEndTechDetailsDto();

				BeanUtils.copyProperties(frontEndTechDetailsRequestDtoList, frontEndTechDetailsDto);
				frontEndTechDetailsDtoList.add(frontEndTechDetailsDto);
			}
			technicalDetailsDto.setFrontEndTechDetails(frontEndTechDetailsDtoList);

			List<BackEndTechDetailsDto> backEndTechDetailsDtoList = new ArrayList<>();

			for (BackEndTechDetailsRequestDto backEndTechDetailsRequestDtoList : technicalDetailsRequestDto
					.getBackEndTechDetails()) {
				BackEndTechDetailsDto backEndTechDetailsDto = new BackEndTechDetailsDto();

				BeanUtils.copyProperties(backEndTechDetailsRequestDtoList, backEndTechDetailsDto);
				backEndTechDetailsDtoList.add(backEndTechDetailsDto);
			}
			technicalDetailsDto.setBackEndTechDetails(backEndTechDetailsDtoList);

			List<DatabaseTechDetailsDto> databaseTechDetailsDtoList = new ArrayList<>();

			for (DatabaseTechDetailsRequestDto databaseTechDetailsRequestDtoList : technicalDetailsRequestDto
					.getDatabaseTechDetails()) {
				DatabaseTechDetailsDto databaseTechDetailsDto = new DatabaseTechDetailsDto();

				BeanUtils.copyProperties(databaseTechDetailsRequestDtoList, databaseTechDetailsDto);
				databaseTechDetailsDtoList.add(databaseTechDetailsDto);
			}
			technicalDetailsDto.setDatabaseTechDetails(databaseTechDetailsDtoList);

			List<ToolsTechDetailsDto> toolsTechDetailsDtoList = new ArrayList<>();

			for (ToolsTechDetailsRequestDto toolsTechDetailsRequestDtoList : technicalDetailsRequestDto
					.getToolsTechDetails()) {
				ToolsTechDetailsDto toolsTechDetailsDto = new ToolsTechDetailsDto();

				BeanUtils.copyProperties(toolsTechDetailsRequestDtoList, toolsTechDetailsDto);
				toolsTechDetailsDtoList.add(toolsTechDetailsDto);
			}
			technicalDetailsDto.setToolsTechDetails(toolsTechDetailsDtoList);

			BeanUtils.copyProperties(technicalDetailsRequestDto, technicalDetailsDto);
			technicalDetailsList.add(technicalDetailsDto);
		}

		employeePersonalDetailsDto.setTechnicalDetails(technicalDetailsList);
	}

	private void setProjectDetails(List<ProjectDetailsRequestDto> projectDetails,
			EmployeePersonalDetailsDto employeePersonalDetailsDto) {
		List<ProjectDetailsDto> projectDetailsList = new ArrayList<>();

		for (ProjectDetailsRequestDto projectDetailsRequestDto : projectDetails) {
			ProjectDetailsDto projectDetailsDto = new ProjectDetailsDto();

			List<TechnologyProjectDetailsDto> technologyProjectDetailsDtoList = new ArrayList<>();

			for (TechnologyProjectDetailsRequestDto technologyProjectDetailsRequestDto2 : projectDetailsRequestDto
					.getTechnologyProjectDetails()) {
				TechnologyProjectDetailsDto technologyProjectDetailsDto = new TechnologyProjectDetailsDto();
				BeanUtils.copyProperties(technologyProjectDetailsRequestDto2, technologyProjectDetailsDto);
				technologyProjectDetailsDtoList.add(technologyProjectDetailsDto);
			}
			projectDetailsDto.setTechnologyProjectDetails(technologyProjectDetailsDtoList);

			BeanUtils.copyProperties(projectDetailsRequestDto, projectDetailsDto);
			projectDetailsList.add(projectDetailsDto);
		}
		employeePersonalDetailsDto.setProjectDetails(projectDetailsList);

	}

	private void setExperienceDetails(List<ExperienceDetailsRequestDto> experienceDetails,
			EmployeePersonalDetailsDto employeePersonalDetailsDto) {
		List<ExperienceDetailsDto> experienceDetailsList = new ArrayList<>();

		for (ExperienceDetailsRequestDto experienceDetailsRequestDto : experienceDetails) {
			ExperienceDetailsDto experienceDetailsDto = new ExperienceDetailsDto();

			BeanUtils.copyProperties(experienceDetailsRequestDto, experienceDetailsDto);
			experienceDetailsList.add(experienceDetailsDto);
		}
		employeePersonalDetailsDto.setExperienceDetails(experienceDetailsList);

	}

	public void setEducationDetails(List<EducationalDetailsRequestDto> educationalDetails,
			EmployeePersonalDetailsDto employeePersonalDetailsDto) {

		List<EducationalDetailsDto> educationalDetailsList = new ArrayList<>();

		for (EducationalDetailsRequestDto educationalDetailsRequestDto : educationalDetails) {
			EducationalDetailsDto educationalDetailsDto = new EducationalDetailsDto();

			BeanUtils.copyProperties(educationalDetailsRequestDto, educationalDetailsDto);

			educationalDetailsList.add(educationalDetailsDto);
		}

		employeePersonalDetailsDto.setEducationalDetails(educationalDetailsList);

	}

	@Override
	public EmployeePersonalDetailsDto updateEmpDetails(String employeeId) {
		
		return employeeDetailsDao.updateEmpDetails(employeeId);
		
	}

}
