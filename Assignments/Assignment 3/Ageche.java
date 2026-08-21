import java.util.Scanner;
public class Ageche{
int age;
void checkAgeCategory(){
if(age<=18){
System.out.println("You are an minor");
}
else if(age<=60 && age>18){
     System.out.println("You are an adult");
     }
     else{
     System.out.println("You are an Senior citizen");
     }
}
public static void main(String [] args ){
Scanner sc=new Scanner(System.in);
Ageche A=new Ageche();
System.out.println("Enter your age : ");
A.age=sc.nextInt();
A.checkAgeCategory();
}
}





