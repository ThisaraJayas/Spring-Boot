package com.Thisara.newProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GammingBasicJava {

	public static void main(String[] args) {
		
		var Context =new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		System.out.println(Context.getBean("name"));
		System.out.println(Context.getBean("age"));
		System.out.println(Context.getBean("person1"));
		System.out.println(Context.getBean("address2"));
		System.out.println(Context.getBean("person2"));



	}

}
