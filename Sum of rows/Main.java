#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  for(i=0;i<r;i++)
  {
    int sum=0;
    for(j=0;j<c;j++)
    {
      sum+=a[i][j];
    }
    cout<<sum<<"\n";
  }     
}