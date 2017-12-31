package org.lucky.springboot.eg1.controllers;

import java.util.Arrays;
import java.util.List;

import org.lucky.springboot.eg1.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring mvc has inbuilt support for JSON for any pojo
 * Refer getAllTopics
 * 
 *
 */
@RestController
public class TopicsController {

	@RequestMapping("/eg1/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(new Topic("1","name", "desc"),
				new Topic("2","name2", "desc2")
							);
	}
}
