package p1;

public class Holiday {
public String date;
public String name;
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Holiday [date=" + date + ", name=" + name + "]";
}
public Holiday(String date, String name) {
	super();
	this.date = date;
	this.name = name;
}
public Holiday() {
	super();
}

}
