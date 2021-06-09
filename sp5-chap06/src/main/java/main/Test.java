package main;

public class Test {

	private static Test myInstance;
	
	private Test() {
		
	}
	
	public static Test getInstance() {
		if(myInstance == null) {
			myInstance = new Test();
		}
		
		return myInstance;
	}
	
	public void printString(String str) {
		System.out.println("Hello World " + str);
	}
}
