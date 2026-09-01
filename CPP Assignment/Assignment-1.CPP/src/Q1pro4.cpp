/*
 * Q1pro4.cpp
 *
 *  Created on: 29-Aug-2026
 *      Author: DELL
 */
#include <iostream>

using namespace std;

int main(int argc, char *argv[])
{

    if (argc != 4)
    {
        cout << "Usage   : ./sensor_monitor <warn_threshold> <critical_threshold> <num_readings>" << endl;
        cout << "Error   : Missing arguments." << endl;
        return 1;
    }


    int warn = atoi(argv[1]);
    int critical_threshold = atoi(argv[2]);
    int num_readings = atoi(argv[3]);


    if (warn >= critical_threshold)
    {
        cout << "Error   : Warn threshold must be less than critical threshold." << endl;
        return 1;
    }


    if (num_readings < 1 || num_readings > 500)
    {
        cout << "Error   : Number of readings must be between 1 and 500." << endl;
        return 1;
    }


    int normal = 0;
    int warning = 0;
    int critical = 0;
    int shutdown = 0;


    srand(time(0));


    for (int i = 0; i < num_readings; i++)
    {
        int temperature = rand() % 70;

        if (temperature < warn)
        {
            normal++;
        }
        else if (temperature < critical_threshold)
        {
            warning++;
        }
        else if (temperature < 60)
        {
            critical++;
        }
        else
        {
            shutdown++;
        }
    }


    cout << "Config  : Warn=" << warn
         << "°C  Critical=" << critical_threshold
         << "°C  Readings=" << num_readings << endl;

    cout << "Results : Normal:" << normal
         << "  Warning:" << warning
         << "  Critical:" << critical
         << "  Shutdown:" << shutdown << endl;

    return 0;
}





