/*
 * Q2pro1.cpp
 *
 *  Created on: 30-Aug-2026
 *      Author: DELL
 */
#include <iostream>
using namespace std;


void resetSensorPairV1(int reading1, int reading2)
{
    int temp = reading1;
    reading1 = reading2;
    reading2 = temp;
}


void resetSensorPairV2(int& reading1, int& reading2)
{
    int temp = reading1;
    reading1 = reading2;
    reading2 = temp;
}


void resetSensorPairV3(int* reading1, int* reading2)
{
    int temp = *reading1;
    *reading1 = *reading2;
    *reading2 = temp;
}

int main()
{
    int A = 55;
    int B = 12;

    /*
     Root Cause of V1:
     V1 uses Call by Value, so copies of A and B are passed
     to the function instead of the original variables.
     The swap happens only between these local copies.
     Therefore, the original A and B in main() remain unchanged.
     To modify the original values, we must use references or pointers.
    */


    cout << "--- V1: Call by Value ---" << endl;
    cout << "Before : A=" << A << "  B=" << B << endl;

    resetSensorPairV1(A, B);

    cout << "After  : A=" << A << "  B=" << B << endl;



    cout << "\n--- V2: Call by Reference ---" << endl;
    cout << "Before : A=" << A << "  B=" << B << endl;

    resetSensorPairV2(A, B);

    cout << "After  : A=" << A << "  B=" << B << endl;



    cout << "\n--- V3: Call by Pointer ---" << endl;
    cout << "Before : A=" << A << "  B=" << B << endl;

    resetSensorPairV3(&A, &B);

    cout << "After  : A=" << A << "  B=" << B << endl;

    return 0;
}




