package com.bs;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@Autowired
	private SurgeonService service;
	static Logger logger =  LoggerFactory.getLogger(MyController.class);
	
	
	// 1. to load form page with empty object
	@GetMapping("/formPage")
	public ModelAndView getSurgeonFormPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("SurgenForm");
		model.addObject("surgenObject", new SurgeonDetails());
		return model;
	}

	// 2. take data from jsp, convert to method object
	@PostMapping("/addSurgen")
	public ModelAndView saveSurgen(@ModelAttribute("surgenObject") SurgeonDetails surgeObject) {
		ModelAndView model = new ModelAndView();
		//call service-> dao to save object
		SurgeonDetails savedSurgeon = service.addSurgeon(surgeObject);
		model.addObject("successMessage", "Surgeon saved with Id="+savedSurgeon.getSurgeonId());
		model.setViewName("SurgenForm");
		return model;
	}

	// 3. load page where all record will come and we have to send list<Surgeon> as
	// model to that page

	@GetMapping("/loadAll")
	public ModelAndView loadAll() {
		logger.debug("=====================");
		// get whole records service-> dao
		List<SurgeonDetails> list =service.getAllSurgeon();
		//create ModelAndView obj
		ModelAndView model = new ModelAndView();
		//send list as model to show in jsp page
		model.addObject("surgeons", list);
		//set view name
		model.setViewName("ShowSurgeons");
		return model;
	}
	@GetMapping("/editById/{id}")
	public ModelAndView editById(@PathVariable("id") int surgeonId) {
		//get surgen from service-> dao
		SurgeonDetails existedSurgeon=service.getSurgeonById(surgeonId);
		ModelAndView model = new ModelAndView();
		//send list as model to show in jsp page
		model.addObject("surgeonDetails", existedSurgeon);
		//set view name
		model.setViewName("UpdateSurgenPage");
		return model;
	}
	
	@PostMapping("/updateSurgen")
	public ModelAndView updateSurgen(@ModelAttribute("surgenObject") SurgeonDetails surgeObject) {
		//call service method to update object
		SurgeonDetails updatedSurgeon = service.updateSurgeon(surgeObject);
		ModelAndView model = new ModelAndView();
		//set view name
		model.setViewName("redirect:/loadAll");
		return model;
	}
	
	@GetMapping("/deleteById/{id}")
	public ModelAndView deleteById(@PathVariable("id") int surgeonId) {
		//get surgen from service-> dao
		String message = service.deleteSurgeonById(surgeonId);
		ModelAndView model = new ModelAndView();
		//send list as model to show in jsp page
		//set view name
		model.setViewName("redirect:/loadAll");
		return model;
	}
	
}
