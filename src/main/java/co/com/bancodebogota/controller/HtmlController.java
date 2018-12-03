package co.com.bancodebogota.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import co.com.bancodebogota.services.LibrariesService;

@RestController
public class HtmlController {
	
	@Autowired
	private LibrariesService librariesService;
	
	@GetMapping("/getHtml")
	public ModelAndView returnHtml() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("htmlPrueba");
		return modelAndView;
	}
	
	@GetMapping("/getLibraries")
	public ArrayList<String> returnLibraries(){
		return librariesService.getLibraries();
	}

}
