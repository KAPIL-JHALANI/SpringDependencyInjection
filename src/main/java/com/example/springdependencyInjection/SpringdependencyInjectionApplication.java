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



		//Object injection without ref in bean
//		sciencetest test=context.getBean("science", sciencetest.class);
//		test.cheat();

		//with ref and make different object for scienceCheat so it can be used by several ojects
		sciencetest test=context.getBean("science1",sciencetest.class);
		test.cheat();

		Finaltest finaltest=context.getBean("finaltest", Finaltest.class);
		finaltest.startcheat();


		//Create injection using autowire
		//aotowire also using setter injection

		Human human=context.getBean("human", Human.class);
		human.startpump();

		Human human1=context.getBean("human1", Human.class);
		human1.startpump();






	}

}
