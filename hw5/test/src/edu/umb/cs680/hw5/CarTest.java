package edu.umb.cs680.hw5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {
	
	private String[] carToStringArray(Car car) {
		String[] carDetails = {car.getMake(), car.getModel(), Integer.toString(car.getYear())};
		return carDetails;
	}
	
	@Test
	public void verifyCarEqualityWithMakeModelYear() {
		String[] expected = {"Mazda", "Rx8", "2006"};
		Car actual = new Car("Mazda", "Rx8", 20, 2006, 30000);
		assertArrayEquals(expected, carToStringArray(actual) );
	}

}