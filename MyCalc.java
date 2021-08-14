package Week1.Day2;

public class MyCalc {

	public int add(int a, int b, int c) {
		System.out.println("Addition of (" + a +"+" +b +"+" +c + ")");
		return (a+b+c);
		
	}
	public int sub(int a, int b) {
	
		if (a>b) {
			System.out.println("Subtraction of (" + a +"-" +b + ")");
			return (a-b);
					
		} else {
			System.out.println("Subtraction of (" + a +"-" +b + ")");
			return (b-a);
						
		}
		
		
	}
	public double mult(double a, double b) {
		System.out.println("Multiplication of (" + a +"*" +b + ")");
			return (a*b);		
	}
	
	public float div(float a, float b) {
		System.out.println("Division of (" + a +"/" +b + ")");
		return (a/b);		
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	} */

}
