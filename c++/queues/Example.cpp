#include <iostream>
#include <stdalign.h>

using namespace std;

int main(int argc, char const *argv[])
{
    srand(time(0));
    for (int i = 0; i <= 20; i++) {
        cout << "index" << i << " " << rand() % 3 + 1 << endl;
    }
    int valueArr[] = {3,10,1};

    int minValue = valueArr[0];
    for (int i = 0; i < 3; i++) {
        if (valueArr[i] < minValue)
        {
            minValue = valueArr[i];
        }
        
    }
    cout << minValue << endl;
    return 0;
}
