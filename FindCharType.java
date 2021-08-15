package Week1.Day2;

import java.util.Iterator;

public class FindCharType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strValue="kjk 23bj4kjh4)*^&kj&65NBNKH8";
		char[] strValueArr = strValue.toCharArray();
		int iletter=0,iSpace=0,iNum=0,iSpecialChar=0;
		for (int i = 0; i < strValueArr.length; i++) {
			if (Character.isLetter(strValueArr[i])) {
				iletter++;
			} else if (Character.isSpaceChar(strValueArr[i])) {
				iSpace++;
			} else if (Character.isDigit(strValueArr[i])) {
				iNum++;
			} else {
				iSpecialChar++;
			}
		}
		System.out.println("Main String - '" + strValue +"'");
		System.out.println("No of Aplhabets : " +iletter);
		System.out.println("No of Spaces : " +iSpace);
		System.out.println("No of Integers : " +iNum);
		System.out.println("No of Special Characters : " +iSpecialChar);
	}

}
