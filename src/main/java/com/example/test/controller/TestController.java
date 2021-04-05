/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.test.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/api/test")
public class TestController {
    

	
  
    
    
    @GetMapping("/welcome")
    public String welcome() {
    
        return "home";
    }

    @GetMapping("/appname")
    public String homePage(Model model) {
     
        return "home";
    }
	
	@RequestMapping(value = "/ipaddress", method = RequestMethod.GET)
	public Object IPAddress(HttpServletRequest request) {
		String remoteAddress="";

		try {

		if (request != null) {
		remoteAddress = request.getHeader("X-Forwarded-For");
		if (remoteAddress == null || "".equals(remoteAddress)) {
		remoteAddress = request.getRemoteAddr();
		}
		}
		remoteAddress=remoteAddress!=null && remoteAddress.contains(",")
		? remoteAddress.split(",")[0]
		: remoteAddress;
		System.out.println("remote ip addres {}"+remoteAddress);
	
		

		} 
		
		catch (Exception e) {
			

		}
		
		return remoteAddress;
		}
	
	


	@RequestMapping(value = "/captureIP", method = RequestMethod.POST)
	public String processData( HttpServletRequest request) {
		String remoteAddress="";

		try {

		if (request != null) {
		remoteAddress = request.getHeader("X-Forwarded-For");
		if (remoteAddress == null || "".equals(remoteAddress)) {
		remoteAddress = request.getRemoteAddr();
		}
		}
		remoteAddress=remoteAddress!=null && remoteAddress.contains(",")
		? remoteAddress.split(",")[0]
		: remoteAddress;
		System.out.println("remote ip addres {}"+remoteAddress);
	
		

		} 
		
		catch (Exception e) {
			

		}
		
		return remoteAddress;

		}
	
	
	
	
 
   
	   
	   



  
}
