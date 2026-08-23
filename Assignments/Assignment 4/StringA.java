import java.util.Scanner;
public class StringA{
public static void main(String args []){
Scanner Obj =new Scanner(System.in);
String A[] = new String[4];
System.out.println("Eneter the  4 names : ");
for(int i=0; i<4; i++){
A[i]=Obj.nextLine();
}
System.out.println("---------------------------------------------------------");
for(String i:A){
System.out.println(i+ " ");
}
}
}