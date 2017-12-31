package org.lucky.spring.boot.data.eg2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * Refer readme.txt
 * refer Topic.java
 * topicService
 * 
 *  Since we have provided derby dependency so Springboot provides the embedded Derby DB
 *  and has all parameters to connect to it
 *  
 *  Develop Rest Api
 * as Resources as Topics 1=>* courses 1=>* Lessons
 *	/topics/<Spring>/courses/<SpringAPI>/Lessons/<Lesson2>
 *
 *refer CourseController.java & Course.java & CourseRepository.java
 *
 */

@SpringBootApplication
public class SpringBootDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataApplication.class, args);
	}
}
