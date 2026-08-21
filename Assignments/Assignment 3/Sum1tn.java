import java.util.Scanner;
public class Sum1tn{
void calculateSum(){
Scanner sc=new Scanner(System.in);
int No;
int sum= 0;
System.out.println("Enter a Number : ");
No=sc.nextInt();
for(int i=1; i<=No ; i++){
sum =sum + i;
}
System.out.println("The sum of numbers from 1 to " + No + " is : " + sum);
}
public static void main (String args []){
Sum1tn A=new Sum1tn();
 A.calculateSum();
}
}

 