package sg.ntu.edu.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController
@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

	// @GetMapping("/hello")
	// public String hello() {
	// return "Hello World!";
	// }

	// @GetMapping("/greet")
	// public String greet(@RequestParam(defaultValue = "World") String name,
	// @RequestParam(defaultValue = "unknown") String role) {
	// return "Hello " + name + "! You are a " + role + "!";
	// }

	// @GetMapping("/users/{id}")
	// public String getUser(@PathVariable int id) {
	// return "User ID: " + id;
	// }

	// // localhost:8081/products?search=apple
	// @GetMapping("/products")
	// public String getProductPage(@RequestParam(required = false) String search) {
	// if (search != null) {
	// return "You have searched for " + search;
	// } else {
	// return "This is the product page.";
	// }
	// }

}
