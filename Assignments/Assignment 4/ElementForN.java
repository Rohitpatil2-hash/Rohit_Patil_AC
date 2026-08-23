import java.util.Scanner;
import java.util.Arrays;
public class ElementForN{
public static void main(String args []){
Scanner Obj=new Scanner(System.in);
Integer A[]=new Integer[5];
System.out.println("Enter the 5 integers : ");
for(int i=0;i<5;i++){
A[i]=Obj.nextInt();
}
System.out.println("Enter the integer you want to check which is present in the array or not : ");
int num= Obj.nextInt();
if(Arrays.asList(A).contains(num)){
              System.out.println("Found");
}
else{
             System.out.println("Not Found");
}
}
}





  


