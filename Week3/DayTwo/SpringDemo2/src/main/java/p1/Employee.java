package p1;

public class Employee {
	public String Ename;
	public int age;
	public Employee(String ename, int age) {
		super();
		Ename = ename;
		this.age = age;
	}
	public Employee() {
		super();
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [Ename=" + Ename + ", age=" + age + "]";
	}
	
}
