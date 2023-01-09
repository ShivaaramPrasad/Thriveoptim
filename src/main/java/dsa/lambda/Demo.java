package dsa.lambda;

public class Demo {
	@FunctionalInterface
	interface A{
		void show();
	}
	/*
	class B implements A{

		@Override
		public void show() {
			System.out.println("Hi");	
		}

	}*/
	public static void main(String[] args) {
		/*	A obj =new A() {

			@Override
			public void show() {
				System.out.println("Hi");			
			}

	};*/

		A obj =()->System.out.println("Hi");
		obj.show();
	}
}