package org.lucky.springboot.eg2.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.lucky.springboot.eg2.model.Topic;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Spring","Spring Data", "Spring data API"),
			new Topic("Java","Core Java", "Core Java"),
			new Topic("JavaScript", "Java Script", "Java Script")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
	}
	
	public void addTopic(Topic topic){
		topics.add(topic);
	}
	
	public void updateTopic(Topic topic, String id){
		for(int i =0; i < topics.size();i++){
			Topic update = topics.get(i);
			if(update.getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}		
	}
	
	public void deleteTopic(String id){
		topics.removeIf(t -> t.getId().equals(id));
	}
	
}
