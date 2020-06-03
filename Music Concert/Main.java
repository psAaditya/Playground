#include<iostream>
using namespace std;
#include<cstdlib>
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
  int e=0,o=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      e++;
    else
      o++;
  }
  cout<<o<<endl<<e;
  int  *ev, *od;
  ev=(int*)malloc(e*sizeof(int));
  od=(int*)malloc(o*sizeof(int));
  return 0;
}