package com.example.pageable.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pageable.controller.IRestPersonelController;
import com.example.pageable.dto.DtoPersonel;
import com.example.pageable.model.Personel;
import com.example.pageable.service.IPersonelService;
import com.example.pageable.utils.RestPageableEntity;
import com.example.pageable.utils.RestPageableRequest;
import com.example.pageable.utils.RestRootEntity;

@RestController
@RequestMapping("/pageable/personel")
public class RestPersonelControllerImpl extends RestBaseController implements IRestPersonelController{
	
	@Autowired
	private IPersonelService personelService;
	
	@GetMapping("/findAll")
	@Override
	public RestRootEntity<RestPageableEntity<DtoPersonel>> findAllPageable(@ModelAttribute RestPageableRequest pageable) {
		Page<Personel> page= personelService.findAllPageable(toPageable(pageable));
		 RestPageableEntity<DtoPersonel> pageableResponse = toPageableResponse(page, personelService.toDTOList(page.getContent()));
		 return ok(pageableResponse);
	}

}
