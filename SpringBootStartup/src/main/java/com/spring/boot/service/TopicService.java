package com.spring.boot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.model.Topic;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(1, "JavaBrains", "Java Tutorial"),
			new Topic(2, "Spring", "Spring Tutorial"), new Topic(3, "Hibernate", "Hibernate Tutorial")));

	public List<Topic> getAllTopics() {
		return topics;

	}

	public Topic getTopics(String id) {
		return topics.stream().filter(t -> String.valueOf(t.getId()).equals(id)).findFirst().get();
	}

	public void addTopics(Topic topic) {
		topics.add(topic);

	}

	public void updateTopics(Topic topic, int id) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = new Topic();
			if (t.getId() == id) {
				topics.set(i, topic);
				return;
			}
		}

	}

	public void deleteTopics( int id) {
		topics.removeIf(t->t.getId()==id);
		
	}

}
