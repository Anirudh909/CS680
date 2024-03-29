package edu.umb.cs680.hw13;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PriceComparatorTest {

	static LinkedList<Car> usedCars = new LinkedList<Car>();
    static Car car1;
    static Car car2;
    static Car car3;
    
    @BeforeAll
    public static void setUp() {
 	   car1 = new Car("honda", "crv", 2019, 33, 85000);
 	   car2 = new Car("benz", "cla", 2020, 40, 100000);
   	   car3 = new Car("audi", "tt", 2018, 30, 95000);   		
   	   usedCars.add(car1);
   	   usedCars.add(car2);
   	   usedCars.add(car3);
    }
    
    @Test
    public void priceSortingWithComparatorComparing() {
		Comparator<Car> compare = Comparator.comparing(Car::getPrice);
		Collections.sort(usedCars, compare);
		assertEquals(car1, usedCars.get(0));
		assertEquals(car3, usedCars.get(1));
		assertEquals(car2, usedCars.get(2));
			
	}
     @Test
     public void priceSorting() {
		
    	Collections.sort(usedCars, (Car obj1, Car obj2) -> (int) (obj2.getPrice() - obj1.getPrice()));
 		assertEquals(car2, usedCars.get(0));
 		assertEquals(car3, usedCars.get(1));
 		assertEquals(car1, usedCars.get(2));
	}


}
