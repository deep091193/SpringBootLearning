package com.spring.boot.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.model.Topic;

public interface TopicRepository extends CrudRepository<Topic,Integer>{

}
