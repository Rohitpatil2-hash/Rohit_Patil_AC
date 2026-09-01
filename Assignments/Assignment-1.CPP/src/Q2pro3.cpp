/*
 * Q2pro3.cpp
 *
 *  Created on: 30-Aug-2026
 *      Author: DELL
 */
#include <iostream>
using namespace std;

int main()
{
    int statusReg  = 0b10110001;
    int controlReg = 0b00000000;
    int dataReg    = 0b11001010;

    // -------------------------------------------------
    // regPtr1 : Pointer to const int
    // Can read the value, but cannot modify through pointer.
    // Pointer itself can be repointed.
    // -------------------------------------------------

    const int* regPtr1 = &statusReg;

    cout << "regPtr1 value = " << *regPtr1 << endl;

    // *regPtr1 = 10;
    // ERROR: Cannot modify the value through a pointer
    // to const int.

    regPtr1 = &dataReg;
    cout << "regPtr1 after repointing = " << *regPtr1 << endl;


    // -------------------------------------------------
    // regPtr2 : Const pointer to int
    // Pointer cannot be repointed, but value can be changed.
    // -------------------------------------------------

    int* const regPtr2 = &controlReg;

    *regPtr2 = 25;

    cout << "controlReg after write = " << controlReg << endl;

    // regPtr2 = &dataReg;
    // ERROR: regPtr2 is a const pointer.
    // Its address cannot be changed after initialization.


    // -------------------------------------------------
    // regPtr3 : Const pointer to const int
    // Cannot modify the value and cannot repoint pointer.
    // -------------------------------------------------

    const int* const regPtr3 = &statusReg;

    cout << "regPtr3 value = " << *regPtr3 << endl;

    // *regPtr3 = 50;
    // ERROR: Cannot modify the value because it points
    // to const int.

    // regPtr3 = &dataReg;
    // ERROR: Pointer itself is const, so it cannot be repointed.


    return 0;
}




