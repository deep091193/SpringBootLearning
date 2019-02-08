package com.spring.boot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dao.TopicRepository;
import com.spring.boot.model.Topic;

@Service
public class TopicService {

	private TopicRepository topicRepository;

	public TopicRepository getTopicRepository() {
		return topicRepository;
	}

	public void setTopicRepository(TopicRepository topicRepository) {
		this.topicRepository = topicRepository;
	}

	/*private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(1, "JavaBrains", "Java Tutorial"),
			new Topic(2, "Spring", "Spring Tutorial"), new Topic(3, "Hibernate", "Hibernate Tutorial")));
*/
	public List<Topic> getAllTopics() {
		// return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;

	}

	public Topic getTopics(Integer id) {
		// return topics.stream().filter(t ->
		// String.valueOf(t.getId()).equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopics(Topic topic) {
		/* topics.add(topic); */
		topicRepository.save(topic);

	}

	public void updateTopics(Topic topic, int id) {
		/*
		 * for (int i = 0; i < topics.size(); i++) { Topic t = new Topic(); if
		 * (t.getId() == id) { topics.set(i, topic); return; } }
		 */

		topicRepository.save(topic);
	}

	public void deleteTopics(int id) {
		/* topics.removeIf(t->t.getId()==id); */
		topicRepository.delete(id);

	}

}
