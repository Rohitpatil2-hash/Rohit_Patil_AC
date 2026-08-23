import java.util.Scanner;
public class AverageofAE{
public static void main(String args [] ){
Scanner Obj=new Scanner(System.in);
int A[] =new int[5];
int sum=0;
System.out.println("Enter the 5 integer :");
for(int i=0; i<5; i++){
A[i]=Obj.nextInt();
sum=sum + A[i];
}
int Average= sum/5;
System.out.println("The average of the numbers is: "+ Average);
}
}




