package SpringDemo3.p1;

import java.util.List;

public class ListOfEmployee {
	public List<Employee> elist;

	public ListOfEmployee(List<Employee> elist) {
		super();
		this.elist = elist;
	}

	public List<Employee> getElist() {
		return elist;
	}

	public void setElist(List<Employee> elist) {
		this.elist = elist;
	}

	@Override
	public String toString() {
		return "ListOfEmployee [elist=" + elist + "]";
	}

	public ListOfEmployee() {
		super();
	}
	

}
