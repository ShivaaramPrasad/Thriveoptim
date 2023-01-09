package java8.functionalInterfaceEx;

public class AmazonImpl{

	Amazon az= new Amazon(){

		@Override
		public void searchItem(String type) {
			System.out.println("The item "+ type+"result in 22 items");			
		}

		@Override
		public void cancelOder(String orderNumber) {
			System.out.println("The order"+orderNumber+" is canclled");			
		}

		@Override
		public void bookOrder(String item, int qty) {
			System.out.println("The order with"+item+" is booked qty "+qty);			
		}
	};

	az.bookOrder("bags", 2);
}
