#include<iostream>
using namespace std;
int level=10;
namespace Engine{
        namespace Audio{
            void playSound(string name){
                cout<<"Playing : "<<name<<endl;
            } 
        }
    }
int main(){
    int level=1;
    
    cout<<::level<<endl;
    cout<<level<<endl;
    Engine::Audio::playSound("Radharaman hare hare");
    return 0;
}