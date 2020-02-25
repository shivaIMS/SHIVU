package com.shiv.springmvcdev.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="YuluDB")
public class YuluDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="yulu_id")
	private int yulu_id;
	@Column(name="yuluNumber")
	private int yuluNumber;
	@Column(name="location")
	private String location;
	@Column(name="source")
	private String source;
	@Column(name="destination")
	private String destination;
	
	
	public int getYuluNumber() {
		return yuluNumber;
	}
	public void setYuluNumber(int yuluNumber) {
		this.yuluNumber = yuluNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public int getYulu_id() {
		return yulu_id;
	}
	public void setYulu_id(int yulu_id) {
		this.yulu_id = yulu_id;
	}
	@Override
	public String toString() {
		return "YuluDTO [yulu_id=" + yulu_id + ", yuluNumber=" + yuluNumber + ", location=" + location + ", source="
				+ source + ", destination=" + destination + ", getYuluNumber()=" + getYuluNumber() + ", getLocation()="
				+ getLocation() + ", getSource()=" + getSource() + ", getDestination()=" + getDestination()
				+ ", getYulu_id()=" + getYulu_id() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

	
	

}
