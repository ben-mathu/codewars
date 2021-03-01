#include <iostream>
using namespace std;

class MainClass {
    public:
        bool narcissistic(int value);
};

bool MainClass::narcissistic(int value) {
    int count = 0;
    while (value != 0)
    {
        int newValue = value / 10;
        count++;
    }

    cout << count << endl;
    
    return true;
}

int main(int argc, char const *argv[])
{
    MainClass mainClass;
    bool result = mainClass.narcissistic(8);
    if (result)
    {
        cout << "You've got it." << endl;
    } else {
        cout << "You've not got it." << endl;
    }
    return 0;
}
