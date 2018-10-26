package domain;

import java.util.Date;

public class studenthouse {
private String stuid;
private String houseid;
private String building;
private Date date;
public String getStuid() {
	return stuid;
}
public void setStuid(String stuid) {
	this.stuid = stuid;
}
public String getHouseid() {
	return houseid;
}
public void setHouseid(String houseid) {
	this.houseid = houseid;
}
public String getBuildingid() {
	return building;
}
public void setBuildingid(String buidingid) {
	this.building = buidingid;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public studenthouse(String stuid, String houseid, String buidingid, Date date) {
	super();
	this.stuid = stuid;
	this.houseid = houseid;
	this.building = buidingid;
	this.date = date;
}
public studenthouse() {
	super();
	// TODO Auto-generated constructor stub
}

}
