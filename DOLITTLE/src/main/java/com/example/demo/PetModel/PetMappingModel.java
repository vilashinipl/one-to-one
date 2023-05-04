package com.example.demo.PetModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PetMappingModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String gender;
	private String food;
	private int saledate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFood() {
		return food;	
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getSaledate() {
		return saledate;
	}
	public void setSaledate(int saledate) {
		this.saledate = saledate;
	}

	@Override
	public String toString() {
		return "PetMappingModel [id=" + id + ", gender=" + gender + ", food=" + food + ", saledate=" + saledate + "]";
	}
	
}
