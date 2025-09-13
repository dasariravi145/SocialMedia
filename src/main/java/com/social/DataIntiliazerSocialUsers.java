package com.social;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.social.model.Posts;
import com.social.model.SocialGroups;
import com.social.model.SocialProfile;
import com.social.model.SocialUser;
import com.social.repository.PostsRepository;
import com.social.repository.SocialGroupsRepository;
import com.social.repository.SocialProfileRepository;
import com.social.repository.SocialUserRepository;

@Configuration
public class DataIntiliazerSocialUsers {

	         @Autowired
	         private SocialUserRepository socialUserRepository;
	         @Autowired
	         private PostsRepository postsRepository;
	         @Autowired
	         private SocialGroupsRepository socialGroupsRepository;
	         @Autowired
	         private SocialProfileRepository socialProfileRepository;
	         @Bean
	         public CommandLineRunner intialiazation() {
	        	 return args->{
	        		
	        		    SocialUser user1=new SocialUser();
	        		    SocialUser user2=new SocialUser();
	        		    SocialUser user3=new SocialUser();
	        		    
	        		    socialUserRepository.save(user1);
	        		    socialUserRepository.save(user2);
	        		    socialUserRepository.save(user3);
	        		    
	        		    SocialGroups groups1=new SocialGroups();
	        		    SocialGroups groups2=new SocialGroups();
	        		    
	        		    groups1.getSocialUser().add(user1);
	        		    groups1.getSocialUser().add(user2);
	        		    
	        		    groups2.getSocialUser().add(user2);
	        		    groups2.getSocialUser().add(user3);
	        		    
	        		    socialGroupsRepository.save(groups1);
	        		    socialGroupsRepository.save(groups2);
	        		    
	        		    user1.getGroups().add(groups1);
	        		    user2.getGroups().add(groups1);
	        		    user2.getGroups().add(groups2);
	        		    user3.getGroups().add(groups2);
	        		    
	        		    socialUserRepository.save(user1);
	        		    socialUserRepository.save(user2);
	        		    socialUserRepository.save(user3);
	        		    
	        		    Posts posts1=new Posts();
	        		    Posts posts2=new Posts();
	        		    Posts posts3=new Posts();
	        		    
	        		    posts1.setUsers(user1);
	        		    posts2.setUsers(user2);
	        		    posts3.setUsers(user3);
	        		    
	        		    postsRepository.save(posts1);
	        		    postsRepository.save(posts2);
	        		    postsRepository.save(posts3);
	        		    
	        		    SocialProfile socialProfile1=new SocialProfile();
	        		    SocialProfile socialProfile2=new SocialProfile();
	        		    SocialProfile socialProfile3=new SocialProfile();
	        		    
	        		    socialProfile1.setSocialUser(user1);
	        		    socialProfile2.setSocialUser(user2);
	        		    socialProfile3.setSocialUser(user3);
	        		    
	        		    socialProfileRepository.save(socialProfile1);
	        		    socialProfileRepository.save(socialProfile2);
	        		    socialProfileRepository.save(socialProfile3);
	        	 };
	         }
}
