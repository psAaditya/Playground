#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s;
  cin>>n>>s;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int sum=0;
  for(int i=0;i<n;i++)
    sum+=a[i];
  if(sum>s)
    cout<<"NO";
  else
    cout<<"YES";
}
