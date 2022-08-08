package com.example.springdependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource({"classpath*:beans1.xml"})
public class SpringdependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdependencyInjectionApplication.class, args);

		ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
		student stu=context.getBean("student", student.class);
		stu.displaystudentinfo();

//		context.getBean("student" -> spring id or object id or bean name in IOC container that we set in xml , student.class -> use to typecast to student class);




	}

}
