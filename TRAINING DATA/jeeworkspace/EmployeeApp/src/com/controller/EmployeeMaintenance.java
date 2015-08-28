package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeMaintenance {
	@RequestMapping(value = "/welcome.htm", method = RequestMethod.POST)
	String addBean(@ModelAttribute Employee empl, ModelMap modelMap) {
		modelMap.addAttribute("empl", empl);
		return "addedbean";
	}
}
