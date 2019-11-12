package com.mynotes.spring.cloud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mynotes.spring.cloud.service.repository.ProductRepository;

@RestController
public class RecommendationServiceRestController {

	
	@Autowired
	private ProductRepository productRepo;
	

    public RecommendationServiceRestController(ProductRepository productRepo) {
		super();
		this.productRepo = productRepo;
	}


	@RequestMapping(value = "/recommendations", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> getCurrentOffers() {
        return productRepo.findAll();
    }
	
	@RequestMapping(value = "/recommendations", method = RequestMethod.POST)
    @ResponseBody
    public void setCurrentOffers(@RequestBody Product product) {
        productRepo.save(product);
    }


}
