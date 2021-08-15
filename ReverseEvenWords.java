package Week1.Day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strValue="Welcome to TestLeaf. August Batch";
		
		String[] spStrValue = strValue.split(" ");
		
		for (int i = 0; i < spStrValue.length; i++) {
			if (i%2 != 0) {
				StringBuffer strValueRev = new StringBuffer(spStrValue[i]);
				strValue=strValue.replace(spStrValue[i], strValueRev.reverse().toString());
			} 
		}
		
		System.out.println("Even Words are reversed - '" + strValue +"'");
		
	}

}
