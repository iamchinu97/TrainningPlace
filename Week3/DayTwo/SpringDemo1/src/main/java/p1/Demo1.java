package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {
	
	public static void main(String[] args) {
		
		ApplicationContext cont= new ClassPathXmlApplicationContext("bean.xml");
		Hello ob;
		ob=(Hello)cont.getBean("hello");
		ob.display();
		Holiday h1;
		h1=(Holiday)cont.getBean("h1demo1");
		System.out.println(h1);
	}

}
