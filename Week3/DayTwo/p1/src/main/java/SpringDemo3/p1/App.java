package SpringDemo3.p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("mysecondbean.xml");
    	Employee emp;
    	emp=(Employee) context.getBean("e1");
    	System.out.println(emp);
    }
}
