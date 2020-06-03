#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int marks[n];
  for(int i=0;i<n;i++)
    cin>>marks[i];
  int max=marks[0];
  int i=0;
  while(i<n){
    if(marks[i]>max)
      max=marks[i];
    i++;
  }
  cout<<max;
}