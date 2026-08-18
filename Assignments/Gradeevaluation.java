public class Gradeevaluation{
public static void main(String args []){
int m=80;
int s=85;
int h=90;
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
}
}

