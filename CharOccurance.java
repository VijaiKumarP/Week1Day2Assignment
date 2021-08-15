package Week1.Day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strValue="Welcome to TestLeaf";
		char[] strValueArr = strValue.toCharArray();
		char checkChar='o';
		int icount=0;
		for (int i = 0; i < strValueArr.length; i++) {
			if (strValueArr[i]==checkChar) {
				icount++;
			}
		}
		
		System.out.println("Char '" +checkChar +"' found " +icount +" times in - '" + strValue +"'");
	}

}
