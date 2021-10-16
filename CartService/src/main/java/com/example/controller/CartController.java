package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.dao.ProductProfile;
import com.example.user.ItemsProfile;


@RestController
@RequestMapping("/all")
public class CartController {
	@Autowired
	 RestTemplate restTemplate;
	
	@GetMapping("/cart")
    public List<ProductProfile> getAllProfiles(){
        return Arrays.asList(restTemplate.getForObject("http://PRODUCT/product/all",ProductProfile[].class));
    }

}
