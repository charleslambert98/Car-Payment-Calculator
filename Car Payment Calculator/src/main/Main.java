package main;

public class Main {
	public static void main(String[] args) {
		double carPrice, downPayment, interestRate;
		int lengthLoan;
		
		carPrice = 100000;
		downPayment = 0;
		lengthLoan = 360;
		interestRate = 0.06;
		
		Car car = new Car(carPrice, downPayment, lengthLoan, interestRate);
		System.out.println(car.calcMonthlyPay());
		System.out.println(car.calcTotalSpent());
	}
}
