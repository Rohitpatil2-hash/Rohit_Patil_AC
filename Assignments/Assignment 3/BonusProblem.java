import java.util.Scanner;
public class BonusProblem{
public static void main(String args []){
Scanner O = new Scanner(System.in);
int problem;
do{
       System.out.println("-----------------MENU-------------------");
       System.out.println("Problem 1: Grade Evaluation System ");
       System.out.println("Problem 2: Leap Year Check ");
       System.out.println("Problem 3: Day of the week");
       System.out.println("Problem 4: Identify Default Values of Variables");
       System.out.println("Problem 5: Exit");
       System.out.println("                                                 ");
       System.out.println("Enter a number from (1 - 4) to access the menu and 5 to Exit : " );
        problem = O.nextInt();
                      

switch(problem){
case 1:
                 System.out.println("Enter the marks of math number");
                 int m=O.nextInt();
                 System.out.println("Enter the marks of science number");
                 int s=O.nextInt();
                 System.out.println("Enter the marks of history number");
                 int h=O.nextInt();
             int average=(m+s+h)/3;
            System.out.println("Average of Marks:"+average);
          if (average>=90){
                System.out.println("Grade: A");
             }
         else if(average>=70 && average<=89){
           System.out.println("Grade: B");
             }
         else if(average>=50 && average<=69){
          System.out.println("Grade: C");
          }
          else if(average>=30 && average<=49){
               System.out.println("Grade: D");
               } 
               else {
               System.out.println("Fail");
               }

       
          break;

case 2 :
            System.out.println("Enter the year you want to check leap or not leap");
            int year1=O.nextInt();
           if((year1%4==0 && year1%100!=0)||(year1%400==0)){
           System.out.println(year1+" is a leap year");
             }
           else{
             System.out.println(year1+" is not leap year");
             }
           /* int year2=1900;
            if((year2%4==0 && year2%100!=0)||(year2%400==0)){
           System.out.println(year2+" is a leap year");
             }
              else{
           System.out.println(year2+" is not leap year");
              }*/
          break;

case 3 :
                
                System.out.println("Enter the number of the Day(1 - 7):");
                int day=O.nextInt();
               switch(day){
               case 1:
               System.out.println("The day is Monday");
                 break;
                case 2:
                System.out.println("The day is Tuesday");
              break;
              case 3:
             System.out.println("The day is Wednesday");
              break;
             case 4:
                System.out.println("The day is Thursday");
                break;
             case 5:
                 System.out.println("The day is Friday");
                 break;
             case 6:
                 System.out.println("The day is Saturday");
                  break;
              case 7:
                 System.out.println("The day is Sunday");
                  break;
               default:
              System.out.println("Invalid day Number");
               }
               break;

 case 4 :
               class Uninvariable{
               byte a; 
               short b; 
               int c; 
               long d; 
               float e; 
               double f; 
               char g; 
               boolean h;
                }
               Uninvariable v=new Uninvariable();
                System.out.println(v.a);
                System.out.println(v.b);
               System.out.println(v.c);
               System.out.println(v.d);
              System.out.println(v.e);
              System.out.println(v.f);
               System.out.println(v.g);
               System.out.println(v.h);
               
               break;

case 5 :
         System.out.println("You are existing from the menus");
          break;

default :
           System.out.println("Invalid number");
}
}while(problem!=5);
}
}



