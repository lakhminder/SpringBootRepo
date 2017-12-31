package org.lucky.springboot.eg2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * Develop Rest Api
 * as Resources as Topics 1=>* courses 1=>* Lessons
 *	/topics/<Spring>/courses/<SpringAPI>/Lessons/<Lesson2>  
 *
 * Refer various annotations
 */


@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);

	}

}
