package com.edubridge.finalkeyword;

public class Card {
	private String cardName;
	private final String issuer="GOI";
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getIssuer() {
		return issuer;
	}
	@Override
	public String toString() {
		return "Card [cardName=" + cardName + ", issuer=" + issuer + "]";
	}
	final void print(final int x) {
//		x=2+5;
		System.out.println("Final Method");
		
	}
}
