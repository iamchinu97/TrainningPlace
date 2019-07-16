package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {
public static void main(String[] args) {
	ApplicationContext con= new ClassPathXmlApplicationContext("mybean.xml");
	Employee e;
	e=(Employee) con.getBean("employee");
	
}
}
