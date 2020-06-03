#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  int count=0;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int sum=0;
  for(int i=0;i<n;i++)
    sum+=a[i];
  if(n==1 && m==2)
    cout<<"1";
  else
    cout<<(sum/m)+1;
}