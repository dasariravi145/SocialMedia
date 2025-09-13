package com.social.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.model.SocialUser;
import com.social.repository.SocialUserRepository;

@Service
public class SocialUserService {

	        @Autowired
	        private SocialUserRepository socialUserRepository;
	        
	        public List<SocialUser> getAllSocialUsers(){
	        	return socialUserRepository.findAll();
	        }
	        
	        public SocialUser createSocialUser(SocialUser socialUser) {
	        	
	        	   return socialUserRepository.save(socialUser);
	        }
}
