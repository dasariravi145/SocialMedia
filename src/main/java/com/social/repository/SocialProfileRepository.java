package com.social.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.model.SocialProfile;

public interface SocialProfileRepository extends JpaRepository<SocialProfile, Long> {

}
