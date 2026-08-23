import java.util.Scanner;
public class HowmanyPorN{
public static void main(String args []){
Scanner Obj=new Scanner(System.in);
int Arr[] = new int[6];
System.out.println("enter the 6 integers : ");
int B=0;
int C=0;
for(int i=0; i<6;i++){
Arr[i]=Obj.nextInt();
if(Arr[i]<0){
B=B + 1;
}
else{
C = C + 1;
}
}
System.out.println("Positive numbers : "+ C);
System.out.println("Negative numbers : "+ B);
}
}


