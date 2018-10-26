package domain;

public class house {
	private int houseid;
	private int bulidingid;
	private char sex;
	private String phone;
	private int kezhuo;
    private int ruzhu;
    private float expense;
    private String extra;
    //nimabi
	public int getHouseid() {
		return houseid;
	}
	public void setHouseid(int houseid) {
		this.houseid = houseid;
	}
	public int getBulidingid() {
		return bulidingid;
	}
	public void setBulidingid(int bulidingid) {
		this.bulidingid = bulidingid;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getKezhuo() {
		return kezhuo;
	}
	public void setKezhuo(int kezhuo) {
		this.kezhuo = kezhuo;
	}
	public int getRuzhu() {
		return ruzhu;
	}
	public void setRuzhu(int ruzhu) {
		this.ruzhu = ruzhu;
	}
	public float getExpense() {
		return expense;
	}
	public void setExpense(float expense) {
		this.expense = expense;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	public house(int houseid, int bulidingid, char sex, String phone, int kezhuo, int ruzhu, float expense,
			String extra) {
		super();
		this.houseid = houseid;
		this.bulidingid = bulidingid;
		this.sex = sex;
		this.phone = phone;
		this.kezhuo = kezhuo;
		this.ruzhu = ruzhu;
		this.expense = expense;
		this.extra = extra;
	}
	public house() {
		super();
	}
	
}
