#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,sum=0,i,j;
  cin>>n>>m;
  int a[n][m];
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
      cin>>a[i][j];
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
      if(i+j==m-1 || i==0 || i==n-1)
        sum+=a[i][j];
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}