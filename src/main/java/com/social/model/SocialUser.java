package com.social.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SocialUser {

	       @Id
	       @GeneratedValue(strategy=GenerationType.IDENTITY)
	       private Long id;
	       
	       @OneToOne(mappedBy="socialUser")
	       private SocialProfile socialProfile;
	       
	       @OneToMany(mappedBy="users")
	       private List<Posts> posts=new ArrayList<>();
	       
	       @ManyToMany
	       @JoinTable(
	    		   name="user_groups",
	    		   joinColumns = @JoinColumn(name="user_id"),
	    		   inverseJoinColumns = @JoinColumn(name="group_id")
	    		   )
	    	   
	       private Set<SocialGroups> groups=new HashSet<>();
	       
	       @Override
	       public int hashCode() {
	    	
	    	   return Objects.hash(id);
	       }
}
