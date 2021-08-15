package Week1.Day2;

public class ChangeOddIndexToUPcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String toUpCaseOddIndex="welcome to test leaf";
		


		char[] arrToUpCaseOddIndex = toUpCaseOddIndex.toCharArray();
		//char strTmp="";
		for (int i = 0; i < arrToUpCaseOddIndex.length; i++) {

			if ((i%2)==0 ) {
				arrToUpCaseOddIndex[i]=Character.toUpperCase(arrToUpCaseOddIndex[i]);
			}

		}
		
		System.out.println("Change Odd Index to UpperCase Result : " + new String(arrToUpCaseOddIndex));
	}

}
