package com.social.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.model.SocialUser;
import com.social.service.SocialUserService;

@RestController
@RequestMapping("/api")
public class SocialUsersController {

	      
	           @Autowired
	           private SocialUserService socialUserService;
	           @GetMapping("/public/getAllSocialUsers")
	           public ResponseEntity<List<SocialUser>> getAllSocialUsers(){
	        	   
	        	       return new ResponseEntity<>(socialUserService.getAllSocialUsers(),HttpStatus.OK);
	           }
	           @PostMapping("/public/createUsers")
	           public ResponseEntity<SocialUser> createSocialUser(SocialUser socialUser){
	        	   
	        	       return new ResponseEntity<SocialUser>(socialUserService.createSocialUser(socialUser),HttpStatus.CREATED);
	           }
}
