package com.shiv.springmvcdev.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;


@Entity
@Table(name="Hardware_data")
@NamedQuery(name="getListOfHardwareDetails", query="from Hardware")
public class Hardware implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="hardware_Id")
	private int hardware_Id;
	@Column(name ="hardware_name")
	private String name;
	@Column(name ="hardware_workers")
	private int workers;
	@Column(name ="hardware_loc")
	private String loc;
	
	
	public Hardware() {
		System.out.println("Created a class : " + this.getClass().getSimpleName() );
	}
	
	
	public int getHardware_Id() {
		return hardware_Id;
	}
	public void setHardware_Id(int hardware_Id) {
		this.hardware_Id = hardware_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWorkers() {
		return workers;
	}
	public void setWorkers(int workers) {
		this.workers = workers;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Hardware [hardware_Id=" + hardware_Id + ", name=" + name + ", workers=" + workers + ", loc=" + loc
				+ ", getHardware_Id()=" + getHardware_Id() + ", getName()=" + getName() + ", getWorkers()="
				+ getWorkers() + ", getLoc()=" + getLoc() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
