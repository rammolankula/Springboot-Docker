package ram.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDockerTest {
	
	
	@GetMapping("/Tesr")
	public String Test() {
		return "Hello Ram";
		
	}

}
