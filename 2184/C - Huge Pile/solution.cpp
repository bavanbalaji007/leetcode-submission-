#include <bits/stdc++.h>
using namespace std;
#define ll long long int
void solve(){
    int n,target;
    cin>>n>>target;
    int high=n,low=n,itr=0;
    while(high>=target||low>=target){
        if(high==target||low==target){
            cout<<itr<<"
";
            return;
        }
        itr++;
        low=low/2;
        high=(high+1)/2;
        
    }
    cout<<-1<<"
";
    
}
int main(){
    int tc;
    cin>>tc;
    while(tc-->0) solve();
}