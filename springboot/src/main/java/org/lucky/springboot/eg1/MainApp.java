package org.lucky.springboot.eg1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Refer pom.xml to include springboot configurations/dependencies
 * @SpringBootApplication is to bootstrap main class as spring application
 * by invoking static SpringApplication.run()
 * 
 * 1) it Set up default configuration
 * 2) Started Spring Application Context
 * 3) Performs Classpath Scan
 * 4) Started Tomcat server bundled within Springboot
 *
 *refer HelloController.java
 *		TopicsController.java for Json/pojo
 *
 *It has tomcat server as embedded servlet container for
 * 1) convenience as no need to download tomcat separately
 * 2) Servlet container config is now application config
 * 3) standalone application
 * 4) useful for microservices architecture where you might need to deploy bunch of microservices independently
 * 
 * Ways for spring Boot:
 * 1) as maven project like this refer above
 * 2) refer spring initializr => https://start.spring.io/
 * 3) spring boot cli
 * 4) using STS IDE(similar to Spring initializr just within IDE)
 * 5) use application.properties to override default behaviour set in classpath 
 * 		refer https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html
 * 
 * WE can use cmd line as well to deploy spring Boot
 * mvn clean install => produces jar
 * Java -jar *.jar
 * 
 * Include actuator for monitoring spring application purpose
 * refer pom.xml
 * *.* /health => shows the status up and memory related info
 * 	   /beans => all beans in application
 * etc..
 */
@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);

	}

}
