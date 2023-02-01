package com.xworkz.food.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Component
@RequestMapping("/send")
public class FoodComponenet {
	public FoodComponenet() {
		System.out.println("creating" + this.getClass().getSimpleName());
	}
	@PostMapping
	public String onSend(@RequestParam String name ,@RequestParam String type,@RequestParam int quantity,@RequestParam double price ) 
	{
		System.out.println("running onSend post");
		System.out.println("name"+name);
		System.out.println("type"+type);
		System.out.println("Quantity"+quantity);
		System.out.println("price"+price);
	return "FoodIteam.jsp";	

}
}
