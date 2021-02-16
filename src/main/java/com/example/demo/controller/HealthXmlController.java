/**
 * 
 */
package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LearningInformation;

/**
 * Premier Web service renvoie reponse en xml
 * 
 * à finir
 * 
 * @author yosra
 *
 */

@RestController
public class HealthXmlController {

	@GetMapping(value="/learningInfoxml" )//, produces=MediaType.APPLICATION_XML_VALUE)//
	public LearningInformation sendSalam(){
		
		LearningInformation learningInformation = new LearningInformation();
		learningInformation.setApplicationName("Webservice with objet json ");
		learningInformation.setDeveloperName("Yosra Guedda");
		learningInformation.setLessonName("Spring discover");
		learningInformation.setVersion("v1");
		return learningInformation;
	}
}
