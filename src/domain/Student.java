package domain;

public class Student {
private String sid;
private String sex;
private String year;
private String college;
private String major;
private String note;
private String name;
private String address;
private int calendarYear;
private String dedpartment;
private String classes;
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getCalendarYear() {
	return calendarYear;
}
public void setCalendarYear(int calendarYear) {
	this.calendarYear = calendarYear;
}
public String getDedpartment() {
	return dedpartment;
}
public void setDedpartment(String dedpartment) {
	this.dedpartment = dedpartment;
}
public String getClasses() {
	return classes;
}
public void setClasses(String classes) {
	this.classes = classes;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + "]";
}





}