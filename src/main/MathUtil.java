package main;

public class MathUtil {

	public int add(int a, int b) {
		return a+b;		
	}
	
	public int subtract (int a, int b) {
		return a-b;
	}
	
	public double divide (int a, int b) {
		return (double) a/b;		
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public double circumference(int a) {
		return Math.PI * 2*a;
	}
	
}
