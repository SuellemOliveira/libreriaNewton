package com.libreriaNewton.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.libreriaNewton.entity.Libreria;
import com.libreriaNewton.service.LibreriaService;



@Controller
public class LibreriaNewtonController {

	@Autowired
	private LibreriaService service;
	
	@GetMapping("/")
	public String home() {
		return "home";
}
	@GetMapping("/aggiungere_libro")
	public String aggiungereLibro () {
		return "aggiungereLibro";
}
	
	@GetMapping("/libri_disponibili")
	public ModelAndView getAllBook() {
		List<Libreria> list= service.getAllBook();
		//ModelAndView m= new ModelAndView();
	    //m.setViewName("libriDisponibili");
	   //m.addObject("book",list);
		return new ModelAndView("libriDisponibili","book",list);
}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Libreria b) {
		service.save(b);
		return "redirect:/libri_disponibili";
	
}
	
	@RequestMapping("/deleteList/{id}")
	public String deleteList(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/libri_disponibili";
	
	}
	
	@RequestMapping("/libroEdit/{id}")
	public String libroEdit(@PathVariable("id") int id, Model model) {
		Libreria b=service.getBookById(id);
		model.addAttribute("book",b);	
		return "libroEdit";
	}
	}
	
