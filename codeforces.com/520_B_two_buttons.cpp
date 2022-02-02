#include <iostream>

using namespace std;


void solve() {
    int n,m;
    cin >> n >> m;

    int res = 0;

    while (n != m) {
        if (n > m) {
            n--;
        } else if (n < m) {
            if (m % 2 == 0) {
                m /= 2;
            } else {
                m++;
            }
        }
        res++;
    }
    cout << res << endl;
}

// https://codeforces.com/problemset/problem/520/B
int main() {
    solve();
}