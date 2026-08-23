import java.util.Scanner;
import java.util.Arrays;
public class FindLN{
public static void main(String args []){
int nums[]=new int [5];
Scanner Obj=new Scanner(System.in);
System.out.println("Enter the 5 integer :");
for(int i=0; i<5; i++){
nums[i]=Obj.nextInt();
}
Arrays.sort(nums);
System.out.println("The largest element is: "+ nums[4]);
}
}
