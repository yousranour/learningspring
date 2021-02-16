/**
 * 
 */
package com.example.demo.model;

/**
 * @author yosra
 *
 */
public class LearningInformation {
	
	private String developerName;
	
	
	private String applicationName;
	
	private String lessonName;
	
	private String version;
	
	public LearningInformation() {
		
	}
		
	public LearningInformation(String developerName, String applicationName, String lessonName, String version) {
		super();
		this.developerName = developerName;
		this.applicationName = applicationName;
		this.lessonName = lessonName;
		this.version = version;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	

	


	

}
