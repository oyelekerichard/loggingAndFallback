package com.isslng.loggingfallback;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FallbackController 
{
	@RequestMapping(method = RequestMethod.GET, value = "/getName")
	public String getName(@RequestParam String name)
	{
		return "My name is "+name;
	}
	
	
}
