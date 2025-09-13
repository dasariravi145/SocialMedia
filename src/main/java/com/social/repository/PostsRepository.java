package com.social.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.model.Posts;

public interface PostsRepository extends JpaRepository<Posts, Long>{

}
