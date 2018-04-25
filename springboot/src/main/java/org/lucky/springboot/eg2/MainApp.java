package org.lucky.springboot.eg2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * Develop Rest Api
 * as Resources as Topics 1=>* courses 1=>* Lessons
 *	/topics/<Spring>/courses/<SpringAPI>/Lessons/<Lesson2>  
 *
 *@ImportResource is used to sepcify any spring.xml file(optional)
 *
 * Refer various annotations
 */


@SpringBootApplication
//@ImportResource("classpath:")
public class MainApp {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);

	}

}
