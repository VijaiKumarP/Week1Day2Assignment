package Week1.Day2;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc addObj= new MyCalc();
		MyCalc subObj=new MyCalc();
		MyCalc mulObj=new MyCalc();
		MyCalc divObj=new MyCalc();
		System.out.println(addObj.add(1, 2, 3));		
		System.out.println(addObj.sub(5, 1));
		System.out.println(addObj.mult(100, 10));
		System.out.println(addObj.div(12, 5));

	}

}
