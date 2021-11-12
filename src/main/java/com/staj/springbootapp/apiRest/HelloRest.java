package com.staj.springbootapp.apiRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//RestApi olarak calisacak sinifin ustune @RestController Annotationu yapili.
@RestController
public class HelloRest {

	//Router bilgisi burada fonksiyona ozel girilir. Yani / pathinde home() fonksiyonu calissin demek.
	@GetMapping("/")
	public String home() {
		return "HOME";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "Iletisim Sayfasi";
	}
	
	@GetMapping("/products")
	public String products() {
		return "Urunler Sayfasi";
	}
	
	@GetMapping("/users")
	public String users() {
		return "Kullanicilar Sayfasi";
	}
}
