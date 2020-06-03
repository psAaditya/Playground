#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int r;
  cin>>r;
  int f=0;
  for(int i=0;i<n;i++)
  {
    if(r==a[i])
    {
      f=1;
      break;
    }
  }
  if(f==1)
  {
    cout<<"She passed her exam";
  }
  else 
  {
    cout<<"She failed";
  }
}