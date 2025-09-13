package com.social.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
public class SocialProfile {

	     @Id
	     @GeneratedValue(strategy=GenerationType.IDENTITY)
	     private Long id;
	     
	     @OneToOne
	     @JoinColumn(name="user_id")
	     @JsonIgnore
	     private SocialUser socialUser;
}
