#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int st[m][n];
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
      cin>>st[i][j];
  int max=0;
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(st[i][j]>max)
        max=st[i][j];
    }
  }
  cout<<"The maximum element is "<<max;
}