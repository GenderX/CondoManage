package domain;

import java.util.Date;

public class Register {
	private String buildingId;
	private String roomId;
	private String reason;
	private Date registerDate;
	private int id;
	private boolean state;

	public Register() {

	}

	public Register(String buildingId, String roomId, String reason, Date registerDate, int id, boolean state) {
		super();
		this.buildingId = buildingId;
		this.roomId = roomId;
		this.reason = reason;
		this.registerDate = registerDate;
		this.id = id;
		this.state = state;
	}

	public String getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Register [buildingId=" + buildingId + ", roomId=" + roomId + ", reason=" + reason + ", registerDate="
				+ registerDate + ", id=" + id + ", state=" + state + "]";
	}




}
