package com.example.pageable.controller.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.pageable.utils.PagerUtil;
import com.example.pageable.utils.RestPageableEntity;
import com.example.pageable.utils.RestPageableRequest;
import com.example.pageable.utils.RestRootEntity;

public class RestBaseController {

	public Pageable toPageable(RestPageableRequest request) {
		return PagerUtil.toPageable(request);
	}
	
	public <T> RestPageableEntity<T> toPageableResponse(Page<?> page , List<T> content) {
		return PagerUtil.toPageableResponse(page, content);
	}
	
	public <T> RestRootEntity<T> ok(T payload){
		return RestRootEntity.ok(payload);
	}
}
