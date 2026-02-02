package com.example.pageable.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class DtoPersonel {

	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private DtoDepartment department;
}
