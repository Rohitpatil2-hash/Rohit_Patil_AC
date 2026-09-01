/*
 * Bonus.cpp
 *
 *  Created on: 30-Aug-2026
 *      Author: DELL
 */
#include <iostream>
using namespace std;

struct Layout1
{
    char c1;
    int i;
    char c2;
};

struct Layout2
{
    int i;
    char c1;
    char c2;
};

int main()
{
    cout << "Size of Layout1 = "
         << sizeof(Layout1) << " bytes" << endl;

    cout << "Size of Layout2 = "
         << sizeof(Layout2) << " bytes" << endl;

    /*
    ============================================================
    Explanation:
    ============================================================

    1. Why do the sizes differ?

    Layout1:
        char c1 = 1 byte
        padding = 3 bytes
        int i   = 4 bytes
        char c2 = 1 byte
        padding = 3 bytes

        Total = 1 + 3 + 4 + 1 + 3
              = 12 bytes

    Layout2:
        int i   = 4 bytes
        char c1 = 1 byte
        char c2 = 1 byte
        padding = 2 bytes

        Total = 4 + 1 + 1 + 2
              = 8 bytes

    Therefore, the order of members affects the total structure size.


    2. What is padding and why does the compiler add it?

    Padding is unused memory space inserted by the compiler
    between or after structure members.

    The compiler adds padding to satisfy memory alignment
    requirements.

    For example, an int generally requires a 4-byte aligned
    address. In Layout1, after c1 (1 byte), the compiler adds
    3 padding bytes so that int i starts at a properly aligned
    address.

    Padding at the end may also be added so that the complete
    structure size is a multiple of its alignment requirement.


    3. Why does member order matter?

    Member order matters because different orders can produce
    different amounts of padding and therefore different
    structure sizes.

    This is especially important for:

    - Network packet headers
    - Hardware register maps
    - Memory-mapped I/O
    - Binary file formats

    In these cases, the exact position and size of every member
    can be important because the structure may need to match
    a specific byte layout.

    Therefore, members should be arranged carefully, and when
    an exact binary layout is required, packing/alignment rules
    should be explicitly controlled and verified.
    ============================================================
    */

    return 0;
}
