package com.mongodb.development.mongodbproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

	private String name;
	private int Quantity;
	private int price;
}
