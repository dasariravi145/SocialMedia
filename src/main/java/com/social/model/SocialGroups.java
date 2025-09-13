package com.social.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class SocialGroups {
     
	       @Id
	       @GeneratedValue(strategy=GenerationType.IDENTITY)
	       private Long id;
	       
	       @ManyToMany(mappedBy="groups")
	       @JsonIgnore
	       private Set<SocialUser> socialUser =new HashSet<>();
	       
	       @Override
	       public int hashCode() {
	    	
	    	   return Objects.hash(id);
	       }
}
