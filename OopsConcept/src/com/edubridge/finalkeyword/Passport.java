package com.edubridge.finalkeyword;

public class Passport extends Card {
	private final String passportNo="IND667868I676";
	private String dateOfExpiry;
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public String getPassportNo() {
		return passportNo;
	}
	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", dateOfExpiry=" + dateOfExpiry + ", toString()="
				+ super.toString() + "]";
	}
	

}
