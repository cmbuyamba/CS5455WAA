package edu.mum.controller;

import java.io.File;
import java.io.FileNotFoundException;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import edu.mum.domain.Employee;

@org.springframework.stereotype.Controller

public class EmployeeController {
	
	@Autowired
	ServletContext servletContext;

	private static final Log logger = LogFactory.getLog(EmployeeController.class);
		
	@RequestMapping(value={ "employee_input"}, method = RequestMethod.GET)
	public String inputEmployee(@ModelAttribute("employee") Employee employee) {
		return "EmployeeForm";
	}

	@RequestMapping(value="/employee_save", method = RequestMethod.POST)
	public String saveEmployee(@Valid @ModelAttribute("employee")  Employee employee, BindingResult bindingResult,
			Model model) throws FileNotFoundException {
 		
		if (bindingResult.hasErrors()) {
			return "EmployeeForm";
		}
		
 			MultipartFile image = employee.getImage();
	 		String rootDirectory = servletContext.getRealPath("/");
	 			
			//isEmpty means file exists BUT NO Content
				if (image!=null && !image.isEmpty()) {
			       try {
			      	image.transferTo(new File(rootDirectory+"\\image\\"+ employee.getId() + ".png"));
			       } catch (Exception e) {
					throw new FileNotFoundException("Unable to save image: " + image.getOriginalFilename() );
			       }
			   }

		// save product here
		
	    model.addAttribute("employee", employee);
	    	   
		return "EmployeeDetails";
	}
	
 }
