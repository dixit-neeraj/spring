package com.nks.springbootopenshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class adminController {

	@GetMapping("/test")
	public String test() { 
		return "welcome to spring boot openshift application";
//		Username: springUser
//	    Password: neeraj@123
//	  Database Name: springCmsdb
//	 Connection URL: mysql://mysql:3306/
	}
}
