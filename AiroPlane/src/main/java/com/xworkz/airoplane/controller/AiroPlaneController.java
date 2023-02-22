package com.xworkz.airoplane.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.airoplane.dto.AiroPlaneDTO;
import com.xworkz.airoplane.entity.AiroPlaneEntity;
import com.xworkz.airoplane.repo.AiroPlaneRepo;
import com.xworkz.airoplane.service.AiroPlaneService;
@Controller
@RequestMapping("/")
public class AiroPlaneController {
	@Autowired
	private AiroPlaneService aeroplaneService;

	private List<String> type = Arrays.asList("Business jet", "Cargo aircraft", "Glider", "Airliner",
			"Fighter aircraft", "Airbus A330");
	private List<String> country = Arrays.asList("India", "Australia", "England", "America", "Uganda", "Pakistan",
			"New zealand");

	public AiroPlaneController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/aeroplane")
	public String onAeroplane(Model model) {
		System.out.println("Running onAeroplane Get method");
		List<String> type = Arrays.asList("Business jet", "Cargo aircraft", "Glider", "Airliner", "Fighter aircraft",
				"Airbus A330");
		List<String> country = Arrays.asList("India", "Australia", "England", "America", "Uganda", "Pakistan",
				"New zealand");
		model.addAttribute("type", type);
		model.addAttribute("country", country);
		return "Register";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) 
	{
		System.out.println("Running on search for id " + id);
		AiroPlaneDTO dto = this.aeroplaneService.findById(id);
		if (dto != null) 
		{
			model.addAttribute("dto", dto);
		} 
		else 
		{
			model.addAttribute("message", "Data not found");
		}
		return "AiroplaneSearch";
	}

	@PostMapping("/aeroplane")
	public String onAeroplane(Model model, AiroPlaneDTO dto) {
		System.out.println("Running onAeroplane Post method " + dto);
		Set<ConstraintViolation<AiroPlaneDTO>> violations = this.aeroplaneService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No violations in controller go to success page");
			return "Register";
		}
		model.addAttribute("type", type);
		model.addAttribute("country", country);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.err.println("Violations in controller");
		return "Register";
	}
}