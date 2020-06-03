#include<iostream>
using namespace std;
int main()
{
  int i,j,m,sum=0,sum1=0;
  cin>>m;
  int a[m][m];
  for(i=0;i<m;i++)
    for(j=0;j<m;j++)
      cin>>a[i][j];
  for(i=0;i<m;i++)
    for(j=0;j<m;j++)
      if(i==j)
        sum+=a[i][j];
  for(i=0;i<m;i++)
    for(j=0;j<m;j++)
      if(i+j+1==m)
        sum1+=a[i][j];
  if(sum==sum1)
    cout<<"Yes";
  else
    cout<<"No";
}