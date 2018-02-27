package main;

import java.text.DecimalFormat;

public class Car {
	private double carPrice;
	private double downPayment;
	private int lengthLoan;
	private double interestRate;
	private double monthlyPay;
	private double totalSpent;
	DecimalFormat numberFormat = new DecimalFormat("#.00"); //Formats the double values
	
	
	public Car(double carPrice, double downPayment, int lengthLoan, double interestRate) {
		super();
		this.carPrice = carPrice;
		this.downPayment = downPayment;
		this.lengthLoan = lengthLoan;
		this.interestRate = interestRate;
	}
	
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public double getDownPayment() {
		return downPayment;
	}
	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}
	public int getLengthLoan() {
		return lengthLoan;
	}
	public void setLengthLoan(int lengthLoan) {
		this.lengthLoan = lengthLoan;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	public double getMonthlyPay() {
		return monthlyPay;
	}
	public void setMonthlyPay(double monthlyPay) {
		this.monthlyPay = monthlyPay;
	}
	public double getTotalSpent() {
		return totalSpent;
	}
	public void setTotalSpent(double totalSpent) {
		this.totalSpent = totalSpent;
	}
	
	public double calcMonthlyPay() {
		
		double amount = getCarPrice() - getDownPayment();
		double discountFactor = (((Math.pow(1+(getInterestRate()/12),getLengthLoan()) - 1) / ((getInterestRate()/12)*Math.pow(1+(getInterestRate()/12),getLengthLoan()))));
		monthlyPay = amount/discountFactor;
		
		setMonthlyPay(monthlyPay);
		
		return Double.parseDouble(numberFormat.format(getMonthlyPay()));
	}
	
	public double calcTotalSpent() {
		return Double.parseDouble(numberFormat.format(((getMonthlyPay()*getLengthLoan()) - getCarPrice() - getDownPayment())));
	}
}
