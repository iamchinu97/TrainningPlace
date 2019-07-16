package SpringDemo3.p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {

	public static void main(String[] args) {
		ApplicationContext context2= new AnnotationConfigApplicationContext(JavaContainer.class);
		Employee emp2= context2.getBean(Employee.class);
		System.out.println(emp2);
		ListOfEmployee lemp1= context2.getBean(ListOfEmployee.class);
		System.out.println(lemp1);
	}

}
