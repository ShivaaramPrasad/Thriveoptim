package java8.interfaceEx;

public class Edge implements Browser {

	@Override
	public void get() {
		System.out.println("Browser Edge is launched");		
	}

	@Override
	public String getTitle() {
		return "Shivaaram";
	}

	@Override
	public void close() {
		System.out.println("Browser is closed");		
		
	}

}
