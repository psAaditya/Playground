#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<"\n";
  for(int i=0;i<n;i++)
    cin>>a[i];
  int loc;
  cout<<"Enter the location where you wish to insert an element"<<"\n";
  cin>>loc;
  if(loc>n)
    cout<<"Invalid Input";
  else
  {
  int data;
  cout<<"Enter the value to insert \n";
  cin>>data;
  for(int i=n;i>(loc-1);i--)
  {
    a[i]=a[i-1];
  }
  a[loc-1]=data;
  cout<<"Array after insertion is"<<"\n";
  for(int i=0;i<=n;i++)
    cout<<a[i]<<"\n";
  } 
}
