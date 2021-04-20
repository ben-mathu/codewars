#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

void solve(int t) {
    int n;
    // Read the number of items, n
    cin >> n;
    
    // variable to store items
    vector<int> a(n);
    int cost = 0;

    // read the elements and store in vector
    for (int& x: a) {
        cin >> x;
        x--;
    }


    for (int i = 0; i < n; i++) {
        int j = i;
        while (a[j] != i) j++;
        cost += (j-i+1);
        reverse(a.begin() + i, a.begin() + j + 1);
    }
    cout << "Case #" << t << ": ";
	cout << (cost-1) << '\n';
}

int main() {
    int t = 0;
    cin >> t;
    for (int i = 1; i <= t; i++) solve(t);
}
