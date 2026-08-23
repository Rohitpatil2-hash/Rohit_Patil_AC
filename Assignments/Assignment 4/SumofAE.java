import java.util.Scanner;
public class SumofAE{
public static void main(String args []){
Scanner Obj= new Scanner(System.in);
int Arr []=new int[5];
System.out.println("Enter the 5 integer array elements :");
for(int i=0; i<5; i++){
Arr[i]=Obj.nextInt();
}
int sum=0;
for(int i:Arr){
 sum=sum + i;
   }
System.out.println("The sum of all numbers is: "+ sum);
}
}
