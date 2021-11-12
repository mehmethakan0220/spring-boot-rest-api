package com.staj.springbootapp.apiRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductsApi {

	@PostMapping("/add")
	public String add() {
		return "Eklendi";
	}
	
	@PostMapping("/update")
	public String update() {
		return "Guncelllendi";
	}
	
	@PostMapping("/delete")
	public String delete() {
		return "Silindi";
	}
	
	@GetMapping("/products")
	public String get() {
		return "Ornek Urun 1";
	}
}
