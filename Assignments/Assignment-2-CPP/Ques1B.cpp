#include<iostream>
using namespace std;
double reorderCost(int qty, double unitPrice){
        int restosingcost=qty * unitPrice;
        return restosingcost;
}
double reorderCost(double qty, double unitPrice)  {
    int restosingcost=qty * unitPrice;
    return restosingcost;
}      
double reorderCost(int qty, double unitPrice, double taxRate){
     int restosingcost=qty * unitPrice;
     int total=(restosingcost * taxRate)/100;
     int Total=restosingcost + total;
     return Total;
}
double applyDiscount(double price, double discountPercent = 10.0){
    int discount=(price * discountPercent)/100;
    int finalprice=price - discount;
    return finalprice;
}
int main(){
   cout<< reorderCost(10,20.5)<<endl;
    cout<<reorderCost(5.5,700)<<endl;
    cout<<reorderCost(30,4.5,28)<<endl;
    cout<<applyDiscount(12345.67)<<endl;
    cout<<applyDiscount(67890.12,15)<<endl;
    return 0;

}