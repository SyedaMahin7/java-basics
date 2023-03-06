package com.xworkz.cricket.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.cricket.dto.CricketDTO;
import com.xworkz.cricket.service.CricketService;

@Controller
@RequestMapping("/")
public class CricketController {
	@Autowired
	private CricketService service;
	
	public CricketController() {
		System.out.println("Create:" + this.getClass().getSimpleName());
	}
	private List<String> iplteam = Arrays.asList("rcb", "csk", "kkr");
	@GetMapping("/cricket")
	public String onCall(Model model) {
		System.out.println("Running on call on get mapping");
		List<String> iplteam = Arrays.asList("rcb", "csk", "kkr");

		model.addAttribute("iplteam", iplteam);
		return "Cricket";
	}
	@PostMapping("/cricket")
	public String onCall(CricketDTO dto, Model model) {
		System.out.println("Running on call on post mapping");

		Set<ConstraintViolation<CricketDTO>> violations = this.service.validateAndSave(dto);

		if (violations.isEmpty()) {
			System.out.println("There is no violation in dto save in sucess page");
			model.addAttribute("name", dto.getName());
			model.addAttribute("country", dto.getCountry());
			model.addAttribute("iplteam", dto.getIplteam());
			model.addAttribute("runs", dto.getRuns());
			model.addAttribute("since", dto.getSince());
			return "Cricket";
		} else {
			model.addAttribute("iplteam",iplteam);
			model.addAttribute("dto", dto);

			model.addAttribute("error", violations);
			System.err.println("Violation in data....");
			return "Cricket";
		}
		

	}
	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {

		System.out.println("Running on call in controller");
		CricketDTO dto = this.service.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Id  not found, please give valid Id");
		}
		return "Search";
	}
	@GetMapping("/findByName")
	public String onFindByName(@RequestParam String name, Model model) {
		System.out.println("Running find By name in Controller:" + name);
		List<CricketDTO> dto = this.service.findByName(name);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("messege", "Name not found");
		}
		return "FindByName";
	}
	
	@GetMapping("/update")
	public String onupdate(@RequestParam int id,Model model) {
		System.out.println("Running onupdate..");
		CricketDTO dto=this.service.findById(id);
		model.addAttribute("dto", dto);
		model.addAttribute("iplteam",iplteam);
		return "Update";
	}
	@PostMapping("/update")
	public String onUpdate(CricketDTO dto,Model model) {
		System.out.println("Running onUpdate...");
			Set<ConstraintViolation<CricketDTO>> contraintViolations=
						this.service.validateAndSave(dto);
		if(contraintViolations.size()>0) {
			model.addAttribute("errors", contraintViolations);
			
		}else {
			model.addAttribute("message", "Crecket  update success...");
		}
		return "Update";
	}
	
	@GetMapping("/delete")
	public String OnDelete(@RequestParam int id,Model model) {
		System.out.println("Running  findbyname in controller:"+id);
		CricketDTO dto=this.service.deleteById(id);
		if(dto==null) {
			model.addAttribute("id", id);
			model.addAttribute("message","Delete Successfully");
		}else {
			model.addAttribute("error", "Name not found");
		}
		return "delete";
		
	}
	

	

}
