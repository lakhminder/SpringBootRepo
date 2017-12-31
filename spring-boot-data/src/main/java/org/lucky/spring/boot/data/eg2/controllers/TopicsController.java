package org.lucky.spring.boot.data.eg2.controllers;

import java.util.Arrays;
import java.util.List;



import org.lucky.spring.boot.data.eg2.model.Topic;
import org.lucky.spring.boot.data.eg2.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring mvc has inbuilt support for JSON for any pojo
 * Refer all methods and TopicService as well
 * 
 *
 */
@RestController
@RequestMapping("/eg2")
public class TopicsController {
	
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	/*@RequestMapping("/topics/{idPath}")
	public Topic getTopic(@PathVariable("idPath") String id){
		return topicService.getTopic(id);
	}*/
	
	//Convention to use passthrough with same name
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id){
		return topicService.getTopic(id);
	}
	
	//set Content-Type=application/json in header
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
		topicService.updateTopic(topic, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id){
		topicService.deleteTopic(id);
	}
	
}
