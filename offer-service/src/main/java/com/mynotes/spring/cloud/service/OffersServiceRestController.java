package com.mynotes.spring.cloud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mynotes.spring.cloud.service.repository.OffersRepository;

@RestController
public class OffersServiceRestController {

	
	@Autowired
	private OffersRepository offersRepo;
	
	public OffersServiceRestController(OffersRepository offersRepo) {
		super();
		this.offersRepo = offersRepo;
	}

	@RequestMapping(value = "/getCurrentOffers", method = RequestMethod.GET)
	@ResponseBody
	public List<Offers> getCurrentOffers() {
		return offersRepo.findAll();
	}

}
