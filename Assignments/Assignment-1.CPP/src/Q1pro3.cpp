/*
 * Q1pro3.cpp
 *
 *  Created on: 29-Aug-2026
 *      Author: DELL
 */


#include <iostream>

using namespace std;

int main()
{
    double temp[3][3];


    cout << "Enter temperatures for 9 rooms:\n";

    for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            cin >> temp[i][j];
        }
    }



    cout << "\n             Room1   \tRoom2 \tRoom3   \n";

    for(int i = 0; i < 3; i++)
    {
        cout << "Floor " << i + 1 << " :\t";


        for(int j = 0; j < 3; j++)
        {
            cout << temp[i][j] << "\t";
        }

        cout << endl;
    }


    double maxTemp = temp[0][0];
    int hotFloor = 0;
    int hotRoom = 0;

    for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            if(temp[i][j] > maxTemp)
            {
                maxTemp = temp[i][j];
                hotFloor = i;
                hotRoom = j;
            }
        }
    }


    double highestAvg = -1;
    int hottestFloor = 0;

    for(int i = 0; i < 3; i++)
    {
        double sum = 0;

        for(int j = 0; j < 3; j++)
        {
            sum += temp[i][j];
        }

        double avg = sum / 3;

        if(avg > highestAvg)
        {
            highestAvg = avg;
            hottestFloor = i;
        }
    }


    int warningCount = 0;

    for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            if(temp[i][j] >= 30)
            {
                warningCount++;
            }
        }
    }

    // Display results
    cout << "\nHottest Room : Floor "
         << hotFloor + 1
         << ", Room "
         << hotRoom + 1
         << " -> "
         << maxTemp
         << " C";

    cout << "\nHottest Floor : Floor "
         << hottestFloor + 1
         << " (avg "

         << highestAvg
         << " C)";

    cout << "\nRooms at WARNING or above : "
         << warningCount;

    return 0;
}


