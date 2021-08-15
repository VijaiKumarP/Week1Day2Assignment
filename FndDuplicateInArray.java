package Week1.Day2;

public class FndDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,9,5,8,5,3,2,6,8,0,5,34,1,34};
		String dupArValue=" ";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				String c=Integer.toString(arr[i]); 
				if (i==j) {
					continue;
				} else if (dupArValue.length() >0)  {
					if (dupArValue.indexOf(c) > 0) {
						break;
					}
				}
				
				
				if (arr[j]==arr[i]) {
					dupArValue= dupArValue + arr[i] + "  ";
					break;
				}
				
			}
		}
		System.out.println("Duplicate elements in the Array is -> " + dupArValue);
	}

}
