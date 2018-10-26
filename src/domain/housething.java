package domain;

public class housething {
	private String buildingid;
	private  String roomid;
	private int door_num;
	private String door_stat;
	private int cab_num;
	private String cab_stat;
	private int desk_num;
	private String desk_stat;
	private int chair_num;
	private String chair_stat;
	private int light_num;
	private String light_stat;
	private int fan_num;
	private String fan_stat;
	private String others;
	public String getBuildingid() {
		return buildingid;
	}
	public void setBuildingid(String buildingid) {
		this.buildingid = buildingid;
	}
	public String getRoomid() {
		return roomid;
	}
	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}
	public int getDoor_num() {
		return door_num;
	}
	public void setDoor_num(int door_num) {
		this.door_num = door_num;
	}
	public String getDoor_stat() {
		return door_stat;
	}
	public void setDoor_stat(String door_stat) {
		this.door_stat = door_stat;
	}
	public int getCab_num() {
		return cab_num;
	}
	public void setCab_num(int cab_num) {
		this.cab_num = cab_num;
	}
	public String getCab_stat() {
		return cab_stat;
	}
	public void setCab_stat(String cab_stat) {
		this.cab_stat = cab_stat;
	}
	public int getDesk_num() {
		return desk_num;
	}
	public void setDesk_num(int desk_num) {
		this.desk_num = desk_num;
	}
	public String getDesk_stat() {
		return desk_stat;
	}
	public void setDesk_stat(String desk_stat) {
		this.desk_stat = desk_stat;
	}
	public int getChair_num() {
		return chair_num;
	}
	public void setChair_num(int chair_num) {
		this.chair_num = chair_num;
	}
	public String getChair_stat() {
		return chair_stat;
	}
	public void setChair_stat(String chair_stat) {
		this.chair_stat = chair_stat;
	}
	public int getLight_num() {
		return light_num;
	}
	public void setLight_num(int light_num) {
		this.light_num = light_num;
	}
	public String getLight_stat() {
		return light_stat;
	}
	public void setLight_stat(String light_stat) {
		this.light_stat = light_stat;
	}
	public int getFan_num() {
		return fan_num;
	}
	public void setFan_num(int fan_num) {
		this.fan_num = fan_num;
	}
	public String getFan_stat() {
		return fan_stat;
	}
	public void setFan_stat(String fan_stat) {
		this.fan_stat = fan_stat;
	}
	public String getOthers() {
		return others;
	}
	public void setOthers(String others) {
		this.others = others;
	}
	@Override
	public String toString() {
		return "housething [buildingid=" + buildingid + ", roomid=" + roomid + ", door_num=" + door_num + ", door_stat="
				+ door_stat + ", cab_num=" + cab_num + ", cab_stat=" + cab_stat + ", desk_num=" + desk_num
				+ ", desk_stat=" + desk_stat + ", chair_num=" + chair_num + ", chair_stat=" + chair_stat
				+ ", light_num=" + light_num + ", light_stat=" + light_stat + ", fan_num=" + fan_num + ", fan_stat="
				+ fan_stat + ", others=" + others + "]";
	}
	
	
	
	
}
