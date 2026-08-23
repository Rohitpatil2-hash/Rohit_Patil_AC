import java.util.Scanner;
public class Multipleof3{
public static void main(String args []){
Scanner obj=new Scanner(System.in);
System.out.println("enter the number : ");
int num= obj.nextInt();
for (int i=1 ;i<=num ;i++){
    if(i%3==0){
     System.out.print(i+" ");
    }
}
}
}
 
    
    