package com.tyss.ess.requestdto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExperienceDetailsRequestDto {

	private int experienceDetailsId;

	private String designation;

	private String company;

	@JsonFormat(pattern = "yyyy/mm")
	private Date startDate;

	@JsonFormat(pattern = "DD/MM/YYYY")
	private Date presentDate;

	private String city;

	private int durationNoticePeriod;

	private String totalExperience;

	private String releventExperience;

}
