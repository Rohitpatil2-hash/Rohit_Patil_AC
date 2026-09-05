#include<iostream>
using namespace std;
class Patient{
    int patientId;
string name;
int age;
string ward;
 const string bloodGroup ;

public:
Patient(): patientId(0), name("Unknown"), age(0), ward("General"), bloodGroup("O+"){
    cout<<"Default patient registered."<<endl;
}
Patient(int id, const string& name):patientId(id),name(name){
    cout<<"Emergency admission : "<<name<<endl;
}
Patient(int id, const string& name, int age, const string& ward, const string& bg):patientId(id),name(name),
age(age),ward(ward),bloodGroup(bg){
    cout<< "Full admission : "<<name<<endl; 
}
void takepatientdata(){
    cout<<"enter the patient id  :"<<endl;
    cin>>patientId;
    cout<<"enter the patient name  :"<<endl;
    cin>>name;
    cout<<"enter the patient age  :"<<endl;
    cin>>age;
    cout<<"enter the patient ward  :"<<endl;
    cin>>ward;
    
}
void displayRecord() const{
    cout<<"ID          :"<< patientId<<endl;  
    cout<<"Name        :"<< name<<endl;  
    cout<<"age         :"<< age<<endl;  
    cout<<"ward        :"<< ward<<endl; 
    cout<<"bloodGroup  :"<< bloodGroup<<endl;  
}
void transferWard(const string& newWard){
    cout<<"Ward Transfer : "<<name<< "→"<<newWard<<endl;
}
~Patient(){
     cout<<"Patient "<<name<<" discharged."<<endl;
}
};
int main(){
Patient A(1001, "Meera_Joshi",34,"cardiology","B+");
Patient B(1002, "Raj_Patel");
Patient C;
Patient D;
Patient* Array=new Patient[4];
for(int i=0;i<4;i++){
    Array[i].takepatientdata();
}
for(int i=0;i<4;i++){
    Array[i].displayRecord();
}
B.transferWard("ICU");
delete [] Array; 
return 0;


}







