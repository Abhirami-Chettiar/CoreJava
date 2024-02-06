package com.edubridge.abstractclassdemo;

public abstract class GovernmentAgency {
	private String agencyName;
	private long budget;
	public String getAgencyName() {
		return agencyName;
	}
	public String setAgencyName(String agencyName) {
		this.agencyName = agencyName;
		return this.agencyName;
	}
	public long getBudget() {
		return budget;
	}
	public long setBudget(long budget) {
		this.budget = budget;
		return this.budget;
		
	}
	public String print() {
		return "Concrete Method ";
	}
	
	abstract void displayDetails();
	abstract void displayDetails(String agencyName,long budget);
	@Override
	public String toString() {
		return "GovernmentAgency [agencyName=" + agencyName + ", budget=" + budget + "]";
	}

}
