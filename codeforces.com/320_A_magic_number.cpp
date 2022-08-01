#include <iostream>

using namespace std;
 

void solve() {
    string s;
    cin >> s;
    int i = 0;
    while (i < s.length()) {
        if (s[i] == '1') {
            if (i+2 < s.length() && s[i+1] == '4' && s[i+2] == '4') {
                i+=3;
            } else if (i+1 < s.length() && s[i+1] == '4') {
                i+=2;
            } else {
                i++;
            }
        } else {
            cout << "NO" << "\n";
            break;
        }
    }
    if (i == s.length()) cout << "YES" << "\n";
}

// https://codeforces.com/problemset/problem/320/A
int main() {
    
    solve();

}