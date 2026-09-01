/*
 * q2pro2.cpp
 *
 *  Created on: 30-Aug-2026
 *      Author: DELL
 */
#include <iostream>
#include <cmath>
using namespace std;

double computeRMS(double* signal, int n)
{
    double sum = 0.0;
    double* ptr = signal;

    for (int i = 0; i < n; i++)
    {
        sum += (*ptr) * (*ptr);
        ptr++;
    }

    return sqrt(sum / n);
}

void normalise(double* signal, int n)
{
    double* ptr = signal;


    double maxAbs = fabs(*ptr);

    for (int i = 1; i < n; i++)
    {
        ptr++;

        if (fabs(*ptr) > maxAbs)
            maxAbs = fabs(*ptr);
    }


    ptr = signal;

    for (int i = 0; i < n; i++)
    {
        *ptr = *ptr / maxAbs;
        ptr++;
    }
}

int countZeroCrossings(double* signal, int n)
{
    int count = 0;
    double* ptr = signal;

    for (int i = 0; i < n - 1; i++)
    {
        if ((*ptr < 0 && *(ptr + 1) > 0) ||
            (*ptr > 0 && *(ptr + 1) < 0))
        {
            count++;
        }

        ptr++;
    }

    return count;
}

void applyGain(double* signal, int n, double gainFactor)
{
    double* ptr = signal;

    for (int i = 0; i < n; i++)
    {
        *ptr = *ptr * gainFactor;
        ptr++;
    }
}

void printArray(double* signal, int n)
{
    double* ptr = signal;

    for (int i = 0; i < n; i++)
    {
        cout << *ptr << " ";
        ptr++;
    }

    cout << endl;
}

int main()
{
    double signal[] = {0.5, -1.2, 0.8, -0.3, 1.0, -0.9, 0.1};
    int n = 7;

    cout << "Array before processing:" << endl;
    printArray(signal, n);

    double rms = computeRMS(signal, n);
    int zeroCrossings = countZeroCrossings(signal, n);

    normalise(signal, n);

    cout << "\nArray after normalise():" << endl;
    printArray(signal, n);

    applyGain(signal, n, 2.0);

    cout << "\nArray after applyGain(2.0):" << endl;
    printArray(signal, n);

    cout << "\nRMS = " << rms << endl;
    cout << "Zero Crossings = " << zeroCrossings << endl;

    return 0;
}




