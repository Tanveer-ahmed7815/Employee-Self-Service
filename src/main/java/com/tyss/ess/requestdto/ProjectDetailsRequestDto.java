package com.tyss.ess.requestdto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDetailsRequestDto {

	private int projectDetailsId;

	private String projectName;

	private List<TechnologyProjectDetailsRequestDto> technologyProjectDetails;

	private String projectSummary;

	private String rolesAndResponsibility;

}
