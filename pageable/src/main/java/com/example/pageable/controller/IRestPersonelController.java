package com.example.pageable.controller;

import com.example.pageable.dto.DtoPersonel;
import com.example.pageable.utils.RestPageableEntity;
import com.example.pageable.utils.RestPageableRequest;
import com.example.pageable.utils.RestRootEntity;

public interface IRestPersonelController {

	public RestRootEntity<RestPageableEntity<DtoPersonel>> findAllPageable(RestPageableRequest pageableRequest);
}
