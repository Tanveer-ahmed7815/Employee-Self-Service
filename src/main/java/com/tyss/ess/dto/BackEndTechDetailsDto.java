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
@Table(name = "back_end_details")
public class BackEndTechDetailsDto {
	
	@Id
	@Column(name = "back_end_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int backEndId;

	@Column(name = "technical_skills")
	private String technicalSkills;

	@Column(name = "ratings")
	private String ratings;

	public BackEndTechDetailsDto(String technicalSkills, String ratings) {
		super();
		this.technicalSkills = technicalSkills;
		this.ratings = ratings;
	}
	
	
}
