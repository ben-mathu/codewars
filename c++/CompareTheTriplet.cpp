#include <iostream>
#include <vector>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);

vector<int> compareTriplets(vector<int> a, vector<int> b) {
    int aCount = 0;
    int bCount = 0;
    for (int i = 0; i < a.size(); i++) {
        if (a.at(i) > b.at(i)) {
            aCount++;
        } else if (a.at(i) < b.at(i)) {
            bCount++;
        }
    }

    vector<int> comparePoints;
    comparePoints.push_back(aCount);
    comparePoints.push_back(bCount);
    return comparePoints;
}

int main()
{
    vector<int> aInput;
    aInput.push_back(1);
    aInput.push_back(2);
    aInput.push_back(3);

    vector<int> bInput;
    bInput.push_back(3);
    bInput.push_back(2);
    bInput.push_back(1);

    vector<int> comparedItems = compareTriplets(aInput, bInput);

    cout << "Alice's Score: " << comparedItems.at(0) << endl;
    cout << "Bob's Score: " << comparedItems.at(1) << endl;
}