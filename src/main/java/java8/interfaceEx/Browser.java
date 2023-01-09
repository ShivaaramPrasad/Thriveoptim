package java8.interfaceEx;

public interface Browser {

	public void get();

	public String getTitle();

	public void close();

	// default method is introduced in java 8 : Backward compatibitiy 
	default void maximize() {
		System.out.println("Browser is maximised ");


	}
	// static method 1.8 
	static void quit() {
		System.out.println("All open Browser is closed ");
	}


}
