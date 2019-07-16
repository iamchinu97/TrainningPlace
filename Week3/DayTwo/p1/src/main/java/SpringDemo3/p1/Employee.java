package SpringDemo3.p1;

public class Employee {
	public String ename;
	public String age;
	public Employee(String ename, String age) {
		super();
		this.ename = ename;
		this.age = age;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", age=" + age + "]";
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
