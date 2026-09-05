#include<iostream>
using namespace std;
int main(){
int** array=new int*[3];
for(int i=0;i<3;i++){
    array[i]=new int[4];
}
cout<<"enter the 12 grid : "<<endl;
for (int i=0;i<3;i++){
    for(int j=0;j<4;j++){
        cin>>array[i][j];
    }
    }
 for (int i=0;i<3;i++){
    for(int j=0;j<4;j++){
        cout<<array[i][j]<<"  ";
    }
    cout<<  endl;
    } 
int Grass=0 ;
int Water=0  ;
 int Mountain=0 ;
int Forest =0 ;
int Dungeon=0 ;
for(int i=0;i<3;i++){
    for(int j=0;j<4;j++){
        if(array[i][j]==0){
    Grass ++;
} 
else if(array[i][j]==1){
    Water ++;
}  
 else if(array[i][j]==2){
    Mountain ++;
}
else if(array[i][j]==3){
    Forest ++;
}
else if(array[i][j]==4){
    Dungeon ++;
}
    }
}
cout<<"Legend: 0=Grass  1=Water  2=Mountain  3=Forest  4=Dungeon"<<endl;
cout<<"Tile Count : "<<endl;
cout<<"Grass : "<<Grass<<endl;
cout<<"Water : "<<Water<<endl;
cout<<"Mountain : "<<Mountain<<endl;
cout<<"Forest : "<<Forest<<endl;
cout<<"Dungeon : "<<Dungeon<<endl;
return 0;
}

