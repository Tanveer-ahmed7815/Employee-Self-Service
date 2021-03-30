package com.tyss.ess.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "technical_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechnicalDetailsDto {

	@Id
	@Column(name = "technical_details_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int technicalDetailsId;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "technical_details_id", referencedColumnName = "technical_details_id")
	private List<FrontEndTechDetailsDto> frontEndTechDetails;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "technical_details_id", referencedColumnName = "technical_details_id")
	private List<BackEndTechDetailsDto> backEndTechDetails;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "technical_details_id", referencedColumnName = "technical_details_id")
	private List<DatabaseTechDetailsDto> databaseTechDetails;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "technical_details_id", referencedColumnName = "technical_details_id")
	private List<ToolsTechDetailsDto> toolsTechDetails;

}
