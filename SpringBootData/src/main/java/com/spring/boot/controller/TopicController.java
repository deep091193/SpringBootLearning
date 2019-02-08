package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.model.Topic;
import com.spring.boot.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getTopics() {

		return topicService.getAllTopics();

	}

	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable int id) {
		return topicService.getTopics(id);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopics(@RequestBody Topic topic) {
		topicService.addTopics(topic);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopics(@RequestBody Topic topic, @PathVariable int id) {
		topicService.updateTopics(topic, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopics(@PathVariable int id) {
		topicService.deleteTopics(id);
	}
}
