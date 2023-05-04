package com.example.demo.PetService;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.PetModel.PetDetails;
import com.example.demo.PetRepository.PetMappingRepository;
import com.example.demo.PetRepository.PetRepo;

@Service
public class PetServes {
	@Autowired
	PetRepo ss_repo;
	@Autowired
	PetMappingRepository ss_Mapping;
	public String addSS(PetDetails ss_model)
	{
		ss_repo.save(ss_model);
		return "Added!";
	}
	public List<PetDetails> getSS()
	{
		return ss_repo.findAll();
	}
	public Optional<PetDetails> getSSById(int id)
	{
		return ss_repo.findById(id);
	}
	public String updateSS(PetDetails ss_model)
	{
		ss_repo.save(ss_model);
		return "Updated!";
	}
	public String deleteByRequestParamId(int sign_no)
	{
		ss_repo.deleteById(sign_no);
		return "Deleted!";
	}
	public String checkLogin(String uname, String pwd){
		PetDetails user = ss_repo.findByuname(uname);
		if(user == null) {
			return "no user found";
		}
		else {
			if(user.getPwd().equals(pwd)) {
				return"Login Succesfull";
			}
			else 
			{
				return "Login Failed";
			}
		}
	}
	public PetDetails addUser(PetDetails game) {
		return ss_repo.save(game);
	}
	public List<PetDetails> getUser(){
		return ss_repo.findAll();
	}
	//sorting
	public List<PetDetails>sort(String field)
	{
		return ss_repo.findAll(Sort.by(Sort.Direction.ASC, field));
	}
	//pagination
	public List<PetDetails>paging( int offset,int pagesize)
	{
		Page<PetDetails> page=ss_repo.findAll(PageRequest.of(offset,  pagesize));
		return page.getContent();
	}
}