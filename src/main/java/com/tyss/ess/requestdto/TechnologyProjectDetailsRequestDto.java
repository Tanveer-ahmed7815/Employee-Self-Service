package com.tyss.ess.requestdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TechnologyProjectDetailsRequestDto {

	private int technologyDetailsId;

	private String technologyUsed;

}
