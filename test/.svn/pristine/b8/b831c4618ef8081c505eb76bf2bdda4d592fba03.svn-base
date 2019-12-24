package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
//		helloSpring.print();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Printer printer = (Printer) context.getBean("printer");
		String content = "张嘎说：三天不打小鬼子，手都痒痒！Rod说：世界上有10种人，"
				+ "认识二进制的和不认识二进认识二进制的和不认识不认识二进认识二进制的和不"
				+ "认识不认识二进认识二进制的和不认识不认识二进认识二进制的和不认识二进认"
				+ "识二进制的和不认识二进认识二进制的和不认识二进";
		printer.print(content);
	}

}
