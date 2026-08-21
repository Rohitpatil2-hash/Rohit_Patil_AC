import java.util.Scanner;
public class Addition{
int A;
int B;
int sumOfTwoNumbers(){
return A + B;
} 
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
Addition Ad=new Addition();
System.out.println("Enter the first number : ");
 Ad.A=obj.nextInt();
System.out.println("Enter the second number : ");
 Ad.B=obj.nextInt();
System.out.println("Sum of "+ Ad.A + " and " + Ad.B + " is " + Ad.sumOfTwoNumbers());
}
}




