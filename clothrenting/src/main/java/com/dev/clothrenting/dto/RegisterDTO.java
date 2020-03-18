package com.dev.clothrenting.dto;

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


@Getter
@Setter
@AllArgsConstructor
@Slf4j
public class RegisterDTO implements Serializable {


	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private String companyName;

	private String email;
	private String phoneNumber;
	private String landMark;
	private String city;
	private String state;
	private String street;
	private String password;
	private String address;

	public RegisterDTO() {
		log.info("Inside a constructor RegisterDTO ...!!!");
	}

	@Override
	public String toString() {
		return "RegisterDTO [firstName=" + firstName + ", lastName=" + lastName + ", companyName=" + companyName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", landMark=" + landMark + ", city=" + city
				+ ", state=" + state + ", street=" + street + ", password=" + password + ", address=" + address + "]";
	}

	

	
}
