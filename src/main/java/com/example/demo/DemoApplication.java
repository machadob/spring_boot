package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan("com.example")
@PropertySource("classpath:my.properties")  //Inject properties from a text file
//@ImportResource("myspringconfig.xml") // Use a spring config file along with autoconfig (Mixed configuration)
@ImportResource("file:/Users/shaun/0000_LEARN/spring_boot/src/main/misc/springconfig.xml")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
