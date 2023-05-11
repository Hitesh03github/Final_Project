package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.ClaimDetails;


@Repository
public interface ClaimDetailsRepository extends CrudRepository<ClaimDetails,Serializable>{

	public ClaimDetails findById(Integer id);
}
