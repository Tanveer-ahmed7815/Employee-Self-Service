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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "frontend_tech_details")
public class FrontEndTechDetailsDto {
	
	@Id
	@Column(name = "front_end_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int frontEndId;

	@Column(name = "technical_skills")
	private String technicalSkills;

	@Column(name = "ratings")
	private String ratings;

	public FrontEndTechDetailsDto(String technicalSkills, String ratings) {
		super();
		this.technicalSkills = technicalSkills;
		this.ratings = ratings;
	}
	
	
}
