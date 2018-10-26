package domain;

import java.util.Date;

import javafx.scene.chart.PieChart.Data;

public class out {
	private String buildingid;
	private String houseid;
	private String reason;
	private Date date;
	public out(String buildingid, String houseid, String reason, Date date) {
		super();
		this.buildingid = buildingid;
		this.houseid = houseid;
		this.reason = reason;
		this.date = date;
	}
	public out() {
		super();
	}
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
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
