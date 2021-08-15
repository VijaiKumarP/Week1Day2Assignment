package Week1.Day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="stops";
		String str2="posts";
		boolean bMatch=true;
		char[] str1CharArr = str1.toCharArray();
		char[] str2CharArr = str2.toCharArray();
		Arrays.sort(str1CharArr);
		Arrays.sort(str2CharArr);
		if (str1CharArr.length==str2CharArr.length) {
			
		
			for (int i = 0; i < str1CharArr.length; i++) {
				char tmpChar1=str1CharArr[i];
				char tmpChar2=str2CharArr[i];
				if (tmpChar1!=tmpChar2) {
					bMatch=false;
				}
			}
			
			if (bMatch==true) {
				System.out.println("Is Anagram. Length and value of the given string matches");
			}
			else {
				System.out.println("Not an Anagram. Length matches and Values doesnot match");
			}
		}
		else {
			
			System.out.println("Not an Anagram. Length of the given string doesnot match");
		}
		
	}

}
