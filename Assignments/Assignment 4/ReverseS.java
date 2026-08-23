import java.util.Scanner;
public class ReverseS{
public static void main(String args []){
Scanner Obj=new Scanner(System.in);
System.out.println("Enter a string :");
String A=Obj.nextLine();
String B="";
for(int i=A.length()-1;i>=0;i--){
   B=B+A.charAt(i);
   }
System.out.println("Reversed String : " + B);
}
}