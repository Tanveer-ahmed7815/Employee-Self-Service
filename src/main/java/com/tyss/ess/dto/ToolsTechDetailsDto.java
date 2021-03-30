package com.tyss.ess.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tools_tech_details")
public class ToolsTechDetailsDto {
	
	@Id
	@Column(name = "tools_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int toolsId;

	@Column(name = "technical_skills")
	private String technicalSkills;

	@Column(name = "ratings")
	private String ratings;

	public ToolsTechDetailsDto(String technicalSkills, String ratings) {
		super();
		this.technicalSkills = technicalSkills;
		this.ratings = ratings;
	}
	
	
}
