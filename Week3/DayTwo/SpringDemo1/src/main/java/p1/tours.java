package p1;

import java.util.List;

public class tours {
	public List<Holiday> packages;

	public List<Holiday> getPackages() {
		return packages;
	}

	public void setPackages(List<Holiday> packages) {
		this.packages = packages;
	}
	public tours(List<Holiday> packages) {
		super();
		this.packages = packages;
	}

	public tours() {
		super();
	}
	@Override
	public String toString() {
		return "tours [packages=" + packages + "]";
	}
	
	

}
