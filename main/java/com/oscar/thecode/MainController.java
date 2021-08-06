package com.oscar.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index() {
		return "home.jsp";
	}
	
	@RequestMapping(value="/guessCode", method=RequestMethod.POST)
	public String guessCode(@RequestParam(value="code") String code) {
		if(code.equals("bushido")) {
			return "code.jsp";
		} else {
			return "redirect:/wrongCode";
		}
	}
	
	@RequestMapping("/wrongCode")
	public String flashMessages(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "You must train harder!");
		return "redirect:/";
	}
}
