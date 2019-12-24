package com01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Greeting zhangGa = (Greeting) context.getBean("zhangGa");
//		Greeting rod = (Greeting) context.getBean("rod");
//		zhangGa.sayGreeting();
//		rod.sayGreeting();
//		Greeting rod = (Greeting) context.getBean("greet1");
//		rod.sayGreeting();
		GreetService greetService = (GreetServiceImpl) context.getBean("greet");
		greetService.sayGreeting();
		@SuppressWarnings("unused")
		GreetService greetService2 = (GreetServiceImpl) context.getBean("greet1");
		greetService.sayGreeting();
//		GreetDao greetService2 = (GreetDaoImpl) context.getBean("greet");
//		greetService2.sayGreeting();
		Greeting greeting = (Greeting) context.getBean("greet2");
		greeting.sayGreeting();
	}

}
