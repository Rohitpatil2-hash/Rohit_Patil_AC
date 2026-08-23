import java.util.Scanner;
public class Evenno1tN{
public static void main(String args []){
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number :");
int num=obj.nextInt();
for(int i=1; i<=num; i++){
                        if(i%2==0){
                                   System.out.print(i + " ");
                                   }
                        }
}
}