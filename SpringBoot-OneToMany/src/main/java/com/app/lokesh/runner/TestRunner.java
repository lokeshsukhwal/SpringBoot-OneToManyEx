package com.app.lokesh.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.entity.Cart;
import com.app.lokesh.entity.Items;
import com.app.lokesh.repository.CartRepository;
import com.app.lokesh.repository.ItemsRepository;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private CartRepository cRepository;
	@Autowired
	private ItemsRepository iRepository;

	@Override
	public void run(String... args) throws Exception {
		
		  Items i1 = new Items(23467946, "Mobile", 90000.0, 1);
		  Items i2 = new Items(41061632, "Charger", 2000.0, 1); 
		  Items i3 = new Items(97432064, "Headphone", 3500.0, 1); 
		  Items i4 = new Items(65162306, "Cover", 500.0, 1);
		  
		  iRepository.save(i1); 
		  iRepository.save(i2); 
		  iRepository.save(i3);
		  iRepository.save(i4);
		 

		Cart c1 = new Cart(23564641, "Cart-One", Arrays.asList(i1, i2, i3, i4));

		cRepository.save(c1);

		 
	}
}
