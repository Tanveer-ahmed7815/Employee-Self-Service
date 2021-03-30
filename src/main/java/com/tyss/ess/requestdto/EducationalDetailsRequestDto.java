package com.tyss.ess.requestdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EducationalDetailsRequestDto {

	private int eductaionDetailsId;

	private String highestQualification;

	private String courses;

	private String specialization;

	private String institutionName;

	private int passoutYear;

	private double percentage;

}
