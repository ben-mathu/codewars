#include <bits/stdc++.h>
#include <math.h>

using namespace std;

// Complete the hourglassSum function below.
int hourglassSum(vector<vector<int>> arr) {
    int other = 0;
    int result = INT_MIN;
    int length = 3;

    for (auto i = 1; i <= 4; ++i) {
        for (auto j = 1; j <= 4; ++j) {
            int sum = 0;
            sum += arr.at(i).at(j);
            sum += arr.at(i-1).at(j-1);
            sum += arr.at(i-1).at(j);
            sum += arr.at(i-1).at(j+1);
            sum += arr.at(i+1).at(j-1);
            sum += arr.at(i+1).at(j);
            sum += arr.at(i+1).at(j+1);
            cout << sum << endl;
            
            result = max(sum, result);
        }
    }

    return result;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    vector<vector<int>> arr(6);
    for (int i = 0; i < 6; i++) {
        arr[i].resize(6);

        for (int j = 0; j < 6; j++) {
            cin >> arr[i][j];
        }

        cin.ignore(numeric_limits<streamsize>::max(), '\n');
    }

    int result = hourglassSum(arr);

    fout << result << "\n";

    fout.close();

    return 0;
}
