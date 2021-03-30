package com.tyss.ess.requestdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DatabaseTechDetailsRequestDto {

	private int databaseId;

	private String technicalSkills;

	private String ratings;

}
