package com.training;

public class CreditCard {

	private String cardNmuber;
	private String cardHolderName;
	private double amountDue;
	public CreditCard(String cardNmuber, String cardHolderName, double amountDue) {
		super();
		this.cardNmuber = cardNmuber;
		this.cardHolderName = cardHolderName;
		this.amountDue = amountDue;
	}
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCardNmuber() {
		return cardNmuber;
	}
	public void setCardNmuber(String cardNmuber) {
		this.cardNmuber = cardNmuber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public double getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
	
	
	
	
}
