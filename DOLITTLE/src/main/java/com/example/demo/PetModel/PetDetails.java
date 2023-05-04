package com.example.demo.PetModel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class PetDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private String breed;
	private int age;
	private String features;
	private int price;
	private int avgheight;
	private int avgweight;
	private String breedgroup;
	private String areaoforigin;
	private String othernames;
	@Column(unique = true)
	private String uname;
	private String pwd;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PetMappingModel_id")
	private PetMappingModel pmmodel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAvgheight() {
		return avgheight;
	}
	public void setAvgheight(int avgheight) {
		this.avgheight = avgheight;
	}
	public int getAvgweight() {
		return avgweight;
	}
	public void setAvgweight(int avgweight) {
		this.avgweight = avgweight;
	}
	public String getBreedgroup() {
		return breedgroup;
	}
	public void setBreedgroup(String breedgroup) {
		this.breedgroup = breedgroup;
	}
	public String getAreaoforigin() {
		return areaoforigin;
	}
	public void setAreaoforigin(String areaoforigin) {
		this.areaoforigin = areaoforigin;
	}
	public String getOthernames() {
		return othernames;
	}
	public void setOthernames(String othernames) {
		this.othernames = othernames;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public PetMappingModel getPmmodel() {
		return pmmodel;
	}
	public void setPmmodel(PetMappingModel pmmodel) {
		this.pmmodel = pmmodel;
	}
	public PetDetails() {
		super();
	}
	@Override
	public String toString() {
		return "PetDetails [id=" + id + ", Name=" + Name + ", breed=" + breed + ", age=" + age + ", features="
				+ features + ", price=" + price + ", avgheight=" + avgheight + ", avgweight=" + avgweight
				+ ", breedgroup=" + breedgroup + ", areaoforigin=" + areaoforigin + ", othernames=" + othernames
				+ ", uname=" + uname + ", pwd=" + pwd + ", pmmodel=" + pmmodel + "]";
	}
	
}
	