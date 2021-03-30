package com.tyss.ess.requestdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class BackEndTechDetailsRequestDto {

	private int backEndId;

	private String technicalSkills;

	private String ratings;

}
