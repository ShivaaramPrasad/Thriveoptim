package java8.stream;

public class ZoomCars {
	
	// getter(read access), setter(write access)
	private String name;
	private int price;
	private float  rating;
	// Constructor --> Like a method with the name of class) and while no return type
	public ZoomCars(String carName, int carPrice, float carRating) {
		this.name =carName;
		this.price =carPrice;
		this.rating =carRating;

	}
	// this keyword refers to the local class reference --> hence to the variable 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	

}
