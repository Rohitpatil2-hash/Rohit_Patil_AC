import java.util.Scanner;
import java.util.Arrays;
public class AscendingO{
public static void main(String args []){
Scanner Obj=new Scanner(System.in);
int nums []=new int[5];
System.out.println("Enter the 5 integers : ");
for(int i=0;i<5;i++){
nums[i]=Obj.nextInt();
}
Arrays.sort(nums);
for(int i=0;i<5;i++){
System.out.print(nums[i]+" ");
}
}
}

