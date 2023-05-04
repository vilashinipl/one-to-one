package com.example.demo.PetRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.PetModel.PetMappingModel;

@Repository

public interface PetMappingRepository extends JpaRepository<PetMappingModel, Integer>
{

}
