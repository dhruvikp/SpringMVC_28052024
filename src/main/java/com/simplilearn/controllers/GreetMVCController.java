package com.simplilearn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetMVCController {


	// STEP 1: Handles request
	@GetMapping("/greet")
	public String greeting(@RequestParam(name="name", required = false, defaultValue = "World!") String name , Model model) {
		
		// Step 2: Do business logic
		
		// STEP 3: Populate Model
		model.addAttribute("name", name);
		
		// Step 4: Invoke view
		
		return "hello";
	}
	
}
