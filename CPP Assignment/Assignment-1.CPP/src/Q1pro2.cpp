/*
 * problem2.cpp
 *
 *  Created on: 29-Aug-2026
 *      Author: DELL
 */
#include <iostream>

using namespace std;

int main()
{
    int n;
    double temp[100];

    cout << "Enter number of readings: ";
    cin >> n;

    // Read N temperature values
    for(int i = 0; i < n; i++)
    {
        cin >> temp[i];
    }

    int skipped = 0;
    int valid = 0;

    double minTemp = 999999;
    double maxTemp = -999999;
    double sum = 0;

    int normal = 0;
    int warning = 0;
    int critical = 0;
    int shutdown = 0;

    cout << "\nValid readings : ";

    // Single loop for analysis
    for(int i = 0; i < n; i++)
    {
        // Skip invalid sensor readings
        if(temp[i] < 0)
        {
            skipped++;
            continue;
        }

        // Print valid reading
        cout << temp[i] << "  ";

        // Min
        if(temp[i] < minTemp)
            minTemp = temp[i];

        // Max
        if(temp[i] > maxTemp)
            maxTemp = temp[i];

        // Sum and valid count
        sum += temp[i];
        valid++;

        // Categories
        if(temp[i] < 30)
            normal++;
        else if(temp[i] < 45)
            warning++;
        else if(temp[i] < 60)
            critical++;
        else
            shutdown++;
    }

    // Find first reading >= 45
    int firstCriticalIndex = -1;

    for(int i = 0; i < n; i++)
    {
        if(temp[i] < 0)
            continue;

        if(temp[i] >= 45)
        {
            firstCriticalIndex = i;
            break;
        }
    }

    double average = sum / valid;



    cout << "\n\nSkipped (errors) : " << skipped;

    if(firstCriticalIndex != -1)
    {
        cout << "\nFirst CRITICAL : Index "
             << firstCriticalIndex
             << " -> "
             << temp[firstCriticalIndex]
             << " C";
    }
    else
    {
        cout << "\nFirst CRITICAL : None";
    }

    cout << "\nMin : " << minTemp << " C";
    cout << "\nMax : " << maxTemp << " C";
    cout << "\nAvg : " << average << " C";

    cout << "\nNormal: " << normal;
    cout << "   Warning: " << warning;
    cout << "   Critical: " << critical;
    cout << "   Shutdown: " << shutdown;

    return 0;
}






