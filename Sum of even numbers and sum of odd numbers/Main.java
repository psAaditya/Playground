#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int s_odd=0,s_even=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      s_even+=a[i];
    else
      s_odd+=a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<s_even<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<s_odd;
}
