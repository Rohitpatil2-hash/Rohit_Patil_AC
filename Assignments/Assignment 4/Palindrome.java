import java.util.Scanner;
public class Palindrome{
public static void main( String args[]){
Scanner Obj=new Scanner(System.in);
System.out.println("Enter a string : ");
String str=Obj.nextLine();
String Rohit="";
for(int i=str.length()-1;i>=0;i--){
   Rohit=Rohit + str.charAt(i);
   }
if(str.equals(Rohit)){
  System.out.println("The string '" + str +"' is a palindrome.");
  }
else{
System.out.println("The string not palindrome.");
}
}
}
