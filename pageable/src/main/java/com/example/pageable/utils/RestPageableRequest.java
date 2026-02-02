package com.example.pageable.utils;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class RestPageableRequest {

	private int pageNumber;
	
	private int pageSize;
	
	private String columnName;
	
	private boolean asc;
}
