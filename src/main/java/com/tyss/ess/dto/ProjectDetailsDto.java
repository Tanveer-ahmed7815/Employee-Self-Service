package com.tyss.ess.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "project_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDetailsDto {

	@Id
	@Column(name = "project_details_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectDetailsId;

	@Column(name = "project_name")
	private String projectName;

	@OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name = "project_details_id", referencedColumnName = "project_details_id")
	private List<TechnologyProjectDetailsDto> technologyProjectDetails;

	@Column(name = "project_summary")
	private String projectSummary;

	@Column(name = "roles_and_responsibility")
	private String rolesAndResponsibility;

	public ProjectDetailsDto(String projectName, List<TechnologyProjectDetailsDto> technologyProjectDetails,
			String projectSummary, String rolesAndResponsibility) {
		super();
		this.projectName = projectName;
		this.technologyProjectDetails = technologyProjectDetails;
		this.projectSummary = projectSummary;
		this.rolesAndResponsibility = rolesAndResponsibility;
	}

	

	

	
}
