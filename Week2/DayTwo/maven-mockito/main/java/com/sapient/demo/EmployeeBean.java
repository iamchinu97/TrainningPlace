package com.sapient.demo;

public class EmployeeBean {
	private int id;
	private String Name;
	private float Salary;
	public EmployeeBean(int id, String name, float salary) {
		super();
		this.id = id;
		Name = name;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeebBean [id=" + id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + Float.floatToIntBits(Salary);
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeBean other = (EmployeeBean) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Float.floatToIntBits(Salary) != Float.floatToIntBits(other.Salary))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
