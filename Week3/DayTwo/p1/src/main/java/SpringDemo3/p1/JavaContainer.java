package SpringDemo3.p1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaContainer {
	@Bean
	public Employee getEmployee() {
		return new Employee("chinu","22");
	}
	@Bean
	public ListOfEmployee getListOfEmployee()
	{
		List<Employee> emps= new ArrayList<Employee>();
		Employee em1= new Employee("ajay","14");
		Employee em2= new Employee("gurpal","24");		
		emps.add(em1);
		emps.add(em2);
		return new ListOfEmployee(emps);
	}

}
