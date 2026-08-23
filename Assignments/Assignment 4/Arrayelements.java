import java.util.Scanner;
public class Arrayelements{
public static void main(String args []){
Scanner sc = new Scanner(System.in);

int A[] = new int [5] ;
System.out.println("Enter the five integer elements : ");
for(int i=0; i<5; i++){
          A[i]=sc.nextInt();
}
         
for(int i:A){
              System.out.print(i+" ");
}
}
}






