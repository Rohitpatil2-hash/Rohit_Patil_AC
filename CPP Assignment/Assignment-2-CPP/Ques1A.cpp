#include<iostream>
using namespace std;
class Product{
int productId;
string name;
double price;
int quantity;
public :
void acceptDetails(){
    cout<<"enter the product id:"<<endl;
    cin>>productId;
    cout<<"enter the product name:"<<endl;
    cin>>name;
    cout<<"enter the product price:"<<endl;
    cin>>price;
    cout<<"enter the product quantity:"<<endl;
    cin>>quantity;
}                 
void displayDetails() const{
    cout<<productId<<"  "<<name<<"                "<<price<<"         "<<quantity<<"       "<<totalValue()<<endl;
}          
double totalValue() const{
    return quantity * price;
}           

bool isLowStock(int threshold) const{
    return quantity < threshold;
} 
void highestvalueproduct(){
    cout<<"Highest Value Product :"<<name<<"  "<<totalValue();
}
void displayname()const{
    cout<<name;
}
 };
int main(){
    Product Arr[5];
for(int i=0;i<5;i++){
    Arr[i].acceptDetails();
}
cout<<"===== INVENTORY REPORT ====="<<endl;
cout<<"ID                    NAME                    PRICE            QUANTITY            TOTALVALUE"<<endl;                
cout<<"------------------------------------------------------------------------------------------------------"<<endl;
for(int i=0;i<5;i++){
    Arr[i].displayDetails();
}
int highvalue=0;
for(int i=1;i<5;i++){
    if(Arr[i].totalValue() > Arr[highvalue].totalValue() ){
        highvalue=i;
    }

}
Arr[highvalue].highestvalueproduct();
int threshold;
cout<<"enter the low stock threshold"<<endl;
cin>>threshold;
bool found=false;
for(int i=0;i<5;i++){
   
        if(Arr[i].isLowStock(threshold)){
        
        cout<<"low stock threshold : ("<<threshold<<") : "<<Arr[i].displayname();
        found =true;
        }
    }
    return 0;
}




