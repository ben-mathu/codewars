#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

class MainClass {
    public:
        bool narcissistic(int value);
};

bool MainClass::narcissistic(int value) {
    int count = 0;
    vector<int> newValues;
    int temp = value;
    while (temp != 0)
    {
        newValues.push_back(temp % 10);
        temp /= 10;
        count++;
    }

    int total = 0;
    for (auto i = newValues.begin(); i != newValues.end(); ++i)
        total += pow(*i, count);
    
    bool isNarcissistic;
    if (total == value)
    {
        isNarcissistic = true;
    } else {
        isNarcissistic = false;
    }
    

    cout << "Output of begin and end: "; 
    for (auto i = newValues.begin(); i != newValues.end(); ++i) 
        cout << *i << " ";
  
    cout << "\nOutput of cbegin and cend: "; 
    for (auto i = newValues.cbegin(); i != newValues.cend(); ++i) 
        cout << *i << " ";
  
    cout << "\nOutput of rbegin and rend: "; 
    for (auto ir = newValues.rbegin(); ir != newValues.rend(); ++ir) 
        cout << *ir << " ";
  
    cout << "\nOutput of crbegin and crend : "; 
    for (auto ir = newValues.crbegin(); ir != newValues.crend(); ++ir) 
        cout << *ir << " ";

    cout << endl << count << endl;

    return isNarcissistic;
}

int main(int argc, char const *argv[])
{
    MainClass mainClass;
    bool result = mainClass.narcissistic(7);
    if (result)
    {
        cout << "You've got it." << endl;
    } else {
        cout << "You've not got it." << endl;
    }
    return 0;
}

