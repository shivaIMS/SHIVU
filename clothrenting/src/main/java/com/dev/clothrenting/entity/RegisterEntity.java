package com.dev.clothrenting.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.slf4j.LoggerFactory;

import com.sun.media.jfxmedia.logging.Logger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Entity
@Table(name = "registration")
@Getter
@Setter
@AllArgsConstructor
@Slf4j
public class RegisterEntity implements Serializable {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(RegisterEntity.class);

	private static final long serialVersionUID = 1L;

	@Column(name = "fname")
	private String firstName;
	@Column(name = "lname")
	private String lastName;
	@Column(name = "company_name")
	private String companyName;

	@Id
	@Column(name = "email")
	private String email;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "land_mark")
	private String landMark;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "street")
	private String street;
	@Column(name = "password")
	private String password;
	@Column(name = "address")
	private String address;

	public RegisterEntity() {
		log.info("Inside a constructor RegisterDTO ...!!!");
	}

	@Override
	public String toString() {
		return "RegisterDTO [firstName=" + firstName + ", lastName=" + lastName + ", companyName=" + companyName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", landMark=" + landMark + ", city=" + city
				+ ", state=" + state + ", street=" + street + ", password=" + password + ", address=" + address + "]";
	}

	

	
}
