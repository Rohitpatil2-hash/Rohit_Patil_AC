/*
 * pro2.cpp
 *
 *  Created on: 28-Aug-2026
 *      Author: DELL
 */
#include<iostream>
using namespace std;
int main(){
	double reading;
	cout <<"Enter the reading"<<endl;
	cin>>reading;
	double  F = (reading * 9)/5 ;
	F = F + 32 ;
	cout<<"Temperature     :     "<<reading<<"°C  /  "<<F<<"°F"<<endl;
    int statuscode;
	if(reading<0){
		statuscode = -1;
	}
	else if(0<=reading && reading<=29){
		statuscode = 0;
	}
	else if(30<=reading &&  reading<=44){
		statuscode = 1;
	}
	else if(45<=reading && reading<=59){
		statuscode = 2;
	}
	else{
		statuscode = 3;
	}
	switch(statuscode){
	case -1:
		cout<<"Status     :     SENSOR_ERROR"<<endl;
		cout<<"Action     :     Sensor fault — check wiring"<<endl;
		break;
	case 3 :
		cout<<"Status     :     SHUTDOWN"<<endl;
		cout<<"Action     :     Emergency shutdown initiated"<<endl;
		break;
	case 1 :
		cout<<"Status     :     WARNING"<<endl;
		cout<<"Action     :     Alert sent to supervisor"<<endl;
		break;
	case 2:
	    cout<<"Status     :     CRITICAL"<<endl;
	    cout<<"Action     :     Cooling system triggered"<<endl;
	    break;
	default :
		cout<<"Status     :     NORMAL"<<endl;
	    cout<<"action     :     No action required"<<endl;

		}
	if(reading>25){
		cout<<"Reading    :     Above average"<<endl;
	}
	else{
		cout<<"Reading    :     Below average"<<endl;
	}
return 0;
}









