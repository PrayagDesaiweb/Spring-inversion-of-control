package com.prayag.desai;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		// load the spring configuaion file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		// retrive the bean from the spring container
		Coach theCoach = context.getBean("my", Coach.class); // Coach.class is the actual name of the inteface 
		// call mehthods on the bean
		System.out.println(theCoach.getDailyWorkout());
		// close the bean
		context.close();
	}

}
