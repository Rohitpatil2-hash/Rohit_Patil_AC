import java.util.Scanner;
public class CountV{
public static void main(String args []){
Scanner Obj=new Scanner(System.in);
System.out.println("Enter a string :");
String Ar=Obj.nextLine();
int num=0;
for(int i=Ar.length()-1;i>=0;i--){
   if(Ar.charAt(i)=='a' || Ar.charAt(i)=='e' || Ar.charAt(i)=='i' || Ar.charAt(i)=='o' || Ar.charAt(i)=='u' || Ar.charAt(i)=='A'              || Ar.charAt(i)=='E' || Ar.charAt(i)=='I' || Ar.charAt(i)=='O' || Ar.charAt(i)=='U'){
     num=num + 1;
     }
   }
System.out.println("The number of vowels in '" + Ar + "' is : " + num);
}
}