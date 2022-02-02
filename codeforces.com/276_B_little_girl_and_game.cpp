#include <iostream>
#include <map>

using namespace std;


void solve() {
    string s;
    cin >> s;

    map<char,int> counter;
    for (auto& c: s) {
        counter[c]++;
    }

    int odd = 0;
    for (auto pair : counter) {
        if (pair.second % 2 != 0) {
            odd++;
        }
    }

    if (odd % 2 == 1 || odd == 0) {
        cout << "First" << "\n";
    } else {
        cout << "Second" << "\n";
    }
}

// https://codeforces.com/problemset/problem/276/B
int main() {
    solve();
}