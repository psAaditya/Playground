#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array \n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array \n";
  for(int i=0;i<n;i++)
    cin>>a[i];
  int co=0,ce=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      ce++;
    else
      co++;
  }
  if(ce==n)
    cout<<"The array is Even";
  else if(co==n)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
}
//#include<iostream>
//using namespace std;
//int main()
//{
  //Type your code here.
