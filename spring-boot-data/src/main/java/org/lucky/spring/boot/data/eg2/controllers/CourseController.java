package org.lucky.spring.boot.data.eg2.controllers;

import java.util.Arrays;
import java.util.List;



import org.lucky.spring.boot.data.eg2.model.Course;
import org.lucky.spring.boot.data.eg2.model.Topic;
import org.lucky.spring.boot.data.eg2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring mvc has inbuilt support for JSON for any pojo
 * Refer all methods and CourseService as well
 * 
 *
 */
@RestController
@RequestMapping("/eg2")
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id){
		return courseService.getAllCourses(id);
	}	
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id){
		return courseService.getCourse(id);
	}
	
	//set Content-Type=application/json in header
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId){
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id){
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String id){
		courseService.deleteCourse(id);
	}
	
}
