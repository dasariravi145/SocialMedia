package com.social.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.model.SocialUser;

public interface SocialUserRepository extends JpaRepository<SocialUser, Long> {

}
