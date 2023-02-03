package com.xworkz.goa.controlled;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.Casino;

@Component
@RequestMapping("/casino")
public class CasinoComponet {
	public CasinoComponet() {
		System.out.println("created" + this.getClass().getSimpleName());
	}
	@PostMapping
	public String onCasino(Casino dto, Model model) {
		System.out.println(" casino method is running");
		model.addAttribute("name", dto.getName());
		model.addAttribute("fees", dto.getEntryfees());
		model.addAttribute("cruise", dto.getCruise());
		model.addAttribute("alcohal", dto.getAlcohol());
		model.addAttribute("free", dto.getFree());
		System.out.println("dto"+ dto);
		return "CasinoSucessfulljsp.jsp";
		
		
	}

}
