#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int m1[r][c],m2[r][c];
  //m1:
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>m1[i][j];
  //m2:
   for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>m2[i][j];
  int res[r][c];
   for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      res[i][j]=m1[i][j]+m2[i][j];
   for(i=0;i<r;i++)
   {
    for(j=0;j<c;j++)
    {
      cout<<res[i][j]<<" ";
    }
     cout<<"\n";
   }
    // Type your code here
}