package com.tyss.ess.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "experience_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExperienceDetailsDto implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "experience_details_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int experienceDetailsId;

	@Column(name = "designation")
	private String designation;

	@Column(name = "company")
	private String company;

	@Column(name = "start_date")
	@JsonFormat(pattern = "yyyy/mm")
	private Date startDate;

	@Column(name = "present_date")
	@JsonFormat(pattern = "DD/MM/YYYY")
	private Date presentDate;

	@Column(name = "city")
	private String city;

	@Column(name = "duration_notice_period")
	private int durationNoticePeriod;
	
	@Column(name="total_experience")
	private String totalExperience;
	
	@Column(name="relevent_experience")
	private String releventExperience;


}
