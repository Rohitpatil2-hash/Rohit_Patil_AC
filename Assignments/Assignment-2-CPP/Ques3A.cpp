#include<iostream>
using namespace std;
class Entity{
string name;
int health;
int level;
string type ;
public :
Entity& setName(const string& name){
    this->name=name;
     return *this;
    }
Entity& setHealth(int health){
    this->health=health;
     return *this;
}
Entity& setLevel(int level){
    this->level=level;
     return *this;
}
Entity& setType(const string& type){
    this->type=type;
     return *this;
}
string getName()  const{
    return name;
}
    
int getHealth() const{
    return health;
}

int  getLevel()  const{
       return level;
}

string getType()   const{
    return type;
}

void displayinfo() const{
    cout<<"name is : "<<name<<endl;
    cout<<"health is : "<<health<<endl;
    cout<<"level is : "<<level<<endl;
    cout<<"type is : "<<type<<endl;
}
};
int main(){
    Entity Player, Enemy, Item ;
    Player.setName("Aragorn").setHealth(100).setLevel(10).setType("player");
    Enemy.setName("Orc").setHealth(60).setLevel(5).setType("enemy");
    Item.setName("HealthPotion").setHealth(0).setLevel(1).setType("item");

    Player.displayinfo();
    cout<<"----------------------------------"<<endl;
    Enemy.displayinfo();
    cout<<"----------------------------------"<<endl;
    Item.displayinfo();
    return 0;
}