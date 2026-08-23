public class Pattern3{
public static void main(String args[]){
for(int i=1; i<=9  ; i=i + 2){
   for(int j=1;j<=i ; j= j + 2){
      System.out.print(j);
      if(j<i){
        System.out.print("*");
        }
      }
   System.out.println();
   }
}
}