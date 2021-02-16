/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Premier Web service Simple renvoie salam alaikom
 * 
 * @author yosra
 *
 */

@RestController
public class HelloController {

	@GetMapping("/salam")
	public String sendSalam(){
		return "salam alaikom";
	}
}
