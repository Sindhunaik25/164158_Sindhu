package com.sindhu.springboot.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("100", "Sindhu", "Welcome"),
			new Topic("101", "Sachin", "Good Morning"), new Topic("102", "Savinaya", "Hello")));

	public List<Topic> getAllTopics() {
		// return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;

	}

	public Optional<Topic> getToipc(String id) {
		// return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteToipc(String id) {
		topicRepository.deleteById(id);

	}
}
