package com.apitest.helloworld.controller;

import org.springframework.boot.context.properties.*;
import org.springframework.http.MediaType;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@ConfigurationProperties(prefix="config")
@Component
public class HelloWorldController {

	private String text;
	private String configMap;
	private String configSecret;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	} 
	
	public String getConfigMap() {
		return configMap;
	}

	public void setConfigMap(String configMap) {
		this.configMap = configMap;
	} 
	
	public String getConfigSecret() {
		return configSecret;
	}

	public void setConfigSecret(String configSecret) {
		this.configSecret = configSecret;
	}  

	@RequestMapping(value = "/helloworld", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String HelloWorld() {  
		

		return "{\"Text\": " + getText() + 
		",\"Config Map\": \"" + getConfigMap() + 
		"\",\"ConfigSecret\": \"" + getConfigSecret() + 
		"\",\"Non config value\": \"" + "HardCodedValue" + 
		"\"}";  	  
	}	
}