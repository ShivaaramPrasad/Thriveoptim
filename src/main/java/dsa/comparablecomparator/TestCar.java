package dsa.comparablecomparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestCar {

	public static void main(String[] args) {
		ArrayList<Car> listCars= new ArrayList<Car>();
		listCars.add(new Car(7000, "Maruthi", "Petrole"));
		listCars.add(new Car(2200, "KIA", "Pertol"));
		listCars.add(new Car(4800, "Tesla", "EV"));
		listCars.add(new Car(3000, "Ambassador", "Diesel"));

		Collections.sort(listCars, (Car1,Car2) -> { return Car1.compareTo(Car2);});
	/*	Collections.sort(listCars, new Comparator<Car>() {

			@Override
			public int compare(Car car1, Car car2) {
				if(car1.getPrice() < car2.getPrice())
				return 1;
				else if (car1.getPrice() > car2.getPrice())	return -1;
				else return 0;
			} 
				 
		});
      */  System.out.println(listCars);
	
		for (Car car : listCars) {
			System.out.println(car.toString());
		}
		
	}
}