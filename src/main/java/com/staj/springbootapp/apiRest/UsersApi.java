package com.staj.springbootapp.apiRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user") //ana path
public class UsersApi {
	
	@PostMapping("/add")// alt path kullanici /user/add linkine post istegi yaparsa calisacaktir.
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
	
	@GetMapping("/users")
	public String get() {
		return "Ornek Kullanici 1";
	}
}
