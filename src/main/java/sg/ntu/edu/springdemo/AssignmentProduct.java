package sg.ntu.edu.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class AssignmentProduct {

  @GetMapping("/{productId}")
  public String getProductDetail(@PathVariable int productId) {
    String response = "";

    switch (productId) {
      case 1:
        response = "This is detail for ID: " + productId + "\nProduct Name: Apple";
        break;
      case 2:
        response = "This is detail for ID: " + productId + "\nProduct Name: Banana";
        break;
      case 3:
        response = "This is detail for ID: " + productId + "\nProduct Name: Carrot";
        break;
      default:
        response = "No product found";
    }

    return response;
  }
}
