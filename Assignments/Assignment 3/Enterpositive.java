import java.util.Scanner;
public class Enterpositive{
int askForPositiveNumber() {
Scanner sc=new Scanner(System.in);
int num;
do{
System.out.println("Enter a Positive number :" );
num=sc.nextInt();
num++;
   } while(num<0);
   return num;
}
public static void main(String args []) {
Enterpositive A=new Enterpositive();
System.out.println("You Entered the positive number : " + A.askForPositiveNumber());
}
}




