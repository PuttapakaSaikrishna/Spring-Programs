package com.sai;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springModel.Alien;

@Controller
public class HomeController {

	@RequestMapping("/") 
	public String home() {
		return "index";
	}

	//-----> Model and View
	
//	@RequestMapping("add") 
//	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("Result");
//		int num3 = i + j;
//		mv.addObject("num3", num3);
//		return mv;
//	}
	
	//---->Model 
	
//	@RequestMapping("add") 
//	public String sub(@RequestParam("num1") int i, @RequestParam("num2") int j, Model mv) {
//		int num3 = i+ j;
//		mv.addAttribute("num3", num3);
//		return "Result";
//	}
	
	//---->  Model map
	@RequestMapping("add") 
	public String sub(@RequestParam("num1") int i, @RequestParam("num2") int j, ModelMap mv) {
		int num3 = i+ j;
		mv.addAttribute("num3", num3);
		return "Result";

	}
	
	//--->Model Attribute
	
//	@RequestMapping("addAlien")
//	public String addAlien(@ModelAttribute Alien a ) {
//		return "Result";
//		
//	}
}
