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
  for(int i=0;i<n;i++)
  {
    int mx=a[0][i];
    for(int j=1;j<m;j++)
    {
      if(a[j][i]>mx)
      {
        mx=a[j][i];
      }
    }
    cout << mx << "\n";
  }
}