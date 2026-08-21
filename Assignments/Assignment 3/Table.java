import java.util.Scanner;
public class Table{
void printMultiplicationTable(){
Scanner sc =new Scanner(System.in);
int num;
System.out.println("Enter a number : ");
num=sc.nextInt();
for(int i=1; i<=10; i++){
    int mul= num * i;
   System.out.println(num + " * " + i + " = " + mul);
}
}
public static void main(String args[]){
Table A=new Table();
A.printMultiplicationTable();
}
}
