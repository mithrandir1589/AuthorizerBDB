package co.com.bancodebogota.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HtmlController {
	
	@GetMapping("/getHtml")
	public ModelAndView returnHtml() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("htmlPrueba");
		return modelAndView;
	}

}
