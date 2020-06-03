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
  int sr[r];
  int sc[c];
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  {
    int sum=0;
    for(j=0;j<c;j++)
    {
      sum+=a[i][j];
    }
    sr[i]=sum;
    cout<<sum<<" ";
  }
  int max=0,maxid=0;
  for(i=0;i<r;i++)
  {
    if(sr[i]>max)
    {
      maxid=i+1;
      max=sr[i];
    }
  }
  cout<<"\n"<<"Row "<<maxid<<" has maximum sum"<<"\n";
  cout<<"Sum of columns is ";
  for(i=0;i<c;i++)
  {
    int sum=0;
    for(j=0;j<r;j++)
    {
      sum+=a[j][i];
    }
    sc[i]=sum;
    cout<<sum<<" ";
  }
  max=0;
  maxid=0;
  for(i=0;i<c;i++)
  {
    if(sc[i]>max)
    {
      maxid=i+1;
      max=sc[i];
    }
  }
  cout<<"\n"<<"Column "<<maxid<<" has maximum sum"<<"\n";
}