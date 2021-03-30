package com.tyss.ess.requestdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FrontEndTechDetailsRequestDto {

	private int frontEndId;

	private String technicalSkills;

	private String ratings;

}
