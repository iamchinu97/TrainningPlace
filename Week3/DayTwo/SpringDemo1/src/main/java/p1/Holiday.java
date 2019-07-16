package p1;

public class Holiday {
public String date;
public String hname;
public Holiday(String date, String name) {
	super();
	this.date = date;
	this.hname = name;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getName() {
	return hname;
}
public void setName(String name) {
	this.hname = name;
}
@Override
public String toString() {
	return "Holiday [date=" + date + ", name=" + hname + "]";
}
public Holiday() {
	super();
}

}
