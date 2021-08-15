package Week1.Day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palindromeStr="LIRIL1";
		String strReverse="";
		char[] charPalindrome = palindromeStr.toCharArray();
		for (int i = (charPalindrome.length)-1; i >=0 ; i--) {
			strReverse=strReverse + charPalindrome[i] ;
		}
		System.out.println("Reversed String Value is : " +strReverse);
	}

}
