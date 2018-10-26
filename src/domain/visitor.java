package domain;

import java.util.Date;

public class visitor {
private String buildingid;
private String houseid;
private String bevistname;
private String vistname;
private String relative;
private Date date;
private String idnumber;
private String idtype;
private String dutyname;




public String getBuildingid() {
	return buildingid;
}
public void setBuildingid(String buildingid) {
	this.buildingid = buildingid;
}
public String getHouseid() {
	return houseid;
}
public void setHouseid(String houseid) {
	this.houseid = houseid;
}
public String getBevistname() {
	return bevistname;
}
public void setBevistname(String bevistname) {
	this.bevistname = bevistname;
}
public String getVistname() {
	return vistname;
}
public void setVistname(String vistname) {
	this.vistname = vistname;
}
public String getRelative() {
	return relative;
}
public void setRelative(String relative) {
	this.relative = relative;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getIdnumber() {
	return idnumber;
}
public void setIdnumber(String idnumber) {
	this.idnumber = idnumber;
}
public String getIdtype() {
	return idtype;
}
public void setIdtype(String idtype) {
	this.idtype = idtype;
}
public String getDutyname() {
	return dutyname;
}
public void setDutyname(String dutyname) {
	this.dutyname = dutyname;
}
@Override
public String toString() {
	return "visitor [buildingid=" + buildingid + ", houseid=" + houseid + ", bevistname=" + bevistname + ", vistname="
			+ vistname + ", relative=" + relative + ", date=" + date + ", idnumber=" + idnumber + ", idtype=" + idtype
			+ ", dutyname=" + dutyname + ", getBuildingid()=" + getBuildingid() + ", getHouseid()=" + getHouseid()
			+ ", getBevistname()=" + getBevistname() + ", getVistname()=" + getVistname() + ", getRelative()="
			+ getRelative() + ", getDate()=" + getDate() + ", getIdnumber()=" + getIdnumber() + ", getIdtype()="
			+ getIdtype() + ", getDutyname()=" + getDutyname() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}



}