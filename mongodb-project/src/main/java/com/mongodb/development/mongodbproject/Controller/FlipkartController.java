package com.mongodb.development.mongodbproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.development.mongodbproject.model.User;
import com.mongodb.development.mongodbproject.repository.FlipcartRepository;

@RestController
@RequestMapping("/orders-service")
public class FlipkartController {

	@Autowired
	private FlipcartRepository repository;
	

	@PostMapping("/placeOrderNow")
	public String placeOrder(@RequestBody User user) {
		repository.save(user);
		return "Order placed successfully...!!!";
	}

	@GetMapping("/getUserByName/{name}")
	public List<User> getUserbyName(@PathVariable String name) {
		return repository.findByName(name);
	}

	@GetMapping("/getUserByCity/{city}")
	public List<User> getUserbyCity(@PathVariable String city) {
		return repository.findByCity(city);
	}

}
