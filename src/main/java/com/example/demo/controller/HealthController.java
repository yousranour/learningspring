/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LearningInformation;

/**
 * Premier Web service Simple renvoie salam alaikom
 * 
 * @author yosra
 *
 */

@RestController
public class HealthController {

	@GetMapping("/learningInfo")//
	public LearningInformation sendSalam(){
		
		LearningInformation learningInformation = new LearningInformation();
		learningInformation.setApplicationName("Webservice with objet json ");
		learningInformation.setDeveloperName("Yosra Guedda");
		learningInformation.setLessonName("Spring discover");
		learningInformation.setVersion("v1");
		return learningInformation;
	}
}
