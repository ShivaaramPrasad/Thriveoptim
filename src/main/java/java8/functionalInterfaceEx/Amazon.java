package java8.functionalInterfaceEx;

//@FunctionalInterface // can have only one interface method ==1
public interface Amazon {

	public void searchItem(String type);

	public void bookOrder(String item, int qty);

	public void cancelOder(String orderNumber);

}
