package Week1.Day2;

public class FndIntersection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry1= {1,8,3,5,1,0,9};
		int[] arry2= {4,6,2,0,7,3,2};
		String interSction="";
		
		for (int i = 0; i < arry1.length; i++) {
			
			for (int j = 0; j < arry2.length; j++) {
				if (arry1[i] == arry2[j] ) {
					interSction=interSction +arry1[i] + "  ";
					break;
				}
			}
			
			
			
		}
		System.out.println("The Intersection nubers of the two given array is " + interSction);
	}
	


}
