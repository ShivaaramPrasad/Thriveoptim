package java8.functionalInterfaceEx;

public class Flipkart {
	/*
	 Functional Interface - Single( abstract method within a interface
	 Implement Functional Interface --> Anonymous Function and Lambda express (->)
	 */
	public static void main(String[] args) {
		FlipkartSearch search =() -> {
			System.out.println("The item is searched in flipkart");
		};	
		
		FlipkartOrder order = (item, qty) -> {
			System.out.println("The Order for "+item+" with qty "+qty+" is booked");
			return "ORD1834242";
		};
		
		search.searchItem();
		String bookOrder =order.bookOrder("Book", 2);
		System.out.println(bookOrder);
	}
	
	@FunctionalInterface
	public interface FlipkartSearch{
		public void searchItem(); // zero one or multiple args
	}
	
	@FunctionalInterface
	public interface FlipkartOrder{
		public String bookOrder(String item, int qty);
	}

}
