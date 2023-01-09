package java8.interfaceEx;

public class Chrome implements Browser{

	@Override
	public void get() {
		System.out.println("Browser chrome is launched");		
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
