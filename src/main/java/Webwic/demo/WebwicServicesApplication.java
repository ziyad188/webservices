package Webwic.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebwicServicesApplication {
	@GetMapping("/message")
	public String message(){
		return "yooho jaich!";
	}

	public static void main(String[] args) {
		SpringApplication.run(WebwicServicesApplication.class, args);
	}

}
