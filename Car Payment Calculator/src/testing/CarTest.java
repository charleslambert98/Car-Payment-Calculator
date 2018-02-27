package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Car;

class CarTest {

	@Test
	void testCar() {
		double carPrice, downPayment, interestRate;
		int lengthLoan;
		
		carPrice = 35000;
		downPayment = 0;
		lengthLoan = 60;
		interestRate = 0.10;
		
		Car car = new Car(carPrice, downPayment, lengthLoan, interestRate);
		assertEquals(743.65, car.calcMonthlyPay());
		assertEquals(9618.79, car.calcTotalSpent());
	}
	
	@Test
	void testCar2() {
		double carPrice, downPayment, interestRate;
		int lengthLoan;
		
		carPrice = 100000;
		downPayment = 0;
		lengthLoan = 360;
		interestRate = 0.06;
		
		Car car2 =  new Car(carPrice, downPayment, lengthLoan, interestRate);
		assertEquals(599.55, car2.calcMonthlyPay());
		assertEquals(115838.19, car2.calcTotalSpent());
	}

}
