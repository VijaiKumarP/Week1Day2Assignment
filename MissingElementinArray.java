package Week1.Day2;

import java.util.Arrays;

public class MissingElementinArray {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry= {1,2,3,4,5,9,7,8,10};
		int j=0;
		String MissElement="";
		Arrays.sort(arry);
		for (int i = arry[0]; i < arry.length; i++) {
			if (i !=arry[j]  ) {
				MissElement=MissElement + (i) + "  ";
				continue;
			}
			j++;
		}
		
		System.out.println("The Missing Element are - " +MissElement);
	}

}
