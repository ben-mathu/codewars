#include <bits/stdc++.h>

using namespace std;

class HIndex
{
public:
    int cheat(vector<int> realCitations, int budget, int citationPrice);
    HIndex(/* args */);
    ~HIndex();
};

int HIndex::cheat(vector<int> realCitations, int budget, int citationPrice) {
    int numberOfFakeCitations = budget / citationPrice;

    sort(realCitations.begin(), realCitations.end());

    int citedPapers = 0;
    int leastCited = 0;
    for (auto i = realCitations.begin(); i < realCitations.end(); ++i) {
        if (leastCited < *i) {
            leastCited = *i;
        }

        if (*i != 0 && *i > leastCited) {
            ++citedPapers;
        } else {
            --citedPapers
        }
    }

    int hIndex = 0;
    for (auto i = realCitations.begin(); i < realCitations.end(); ++i) {
        if (citedPapers <= *i) {
            ++hIndex;
        }
    }

    if (numberOfFakeCitations > 0) {
        for (auto i = 0; i < realCitations.size(); ++i) {
            int completeCitations = numberOfFakeCitations / i;
            if (completeCitations )
        }
    }

    return hIndex;
}

HIndex::HIndex(/* args */)
{
}

HIndex::~HIndex()
{
}

int main(int argc, char const *argv[])
{
    HIndex hindex;
    vector<int> value;
    value.push_back(0);
    value.push_back(0);
    value.push_back(0);
    value.push_back(2);
    value.push_back(0);
    value.push_back(0);
    value.push_back(1);
    value.push_back(0);
    value.push_back(0);
    value.push_back(0);
    value.push_back(0);
    value.push_back(0);
    value.push_back(0);
    value.push_back(0);
    cout << hindex.cheat(value, 140000, 10000) << endl;
    return 0;
}

