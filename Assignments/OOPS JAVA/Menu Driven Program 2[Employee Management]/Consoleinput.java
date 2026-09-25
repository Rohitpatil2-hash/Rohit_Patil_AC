package company;
public class Consoleinput {
	
	public static int getInt() {
		String str = adn();
		int num = Integer.parseInt(str);
          return num;}
	public static float getfloat() {
		String str = adn();
		
		float num1 = Float.parseFloat(str);
          return num1;}
	
		
	
	


 public static String  adn(){
	try {
byte A[] = new byte[100];
//System.out.println("Enter the value : ");
int length =System.in.read(A);
byte B [] = new byte [length - 2];
System.arraycopy(A, 0, B, 0, length - 2);
String str = new String(B);

return str;

	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}
}




