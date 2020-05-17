package com.mongodb.development.mongodbproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
	private String city;
	private String state;
	private int pincode;
}
