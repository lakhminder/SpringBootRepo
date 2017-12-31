package org.lucky.spring.boot.data.eg2.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.lucky.spring.boot.data.eg2.model.Course;
import org.lucky.spring.boot.data.eg2.model.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;	
	
	public List<Course> getAllCourses(String topicId){
		//List<Course> courses = new ArrayList<>();
		return courseRepository.findByTopicId(topicId);
		//.forEach(courses::add);
		
		//return courses;
	}
	
	public Course getCourse(String id){
		return courseRepository.findOne(id);
	}
	
	public void addCourse(Course course){
		courseRepository.save(course);
	}
	
	public void updateCourse(Course course){
		courseRepository.save(course);	
	}
	
	public void deleteCourse(String id){
		courseRepository.delete(id);
	}
	
}
