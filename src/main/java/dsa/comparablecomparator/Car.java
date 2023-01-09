package dsa.comparablecomparator;

public class Car  implements Comparable<Car>{

	private   int price;
	private  String brand;
	private  String model;

	/*public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Car.price = price;
	}

	public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		Car.brand = brand;
	}

	public static void setModel(String model) {
		Car.model = model;
	}
	public static String getModel() {

		return model;
	}
*/
	public int compareTo(Car car1 )
	{
		return this.price - car1.price;
		//return car1.price != this.price ? (int)(car1.price-this.price) : (int)(this.price-car1.price);

	}

	/*
	 * public int compare(Car m1, Car m2) { return
	 * m1.getBrand().compareTo(m2.getBrand()); }
	 */
	Car(int price, String brand, String model){
		this.price=price;
		this.brand=brand;
		this.model=model;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return brand +" - "+ model+" - "+price;
	}





}
