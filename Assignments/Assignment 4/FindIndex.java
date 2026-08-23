import java.util.Scanner;
import java.util.Arrays;
public class FindIndex{
public static void main(String args[]){
Scanner Obj=new Scanner(System.in);
int Arr[]=new int[5];
System.out.println("Enter the 5 integers : ");
for(int i=0;i<5;i++){
Arr[i]=Obj.nextInt();
}
System.out.println("Enter the element which you want to find their index : ");
int number=Obj.nextInt();
int Index=Arrays.binarySearch(Arr,number);
if(Index>=0 && Index<=4){
System.out.println("The number " + number + " is found at index " + Index);
}
else{
System.out.println("Not Found");
}
}
}
 

