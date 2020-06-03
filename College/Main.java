#include<iostream>
using namespace std;
struct college
{
  char name[100];
  char city[100];
  int yr;
  float per;
};
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of colleges"<<"\n";
  cin>>n;
  struct college c[n];
  for(int i=1;i<=n;i++)
  {
    cout<<"Enter the details of college "<<i<<"\n";
    cout<<"Enter name"<<"\n";
    cin>>c[i-1].name;
    cout<<"Enter city"<<"\n";
    cin>>c[i-1].city;
    cout<<"Enter year of establishment"<<"\n";
    cin>>c[i-1].yr;
    cout<<"Enter pass percentage"<<"\n";
    cin>>c[i-1].per;
  }
  cout<<"Details of colleges"<<"\n";
  for(int i=1;i<=n;i++)
  {
    cout<<"College:"<<i<<"\n";
    cout<<"Name:"<<c[i-1].name<<"\n";
    cout<<"City:"<<c[i-1].city<<"\n";
    cout<<"Year of establishment:"<<c[i-1].yr<<"\n";
    cout<<"Pass percentage:"<<c[i-1].per<<"\n";
  }
}