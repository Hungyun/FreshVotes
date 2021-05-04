package com.freshvotes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {
	
	//listening on get request of "/" url
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String rootView() {
		return "index";
	}
}
