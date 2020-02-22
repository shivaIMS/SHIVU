package com.regular.hospitals.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hospital_detail")
public class HosptialDetailsDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="hospital_id")
	private int hospital_id;
	@Column(name="hospital_name")
	private String hospital_name;
	@Column(name="hospital_location")
	private String hospital_location;
	@Column(name="number_hospitals")
	private int number_hospitals;
	
	
	public int getHospital_id() {
		return hospital_id;
	}
	public void setHospital_id(int hospital_id) {
		this.hospital_id = hospital_id;
	}
	public String getHospital_name() {
		return hospital_name;
	}
	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}
	public String getHospital_location() {
		return hospital_location;
	}
	public void setHospital_location(String hospital_location) {
		this.hospital_location = hospital_location;
	}
	public int getNumber_hospitals() {
		return number_hospitals;
	}
	public void setNumber_hospitals(int number_hospitals) {
		this.number_hospitals = number_hospitals;
	}
	
	@Override
	public String toString() {
		return "HosptialDetailsDTO [hospital_id=" + hospital_id + ", hospital_name=" + hospital_name
				+ ", hospital_location=" + hospital_location + ", number_hospitals=" + number_hospitals + "]";
	}

}
