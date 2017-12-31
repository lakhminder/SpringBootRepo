package org.lucky.spring.boot.data.eg2.model.repository;

import java.util.List;

import org.lucky.spring.boot.data.eg2.model.Course;
import org.lucky.spring.boot.data.eg2.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	//General Syatax findBy<PropName>
	public List<Course> findByName(String name);
	
	//Topic.Id
	public List<Course> findByTopicId(String id);

}
