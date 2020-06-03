#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,m,n;
  cin>>m>>n;
 // cout<<"juxsja";
  int a[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      cin >> a[i][j];
    }
  }
  //cout<<"\n sdhguad";
  //cout<<a[2][3];
  for(int i=0;i<m;i++)
  {
    int mx=0;
    for(int j=0;j<n;j++)
    {
      if(a[i][j]>mx)
      {
        mx=a[i][j];
      }
    }
    cout << mx << "\n";
  }
}