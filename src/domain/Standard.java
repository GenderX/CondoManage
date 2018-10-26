package domain;

import java.math.BigDecimal;

public class Standard {
	private String buildingId;
	private float waterBase;
	private BigDecimal waterPrice;
	private float eleBase;
	private BigDecimal elePrice;
	private String livingFee;
	private String note;

	public String toString() {
		return "Standard [buildingId=" + buildingId + ", waterBase=" + waterBase + ", waterPrice=" + waterPrice
				+ ", eleBase=" + eleBase + ", elePrice=" + elePrice + ", livingFee=" + livingFee + ", note=" + note
				+ "]";
	}

	public Standard(String buildingId, float waterBase, BigDecimal waterPrice, float eleBase, BigDecimal elePrice,
			String livingFee, String note) {
		this.buildingId = buildingId;
		this.waterBase = waterBase;
		this.waterPrice = waterPrice;
		this.eleBase = eleBase;
		this.elePrice = elePrice;
		this.livingFee = livingFee;
		this.note = note;
	}

	public Standard() {
	}

	public String getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}

	public float getWaterBase() {
		return waterBase;
	}

	public void setWaterBase(float waterBase) {
		this.waterBase = waterBase;
	}

	public BigDecimal getWaterPrice() {
		return waterPrice;
	}

	public void setWaterPrice(BigDecimal waterPrice) {
		this.waterPrice = waterPrice;
	}

	public float getEleBase() {
		return eleBase;
	}

	public void setEleBase(float eleBase) {
		this.eleBase = eleBase;
	}

	public BigDecimal getElePrice() {
		return elePrice;
	}

	public void setElePrice(BigDecimal elePrice) {
		this.elePrice = elePrice;
	}

	public String getLivingFee() {
		return livingFee;
	}

	public void setLivingFee(String livingFee) {
		this.livingFee = livingFee;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
