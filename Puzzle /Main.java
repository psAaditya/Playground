#include<iostream>
using namespace std;
int main()
{
   int r,c,i,j;
  cin>>r>>c;
  int s[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>s[i][j];
  int s_transpose[c][r];
   for(i=0;i<c;i++)
    for(j=0;j<r;j++)
      s_transpose[i][j]=s[j][i];
   for(i=0;i<c;i++)
   {
    for(j=0;j<r;j++)
    {
      cout<<s_transpose[i][j]<<" ";
    }
     cout<<"\n";
   }  // Type your code here
}