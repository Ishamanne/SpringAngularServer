
package com.connect;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class RestController {

	@RequestMapping("/api/hello")
	@ResponseBody
	 public String greet() {
	  return "Hello from the other side!!!";
	 }
	
}
