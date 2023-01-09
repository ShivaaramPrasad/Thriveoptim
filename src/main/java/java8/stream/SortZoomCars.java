package java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortZoomCars {
	
	public static void main(String[] arg) {
		List<ZoomCars> cars= new ArrayList<>();
		cars.add(new ZoomCars("Mahindra XUV", 3752, 4.63f));
		cars.add(new ZoomCars("Renault Triber", 2560, 4.41f));
		cars.add(new ZoomCars("Suzuki Baleno", 2200, 4.63f));
		cars.add(new ZoomCars("Tata Tiago", 2272, 4.73f));
		cars.add(new ZoomCars("i20", 2500, 4.93f));
		
		/*
		 Java 1.7
		 1) Traverse through the list
		 2) Get every price 
		 3) FInd the lowest price (if condition)
		 4) After the loop again to find the car that is with the lowest price 
		 */
		
		List<ZoomCars> carSorted =cars.stream()
				.sorted(Comparator.comparing(ZoomCars::getPrice)) //Lowest Price 
				 .sorted(Comparator.comparing(ZoomCars::getRating).reversed())//High Rating
				 .collect(Collectors.toList());
		
		System.out.println(carSorted.get(0).getName());
	

	}

}
