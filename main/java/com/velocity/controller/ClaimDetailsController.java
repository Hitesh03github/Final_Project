package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.ClaimDetails;
import com.velocity.service.ClaimDetailsService;


@RestController
public class ClaimDetailsController {

	// inject service
	@Autowired
	private ClaimDetailsService claimDetailsService;

	
	@GetMapping("/fetch/{id}")
	public ResponseEntity<ClaimDetails> getClaimDetailsById(@PathVariable("id") Integer id) { 
		// calling method
		ClaimDetails cd = claimDetailsService.getClaimDetailsById(id); 
		return ResponseEntity.ok().body(cd);
	}

}
