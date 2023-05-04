package com.example.demo.PetRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.PetModel.PetDetails;

@Repository
public interface PetRepo extends JpaRepository<PetDetails,Integer>
{
	PetDetails findByuname(String uname);	
}