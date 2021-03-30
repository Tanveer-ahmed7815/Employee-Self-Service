package com.tyss.ess.requestdto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechnicalDetailsRequestDto {

	private int technicalDetailsId;

	private List<FrontEndTechDetailsRequestDto> frontEndTechDetails;

	private List<BackEndTechDetailsRequestDto> backEndTechDetails;

	private List<DatabaseTechDetailsRequestDto> databaseTechDetails;

	private List<ToolsTechDetailsRequestDto> toolsTechDetails;

}
