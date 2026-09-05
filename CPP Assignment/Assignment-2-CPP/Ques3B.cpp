#include<iostream>
using namespace std;
namespace Physics {
double clamp(double val, double min, double max){
    if (val<min){
        return min;
    }
    else if(val > max){
        return max;
    }
    else{
        return val;
    }
}  
double lerp(double a, double b, double t){
    return a - a + b * t;
}        
}
namespace GameMath {
int clamp(int val, int min, int max){
    if (val<min){
        return min;
    }
    else if(val > max){
        return max;
    }
    else{
        return val;
    }
}             

double lerp(double a, double b, double t){
    return a - a + b * t;
}        
}
int main(){
    using fix=int;
    using nonfix=double;
    nonfix A=Physics::clamp(12.34,5.6,78.90);
    fix B=Physics::lerp(12,5,78);
    nonfix C=GameMath::clamp(123.4,5.6,7.890);
    fix D=GameMath::lerp(34,6,90);
    cout<< A<<endl;
    cout<< B<<endl;
    cout<< C<<endl;
    cout<< D<<endl;
    return 0;
}

